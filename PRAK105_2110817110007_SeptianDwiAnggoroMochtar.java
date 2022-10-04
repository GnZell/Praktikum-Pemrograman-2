/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author asus
 */
public class PRAK105_2110817110007_SeptianDwiAnggoroMochtar {
    public static void main(String[] args) {
        double tinggi, jari2, hasil;
        
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        
        System.out.print("Masukkan jari-jari : ");
        jari2 = keyboard.nextDouble();
        
        System.out.print("Masukkan tinggi : ");
        tinggi = keyboard.nextDouble();
        
        hasil = 3.14 * jari2 * jari2 * tinggi;
        
        System.out.println("Volume tabung dengan jari-jari " + jari2 + " cm ");
        System.out.println("dan tinggi " + tinggi + " cm ");
        System.out.println("adalah " + df.format(hasil) + " m3");
    }
}
