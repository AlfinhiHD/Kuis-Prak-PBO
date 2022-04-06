/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgramSeleksi;
import java.util.Scanner;


/**
 *
 * @author lenovo
 */
    
 public class Main {

    public static void main(String[] args) {
     try{
           int ulang = 0;
       
           Scanner input = new Scanner(System.in);
       
       do {
           
        System.out.println("");
        System.out.println("FORM PENDAFTARAN PT.UDIN");
        System.out.println(" 1. Android Development");
        System.out.println(" 2. Web Development");
        System.out.println(" Pilih Jenis Form : ");
        int pilih = input.nextInt();
        
        
        if (pilih == 1){
            
            System.out.println("---FORM PENDAFTARAN---");
            System.out.println("------DATA DIRI------");
            System.out.println(" Input NIK : ");
            String nik = input.next();
            input.nextLine();
            System.out.println(" Input Nama :");
            String nama = input.nextLine();

            System.out.println("--------PENILAIAN------");
            System.out.println("Keterangan: Rentang nilai 0-100");

            
            //android dev
            System.out.println("Input Nilai Tes Tulis : ");
            int nilaiSatu = input.nextInt();
            System.out.println("Input Nilai Tes Coding : ");
            int nilaiDua = input.nextInt();
            System.out.println("Input Nilai Tes Wawancara : ");
            int nilaiTiga = input.nextInt();
            androidDev androidDev = new androidDev(nama,nilaiSatu,nilaiDua,nilaiDua);
           OUTER:
           do {
               System.out.println("=== MENU ===");
               System.out.println(" 1. Edit Data Nilai");
               System.out.println(" 2. Tampilkan Hasil");
               System.out.println(" 3. Exit");
               System.out.println(" Pilih : ");
               int Menu = input.nextInt();
               switch (Menu) {
                   case 1 -> {
                       System.out.println("Input Nilai Tes Tulis : ");
                       androidDev.inputNilaiSatu(input.nextInt());
                       System.out.println("Input Nilai Tes Coding : ");
                       androidDev.inputNilaiDua(input.nextInt());
                       System.out.println("Input Nilai Tes Wawancara : ");
                       androidDev.inputNilaiTiga(input.nextInt());
                    }
                   case 2 -> {
                       System.out.println("Nilai Akhir : " + androidDev.NilaiTotal());
                       System.out.println("Keterangan : " + androidDev.Keterangan());
                    }
                   default -> {
                           System.out.println("Program Selesai");
                           break OUTER;
                    }
               }
           } while (true);
        }
        
        else if (pilih == 2){
            
            System.out.println("---FORM PENDAFTARAN---");
            System.out.println("------DATA DIRI------");
            System.out.println(" Input NIK : ");
            String nik = input.next();
            input.nextLine();
            System.out.println(" Input Nama :");
            String nama = input.nextLine();

            System.out.println("--------PENILAIAN------");
            System.out.println("Keterangan: Rentang nilai 0-100");
        
            
            //web dev
            System.out.println("Input Nilai Tes Tulis : ");
            int nilaiSatu= input.nextInt();
            System.out.println("Input Nilai Tes Coding : ");
            int nilaiDua = input.nextInt();
            System.out.println("Input Nilai Tes Wawancara : ");
            int nilaiTiga = input.nextInt();
            webDev webDev = new webDev(nama,nilaiSatu,nilaiDua,nilaiDua);
           OUTER_1:
           do {
               System.out.println("=== MENU ===");
               System.out.println(" 1. Edit Data Nilai");
               System.out.println(" 2. Tampilkan Hasil");
               System.out.println(" . Exit");
               System.out.println(" Pilih : ");
               int Menu = input.nextInt();
               switch (Menu) {
                   case 1 -> {
                       System.out.println("Input Nilai Tes Tulis : ");
                       webDev.inputNilaiSatu(input.nextInt());
                       System.out.println("Input Nilai Tes Coding : ");
                       webDev.inputNilaiDua(input.nextInt());
                       System.out.println("Input Nilai Tes Wawancara : ");
                       webDev.inputNilaiTiga(input.nextInt());
                    }
                   case 2 -> {
                       System.out.println("Nilai Akhir : " + webDev.NilaiTotal());
                       System.out.println("Keterangan : " + webDev.Keterangan());
                    }
                   default -> {
                           System.out.println("Program Selesai");
                           break OUTER_1;
                    }
               }
           } while (true);
        }
        
        else{
            System.out.println("=== Input SALAH ===");
            System.out.println("(Mohon Input Ulang)");
            ulang = 1;
        }
        } while(ulang == 1);
       }
      catch(Exception error){
         System.out.println("Error karena " +error.getMessage());
      }
    }
 }