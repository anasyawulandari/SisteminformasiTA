/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.addMhs_view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ASUS
 */
public class Mahasiswa_C implements ActionListener{
        private addMhs_view view;

    public Mahasiswa_C() {
        view = new addMhs_view();
        view.setVisible(true);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

    }
    
}
