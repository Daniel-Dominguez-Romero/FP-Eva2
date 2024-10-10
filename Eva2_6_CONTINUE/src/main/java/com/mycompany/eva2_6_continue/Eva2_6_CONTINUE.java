/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_continue;

/**
 *
 * @author danie
 */
public class Eva2_6_CONTINUE {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
         for (int i = 1; i <= 10; i++) {
            //CONTINUE --> SE SALTA LA INTERACCION ACTUAL
            if((i % 2) == 0) // NUMERO IMPAR
               continue; //interrumpe la repeticion desde ese punto 
            
            System.out.print(i + " - ");
         }
    }
}
