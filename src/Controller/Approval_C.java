/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ApprovalDosenKelasTA;
import View.DosenKelasTA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author user
 */
public class Approval_C implements ActionListener{
    private ApprovalDosenKelasTA view;

    public Approval_C() {
        view = new ApprovalDosenKelasTA();
        view.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
    }
    
    
}
