/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mahasiswa;
import View.LoginMhs_view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.LoginMhs_view;
import java.awt.event.MouseAdapter;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class CotrollerLoginMhs extends MouseAdapter  implements ActionListener {
//    private LoginMhs_view view;
    private LoginMhs_view gui = new View.LoginMhs_view();
    private Mahasiswa mahasiswa = new Mahasiswa("","","","",' ');
    List<Mahasiswa> find = new ArrayList();
//    private AdminEditProfile view2;
//    private Koneksi kn;
//    private String idAdmin;
    private String user;
    private String pass;
    
public CotrollerLoginMhs(){
    gui.addActionListener(this);
    gui.setVisible(true);
//    view = new LoginMhs_view();
//    view2 = new AdminEditProfile();
//    view.addActionListener(this);
//    view2.addActionListener(this);
//    view.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
         Object source = e.getSource();
        if (source.equals(gui.getBtnLogin())){
            btnLoginActionPerformed();
        }
    
    }
    public void btnLoginActionPerformed(){
        user = gui.getTfUname();
        pass = gui.getTfPass();
        String nama;
        if(user.isEmpty() || pass.isEmpty()){
            gui.showMessage("Masukkan Username dan Password", "Error", 0);
        }else{
            new AddMhs_C();
            gui.setVisible(false);
//            if(kn.cekUserLogin(user, pass)){
//                nama = kn.cariNama(user);
//                idAdmin = kn.cariIdAdmin(user);
//                System.out.println(idAdmin);
//                view.showMessage("Selamat Datang " + nama, "Login Succeded", 1);
//                new AdminHome();
//                view.setVisible(false);
//            } else {
//                view.showMessage("Username Atau Password Salah", "Login Failed", 2);
//            }
                
        }
    }
    
}