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
public abstract class Dosen extends Orang{
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
   
    public void createKelompokTA(String topik){
        
    }
    
}
