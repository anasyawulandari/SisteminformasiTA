/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginMhs_view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.LoginMhs_view;
/**
 *
 * @author ASUS
 */
public class CotrollerLoginMhs implements ActionListener {
    private LoginMhs_view view;
//    private AdminEditProfile view2;
//    private Koneksi kn;
//    private String idAdmin;
    private String user;
    private String pass;
    
public CotrollerLoginMhs(){
    view = new LoginMhs_view();
//    view2 = new AdminEditProfile();
//    view.addActionListener(this);
//    view2.addActionListener(this);
//    view.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
         Object source = e.getSource();
        if (source.equals(view.getBtnLogin())){
            btnLoginActionPerformed();
        }
    
    }
    public void btnLoginActionPerformed(){
        user = view.getTfUname();
        pass = view.getTfPass();
        String nama;
        if(user.isEmpty() || pass.isEmpty()){
            view.showMessage("Masukkan Username dan Password", "Error", 0);
        }else{
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