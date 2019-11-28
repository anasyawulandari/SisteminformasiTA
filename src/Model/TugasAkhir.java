/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class TugasAkhir {

    private List<Dosen> pembimbing;
    private String kk;
    private String judulTA;
    private boolean dilihat=false;
    private boolean acc=false;

//    private int jumDosen = 0; 
//    private Dosen dosenPembimbing;


    public TugasAkhir(String kk, String judulTA) {
        this.kk = kk;
        this.judulTA = judulTA;
    }
    public boolean isDilihat() {
        return dilihat;
    }

    public void setDilihat(boolean dilihat) {
        this.dilihat = dilihat;
    }

    public boolean isAcc() {
        return acc;
    }

    public void setAcc(boolean acc) {
        this.acc = acc;
    }
    

//    akan menambahkan pembimbing berdasarkan object Dosen dalam parameter
//    i berperan sebagai index, apakah dosen pembimbing 1 atau 2
    public void setPembimbing(Dosen d, int i) {
        this.pembimbing.add(i, d);
    }

    
    
    

}
