/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_5;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class PRACTICA_5 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        
        int num; 
        Scanner captu = new Scanner(System.in);        
        System.out.println("Introduzca el numero de su escalera: ");
        num = captu.nextInt(); 
        captu.nextLine(); 
        
        for (int i = 1; i<= num; i++) { 
             
            for (int x = 1; x <= i; x++) {
            System.out.print("*");
        
    }
            System.out.println();
        
        
        }
        
        
    }
}
