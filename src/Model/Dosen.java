/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Dosen extends Orang{
    private long nidn;
    private String kodedosen;
    KelasTugasAkhir kelasTA;
    private String topik;

    public Dosen(long nidn, String kodedosen, KelasTugasAkhir kelasTA, String topik, String nama) {
        super(nama);
        this.nidn = nidn;
        this.kodedosen = kodedosen;
        this.kelasTA = kelasTA;
        this.topik = topik;
    }

    public long getNidn() {
        return nidn;
    }

    public void setNidn(long nidn) {
        this.nidn = nidn;
    }

    public String getKodedosen() {
        return kodedosen;
    }

    public void setKodedosen(String kodedosen) {
        this.kodedosen = kodedosen;
    }

    public String getTopik() {
        return topik;
    }

    public void setTopik(String topik) {
        this.topik = topik;
    }
    
  
   
    public void createKelompokTA(String topik){
        
    }
    
}
