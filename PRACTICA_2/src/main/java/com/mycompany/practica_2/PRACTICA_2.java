/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_2;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class PRACTICA_2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int first, second; 
        
        Scanner captu = new Scanner(System.in);       
        System.out.println("Introduce el primer numero: ");
        first = captu.nextInt();
        captu.nextLine(); 
        System.out.println("Introduce el segundo numero: ");
        second = captu.nextInt(); 
        captu.nextLine(); 
        
        
        for (int i = first; i <= second; i ++) { 
            System.out.println(i);
        
        }
        System.out.println("  ");
        for (int i = second; i >= first; i -- ) {
            
            System.out.println(i);
            
        }
    }
}
