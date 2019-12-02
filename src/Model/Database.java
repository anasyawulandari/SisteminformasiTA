/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

//import Model.Mahasiswa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Controller.*;
import Model.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author ASUS
 */
public class Database {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
    private ArrayList<Dosen> dosen = new ArrayList<>();
    public Database() {
//        connect();
        loadMahasiswa();
        loadDosen();
    } 
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/db_sisfota";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
// MAHASISWA //    
    public void loadMahasiswa() {
        connect();
        try {
            String query = "SELECT * FROM mahasiswa";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                mahasiswa.add(new Mahasiswa(rs.getString("nim"), rs.getString("nama"),rs.getString("pass"), rs.getString("jurusan"), rs.getString("jk").charAt(0)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public ArrayList<Mahasiswa> getMahasiswa() {
        return mahasiswa;
    }
    
    public void addMahasiswa(Mahasiswa m) {
        connect();
        String query = "INSERT INTO mahasiswa VALUES (";
        query += "'" + m.getNim() + "',";
        query += "'" + m.getNama() + "',";
        query += "'" + m.getJurusan() + "',";
        query += "'" + m.getJk() + "'";
        query += ")";
        if (manipulate(query)) mahasiswa.add(m);
        disconnect();
    }
     
    public boolean cekDuplikatNIM(String nim){
        boolean cek = false;
        for (Mahasiswa mhs : mahasiswa) {
            if (mhs.getNim().equals(nim)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public void delMahasiswa(String nim) {
        connect();
        String query = "DELETE FROM mahasiswa WHERE nim='" + nim + "'";
        if (manipulate(query)){
            for (Mahasiswa mhs : mahasiswa) {
                if (mhs.getNim().equals(nim)){
                    mahasiswa.remove(mhs);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void updateMahasiswa(Mahasiswa m) {
        connect();
        String query = "UPDATE mahasiswa SET";
        query += " nama='" + m.getNama() + "',";
        query += " jurusan='" + m.getJurusan() + "',";
        query += " jk='" + m.getJk() + "'";
        query += " WHERE nim='" + m.getNim() + "'";
        if (manipulate(query)){
            for (Mahasiswa mhs : mahasiswa) {
                if (mhs.getNim().equals(m.getNim())){
                    mhs.setNama(m.getNama());
                    mhs.setJurusan(m.getJurusan());
                    mhs.setJk(m.getJk());
                    break;
                }
            }
        }
        disconnect();
    }
    
     public boolean cekUserLogin(String u, String p){
        boolean cek = false;
        for (Mahasiswa m : mahasiswa) {
            if (m.getNama().equals(u) && m.getPass().equals(p)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    public String cariNama(String u){
        String nama = null;
        for(Mahasiswa m : mahasiswa){
            if (m.getNama().equals(u)) {
                nama = m.getNama();
            }
        } return nama;
    }
 
 // DOSEN //   
    
     public void loadDosen() {
        connect();
        try {
            String query = "SELECT * FROM dosen";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                dosen.add(new Dosen(rs.getString("nidn"), rs.getString("kodedosen"), rs.getString("nama"), rs.getString("pass"), rs.getString("topik")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
     
    public ArrayList<Dosen> getDosen() {
        return dosen;
    }
    
    public void addDosen(Dosen d) {
        connect();
        String query = "INSERT INTO dosen VALUES (";
        query += "'" + d.getNama() + "',";
        query += "'" + d.getNidn() + "',";
        query += "'" + d.getPassDosen()+ "',";
        query += "'" + d.getTopik()+ "'";
        query += "'" + d.getKodedosen()+ "'";
        query += ")";
        if (manipulate(query)) dosen.add(d);
        disconnect();
    }
    
//    public void delDosen(String nidn) {
//        connect();
//        String query = "DELETE FROM dosen WHERE nim='" + nim + "'";
//        if (manipulate(query)){
//            for (Mahasiswa mhs : mahasiswa) {
//                if (mhs.getNim().equals(nim)){
//                    mahasiswa.remove(mhs);
//                    break;
//                }
//            }
//        }
//        disconnect();
//    }
      
    public String cariNamaDosen(String u){
        String nama = null;
        for(Dosen d : dosen){
            if (d.getNama().equals(u)) {
                nama = d.getNama();
            }
        } return nama;
    }
    public boolean cekUserDosenLogin(String u, String p){
        boolean cek = false;
        System.out.println("MASUK");
        for (Dosen d : dosen) {
            if (d.getNama().equals(u) && d.getPassDosen().equals(p)){
                cek = true;
                break;
            }
        }
        return cek;
    }
       

}
