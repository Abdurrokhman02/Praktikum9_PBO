/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nilai.alis;

import java.util.ArrayList;

/**
 *
 * @author iwana
 */
public class inputDataNilai {
    ArrayList<mahasiswa>nilaiMahasiswa;
    
    public inputDataNilai(){
        nilaiMahasiswa = new ArrayList();
    }
    
    public void insertData(String NIM, String Nama, String Alamat, String MatKul, String NilaiAkhir){
        mahasiswa mhs = new mahasiswa(NIM, Nama, Alamat, MatKul, NilaiAkhir);
        nilaiMahasiswa.add(mhs);
    }
    
    public ArrayList<mahasiswa>getALL(){
        return nilaiMahasiswa;
    }
    
    public void deleteData(int index){
        nilaiMahasiswa.remove(index);
    }
}
