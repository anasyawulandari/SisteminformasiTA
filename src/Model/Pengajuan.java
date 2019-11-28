/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class Pengajuan {
     private List<Mahasiswa> daftarTA;
    
    public Mahasiswa lihatTA(int i){
        return daftarTA.get(i);
    }
    public void ACC(Mahasiswa a){
        a.getTA().setAcc(true);        
    }
}
