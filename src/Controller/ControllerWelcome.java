/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginDosen_view;
import View.LoginMhs_view;
import View.Welcome_view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JComboBox;
import View.LoginMhs_view;

/**
 *
 * @author ASUS
 */
public class ControllerWelcome implements ActionListener  {
    private Welcome_view view;
//    private NewJFrame v;
    private LoginMhs_view viewLogin;
    private LoginDosen_view loginDosen;
    private JComboBox<String> daftar;
    private Database db;

    public ControllerWelcome() {
//        v = new NewJFrame();
        view = new Welcome_view();
        db = new Database();
        view.addActionListener(this);
        viewLogin = new LoginMhs_view();
        view.setVisible(true);
//        v.setVisible(true);
        loginDosen = new LoginDosen_view();
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnMulai())){
            btnMulaiActionPerformed();
            System.out.println("INI DIKLIK");
    }else{
            
        }
    }
    private void btnMulaiActionPerformed() {
        if(view.getCbDaftar().getSelectedItem() == "Mahasiswa"){
            System.out.println("INI MAHASSISWA");
            viewLogin.setVisible(true);
        }else if (view.getCbDaftar().getSelectedItem() == "Dosen"){
            System.out.println("DOESN BOI");
            loginDosen.setVisible(true);
        }
    }
    
}
