/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nilai.alis;

/**
 *
 * @author iwana
 */
public class mahasiswa {
    private String NIM, Nama, Alamat, MatKul, NilaiAkhir;
    
    public mahasiswa(String NIM, String Nama, String Alamat, String MatKul, String NilaiAkhir){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.MatKul = MatKul;
        this.NilaiAkhir = NilaiAkhir;
    }
    
    public String getAlamat(){
        return Alamat;
    }
    
    public String getNIM(){
        return NIM;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public String getMatKul(){
        return MatKul;
    }
    
    public String getNilaiAkhir(){
        return NilaiAkhir;
    }
}
