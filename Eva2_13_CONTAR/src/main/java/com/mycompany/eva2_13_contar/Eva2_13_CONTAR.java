/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_13_contar;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva2_13_CONTAR {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
         String text; 
         int acum; 
         acum = 0;
        Scanner captu = new Scanner(System.in);        
        System.out.println("Introduzca su texto: ");
        text = captu.nextLine(); 
        
        for (int i = 0; i < text.length(); i ++) { 
           
         if (text.charAt(i) == 'a' || 
                 text.charAt(i) == 'e' ||  
                 text.charAt(i) == 'i' ||  
                 text.charAt(i) == 'o' ||  
                 text.charAt(i) == 'u' ||  
                 text.charAt(i) == 'A' ||  
                 text.charAt(i) == 'E' ||  
                 text.charAt(i) == 'I' ||  
                 text.charAt(i) == 'O' ||  
                 text.charAt(i) == 'U') {   
            acum = acum + 1; 
         }
          
         
        }
        
        System.out.println(acum);
            
    }
}
