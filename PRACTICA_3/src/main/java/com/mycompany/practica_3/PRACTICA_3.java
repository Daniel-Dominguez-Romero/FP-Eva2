/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_3;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class PRACTICA_3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        String text; 
        Scanner captu = new Scanner(System.in);   
        
        System.out.println("Introduzca el texto: ");
        text = captu.nextLine(); 
        
        for (int i = 0; i < text.length(); i ++) { 
            System.out.println(text.charAt(i));
            
        }
    }
}
