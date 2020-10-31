/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan17.programtunjangan;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PENGHITUNGAN TUNJANGAN
 */

public class PBOIF210119047Latihan17ProgramTunjangan {
    
    //hitung tunjangan
    public static double hitungTunjangan(double gajiPokok, String status){
        
        double tunjangan;
        
        if("Menikah".equals(status)){
            tunjangan = 0.35 * gajiPokok;
        } else {
            tunjangan = 0 ;
        }
        return tunjangan;
    }
    
    //total gaji
    public static double totalGaji(double gajiPokok, String status){
        double total = gajiPokok + hitungTunjangan(gajiPokok, status);
        return total;
    }
    //tampil gaji
    public static void tampilGaji(double gajiPokok, double tunjangan, String status){
        
        System.out.println("");
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok  : Rp " + gajiPokok);
        System.out.println("Tujangan    : Rp " + hitungTunjangan(gajiPokok, status));
        System.out.println("Total Gaji  : Rp " + totalGaji(gajiPokok, status));
        
    }
    //utama
    public static void main(String[] args) {
        
        double gajiPokok;
        double tunjangan = 0;
        String status;
        
        Scanner input =new Scanner(System.in);
        
        System.out.println("===========Program Tunjangan===========");
        System.out.println("Berapa gaji pokok anda perbulan?: Rp. ");
        gajiPokok = input.nextInt();
        System.out.println("Status anda? (Menikah/Belum): ");
        status = input.next();
        //Menampilkan data
        tampilGaji(gajiPokok,tunjangan,status);
 
    }
    
}
