/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum1;

import java.util.Scanner;

public class PRAK101_2110817110007_SeptianDwiAnggoroMochtar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Input
        String nama, tempat, bulanlahir;
        int tanggal, bulan, tahun, tinggi;
        float berat;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap : ");
        nama = keyboard.nextLine();

        System.out.print("Masukkan Tempat Lahir : ");
        tempat = keyboard.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir : ");
        tanggal = keyboard.nextInt();
        
        System.out.print("Masukkan Bulan Lahir : ");
        bulan = keyboard.nextInt();
        
        System.out.print("Masukkan Tahun Lahir : ");
        tahun = keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi Badan : ");
        tinggi = keyboard.nextInt();
        
        System.out.print("Masukkan Berat Badan : ");
        berat = keyboard.nextFloat();
        
        switch (bulan) {
            case 1:
                bulanlahir = "Januari";
                break;
            case 2:
                bulanlahir = "Februari";
                break;
            case 3:
                bulanlahir = "Maret";
                break;
            case 4:
                bulanlahir = "April";
                break;
            case 5:
                bulanlahir = "Mei";
                break;
            case 6:
                bulanlahir = "Juni";
                break;
            case 7:
                bulanlahir = "Juli";
                break;
            case 8:
                bulanlahir = "Agustus";
                break;
            case 9:
                bulanlahir = "September";
                break;
            case 10:
                bulanlahir = "Oktober";
                break;
            case 11:
                bulanlahir = "November";
                break;
            case 12:
                bulanlahir = "Desember";
                break;
            default:
                throw new AssertionError();
        }
        
        System.out.println("Data telah ditambahkan,");
        System.out.print("Nama Lengkap " + nama);
        System.out.print(", Lahir di " + tempat);
        System.out.println(" pada Tanggal " + tanggal + " " + bulanlahir + " " + tahun);
        System.out.print("Tinggi Badan " + tinggi + " cm ");
        System.out.println("dan Berat Badan " + berat + " Kilogram");
    }
    
}
