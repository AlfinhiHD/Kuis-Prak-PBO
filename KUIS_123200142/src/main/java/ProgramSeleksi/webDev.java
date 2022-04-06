/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramSeleksi;

/**
 *
 * @author lenovo
 */
public class webDev extends inputNilai implements hitungNilai {
    public webDev (String nama, int nilaiSatu, int nilaiDua, int nilaiTiga){
        super(nama, nilaiSatu, nilaiDua, nilaiTiga);
    }
    
    public void inputTulis(int nilaiSatu) {
        this.nilaiSatu = nilaiSatu;
    }

     public void inputCoding(int nilaiDua) {
        this.nilaiDua = nilaiDua;
    }

     public void inputWawancara(int nilaiTiga) {
        this.nilaiTiga = nilaiTiga;
    }
     
    @Override
    public double nilaiAkhir() {
         return (0.4 * super.nilaiSatu) + (0.35 * super.nilaiDua) + (0.25 * super.nilaiTiga);
    }
    
    @Override
    public String Keterangan() {
        if(this.nilaiAkhir() >= 85) 
            return "LULUS\nSelamat kepada " + this.nama + " telah DITERIMA sebagai Web Developer\n";
        else 
            return "GAGAL\nMohon maaf kepada  " + this.nama + " telah DITOLAK sebagai Web Developer\n";
    }
}
