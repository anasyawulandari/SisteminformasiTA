/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginDosen_view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author user
 */
public class ControllerLoginDsn implements ActionListener{
     private LoginDosen_view view;
     
     private String userDosen;
     private String passDosen;

    public ControllerLoginDsn() {
        view = new LoginDosen_view();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnLoginDosen())){
            btnLoginDosenActionPerformed();
        }
    }
      public void btnLoginDosenActionPerformed(){
        userDosen = view.getTfUnameDosen();
        passDosen = view.getTfPassDosen();
        String nama;
        if(userDosen.isEmpty() || passDosen.isEmpty()){
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
