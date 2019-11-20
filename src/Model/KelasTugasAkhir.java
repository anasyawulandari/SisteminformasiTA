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
public class KelasTugasAkhir {
    private List<Dosen> timDosen;
    private List<Mahasiswa> daftarMhsTA;
    
    public void addMahasiswa(Mahasiswa m){
        this.daftarMhsTA.add(m);
    }
    public void addDosen(Dosen d){
        this.timDosen.add(d);
    }
}

