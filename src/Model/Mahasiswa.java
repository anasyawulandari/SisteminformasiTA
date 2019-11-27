/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Mahasiswa extends Orang{
    private String nim;
    private String jurusan;
    private char jk;
    private String pass;
    TugasAkhir tugasAkhir;

    public Mahasiswa(String nim, String nama, String pass, String jurusan, char jk) {
        super(nama);
        this.nim = nim;
        this.pass = pass;
        this.jurusan = jurusan;
        this.jk = jk;
    }
    
    public String getPass() {
        return pass;
    }
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public char getJk() {
        return jk;
    }

    public void setJk(char jk) {
        this.jk = jk;
    }
    public void createTA(String kk, String judulTA){
        this.tugasAkhir = new TugasAkhir(kk,judulTA);
    }
    
//    public List<Mahasiswa> getAllMahasiswa() throws SQLException
//    {
//        List<Mahasiswa> Mahasiswa = new ArrayList();
//        Database db = new Database();
//        db.Connect();
//        String query = "SELECT * FROM `Mahasiswa`";
//        
//        db.setRs(query);
//        if(!db.isRsEmpty(db.getRs()))
//        {
//            ResultSet rs = db.getRs();
//            while(db.getRs().next())
//            {
//                Mahasiswa p = new Panitia(rs.getString("Nama Panitia"),
//                        rs.getString("Username"),
//                        rs.getString("Password"));
//                panitia.add(p);
//            }
//        }
//        else
//        {
//            System.out.println("DATABASE KOSONG");
//        }
//        return panitia;
//    }
// 
}
