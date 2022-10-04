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
public class PRAK103_2110817110007_SeptianDwiAnggoroMochtar {
    public static void main(String[] args) {
        int bil;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan : ");
        bil = keyboard.nextInt();
        
        int i = 5;
        
        do {            
            if (bil % 7 != 0){
                if (i == 5){
                   System.out.print(bil);
                } else {
                    System.out.print(", " + bil);
                }
            }
            
            bil--;
            i--;
        } while (i > 0);
    }
}
