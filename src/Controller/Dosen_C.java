/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.DosenKelasTA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author user
 */
public class Dosen_C implements ActionListener{
    private DosenKelasTA view;

    public Dosen_C() {
        view = new DosenKelasTA();
        view.setVisible(true);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

    }

    void view() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
