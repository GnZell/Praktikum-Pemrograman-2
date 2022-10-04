/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class PRAK104_2110817110007_SeptianDwiAnggoroMochtar {
    public static void main(String[] args) {
        int andi = 0, budi = 0;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Kartu Andi : ");
        int andi1 = keyboard.nextInt();
        int andi2 = keyboard.nextInt();
        int andi3 = keyboard.nextInt();
        
        System.out.println("Kartu Budi : ");
        int budi1 = keyboard.nextInt();
        int budi2 = keyboard.nextInt();
        int budi3 = keyboard.nextInt();
                
        if(andi1 > budi1){
            andi++;
        }else if(andi1 == budi1){
            
        }else{
            budi++;
        }
        
        if(andi2 > budi2){
            andi++;
        }else if(andi2 == budi2){
            
        }else{
            budi++;
        }
        
        if(andi3 > budi3){
            andi++;
        }else if(andi3 == budi3){
            
        }else{
            budi++;
        }
        
        if(andi > budi){
            System.out.println("Andi Menang");
        }else if(andi == budi){
            System.out.println("Seri");
        }else{
            System.out.println("Budi Menang");
        }
     } 
}

