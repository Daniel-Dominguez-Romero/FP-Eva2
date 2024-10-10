/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_break_continue;

/**
 *
 * @author danie
 */
public class Eva2_5_BREAK_CONTINUE {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        for (int i = 1; i <= 10; i++) {
            //CONTINUE --> SE SALTA LA INTERACCION ACTUAL
            //if(i == 8)
                //continue; //interrumpe la repeticion desde ese punto 
            if (i == 8)
                break; 
            System.out.print(i + " - ");
            
        }
        
        
        
        
    }
}
