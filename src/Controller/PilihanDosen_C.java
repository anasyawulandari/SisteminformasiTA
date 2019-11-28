/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.ApprovalDosenKelasTA;
import View.PilihanDosen_view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author user
 */
public class PilihanDosen_C implements ActionListener{
    private PilihanDosen_view view;

    public PilihanDosen_C() {
        view = new PilihanDosen_view();
        view.setBtnApprovalDosenKelasTA(this);
        view.setBtnDosenPilihKelasTA(this);
        view.setVisible(true);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnDosenPilihKelasTA())) {
            btnDosenPilihKelasTAActionPerformed();
            System.out.println("INI DIKLIK");
        } else{
            btnApprovalDosenKelasTAActionPerformed();
            System.out.println("asyikk masuk");
        }
    
    }
    
    public void btnDosenPilihKelasTAActionPerformed(){
         new Dosen_C(); 
    }
    
    public void btnApprovalDosenKelasTAActionPerformed(){
         new Approval_C();   
    }

    
    
}
