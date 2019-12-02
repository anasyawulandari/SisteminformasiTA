/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Dosen;
import Model.Database;
import View.LoginDosen_v;
import View.PilihanDosen_view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
/**
 *
 * @author user
 */
public class ControllerLoginDsn implements ActionListener {

    private LoginDosen_v view;
    private Database db;
    private String userDosen;
    private String passDosen;
    private Dosen model;

    public ControllerLoginDsn() {
        view = new LoginDosen_v();
        view.setVisible(true);
        view.setLoginEvent(this);
        db = new Database();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnLoginDosen())) {
            btnLoginDosenActionPerformed();
        }
    }
    
    public void btnLoginDosenActionPerformed() {
        userDosen = view.getTfUnameDosen();
        passDosen = view.getTfPassDosen();
        System.out.println(userDosen+", "+passDosen);
        System.out.println("masuk action");
        String nama;
        if (userDosen.isEmpty() || passDosen.isEmpty()) {
            view.showMessage("Masukkan Username dan Password", "Error", 0);
        } else {
            if(db.cekUserDosenLogin(userDosen, passDosen)) {
                nama = db.cariNamaDosen(userDosen);
                view.showMessage("Selamat Datang " + nama, "Login Succeded", 1);
                new PilihanDosen_C();
                view.setVisible(false);
            } else {
                view.showMessage("Username Atau Password Salah", "Login Failed", 2);
            }
            }

        }
    
}
