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
public class Mahasiswa extends Orang{
    private String nim;
    private String jurusan;
    private char jk;
    TugasAkhir tugasAkhir;

    public Mahasiswa(String nim, String nama, String jurusan, char jk) {
        super(nama);
        this.nim = nim;
        this.jurusan = jurusan;
        this.jk = jk;
    }
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public char getJk() {
        return jk;
    }

    public void setJk(char jk) {
        this.jk = jk;
    }
    public void createTA(String kk, String judulTA){
        this.tugasAkhir = new TugasAkhir(kk,judulTA);
    }
 
}
