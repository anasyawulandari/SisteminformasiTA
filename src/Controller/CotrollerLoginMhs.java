/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mahasiswa;
import View.LoginMhs_view;
import Model.Database;
import View.addMhs_view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class CotrollerLoginMhs implements ActionListener {
    private LoginMhs_view view;
    private Database db;
    
//    private AdminEditProfile view2;
//    private Koneksi kn;
//    private String idAdmin;
    private String user;
    private String pass;
//    private String idmhs;

    public CotrollerLoginMhs() {
        view = new LoginMhs_view();
        db = new Database();
//    view2 = new AdminEditProfile();
        view.addActionListener(this);
//        view.setLoginEvent(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnLogin())) {
            btnLoginActionPerformed();
            System.out.println("masuk action");
        }

    }

    public void btnLoginActionPerformed() {
        user = view.getTfUname();
        pass = view.getTfPass();
        String nama;
        if (user.isEmpty() || pass.isEmpty()) {
            view.showMessage("Masukkan Username dan Password", "Error", 0);
        } else {
            if(db.cekUserLogin(user, pass)){
                nama = db.cariNama(user);
                view.showMessage("Selamat Datang " + nama, "Login Succeded", 1);
//                new addMhs_view();
                  new Mahasiswa_C();
                view.setVisible(false);
            } else {
                view.showMessage("Username Atau Password Salah", "Login Failed", 2);
            }

        }
    }

}
