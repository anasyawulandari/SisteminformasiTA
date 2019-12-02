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
    private String nidn;
    private String kodedosen;
    KelasTugasAkhir kelasTA;
    private String topik;
    private String passDosen;

    public Dosen(String nidn, String kodedosen, String nama, String pass, String topik) {
        super(nama);
        this.nidn = nidn;
        this.passDosen = pass;
        this.kodedosen = kodedosen;
     //   this.kelasTA = kelasTA;
        this.topik = topik;

    }
    
    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
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

    public String getPassDosen() {
        return passDosen;
    }
   
    public void createKelompokTA(String topik){
        
    }
    
}
