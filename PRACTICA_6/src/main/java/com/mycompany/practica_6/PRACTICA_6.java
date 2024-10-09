/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_6;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class PRACTICA_6 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        
         int num; 
        Scanner captu = new Scanner(System.in);        
        System.out.println("Introduzca el numero de su piramide: ");
        num = captu.nextInt(); 
        captu.nextLine(); 
        
        for (int i = 1; i<= num; i++) { 
             
            for (int x = 1; x <= i; x++) {
            System.out.print("*");
        
    }
            System.out.println();
        
        
        }
        
        for (int i = num; i >= 1; i--) { 
            
            for (int x = 1 ; x <=i ; x++) {
                System.out.print("*");
            }
             System.out.println();
            
            
            
            
        }   
        }
}
    

