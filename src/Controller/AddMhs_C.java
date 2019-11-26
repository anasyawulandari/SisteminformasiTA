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
 * @author user
 */
public class AddMhs_C implements ActionListener{
    private addMhs_view view;

    public AddMhs_C() {
        view = new addMhs_view();
//        view.addActionListener(this);
//        view.addMouseAdapter(this);
        view.setVisible(true);
    }
     
//    public void loadTable(){
//        DefaultTableModel model = new DefaultTableModel(new String[]{"NIM", "Nama", "Jurusan", "JK"}, 0);
//        ArrayList<Mahasiswa> mahasiswa = db.getMahasiswa();
//        for (Mahasiswa m : mahasiswa) {
//            model.addRow(new Object[]{m.getNim(), m.getNama(), m.getJurusan(), m.getJk()});
//        }
//        view.setTbMahasiswa(model);
//    }

    @Override
    public void actionPerformed(ActionEvent e) {
       Object source = e.getSource();
        if (source.equals(view.getBtnAddDataDMhs())){
//            btnTambahActionPerformed();
//            loadTable();
        }else if (source.equals(view.getBtnRemoveDataDMhs())){
//            btnHapusActionPerformed();
//            loadTable();
        }else if (source.equals(view.getBtnResetDataDMhs())){
//            btnUbahActionPerformed();
//            loadTable();
        }else if (source.equals(view.getBtnEditDataDMhs())){
//            view.reset();
//            loadTable();
        }
    }

}
