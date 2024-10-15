/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_while_do_while;

/**
 *
 * @author danie
 */
public class Eva2_7_WHILE_DO_WHILE {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        
        //FOR---> Sabemos la cantidad de repeticiones 
        //WHILE --> CERO O MAS repeticiones 
        //DO WHILE --> UNA O MAS repeticiones 
        
        //WHILE 
        System.out.println("WHILE");
        int val = 11; 
        while(val <= 10 ){ //MIENTRAS(ESTO ES VERDAD(REPITE LAS INSTRUCCIONES) 
            System.out.print(val + " - ");
            val++;        
            
        }
        System.out.println("");
        //DO WHILE
        System.out.println("DO WHILE");
        val = 11; 
        do{ 
            System.out.print(val + " - ");
            val++; 
           
            
        }while(val <= 10); //REPETIR(ESTASA INSTRUCCIONES) MIENTRAS(ESTO ES VERDAD) 
        
        
    }
}
