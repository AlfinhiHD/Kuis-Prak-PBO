/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramSeleksi;

/**
 *
 * @author lenovo
 */
public class androidDev extends inputNilai implements hitungNilai {
    public androidDev (String nama, int nilaiSatu, int nilaiDua, int nilaiTiga){
        super(nama, nilaiSatu, nilaiDua, nilaiTiga);
    }
    
    public void inputNilaiSatu(int nilaiSatu) {
        this.nilaiSatu = nilaiSatu;
    }

     public void inputNilaiDua(int coding) {
        this.nilaiDua = nilaiDua;
    }

     public void inputNilaiTiga(int nilaiTiga) {
        this.nilaiTiga = nilaiTiga;
    }
     
    @Override
    public double NilaiTotal() {
         return (0.2 * super.nilaiSatu) + (0.5 * super.nilaiDua) + (0.3 * super.nilaiTiga);
    }
    
    @Override
    public String Keterangan() {
        if(this.NilaiTotal() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Android Developer\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " telah DITOLAK sebagai Android Developer\n";
    }
}
