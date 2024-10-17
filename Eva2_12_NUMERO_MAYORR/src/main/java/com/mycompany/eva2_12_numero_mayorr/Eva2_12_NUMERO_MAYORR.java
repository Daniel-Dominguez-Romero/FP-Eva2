/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_numero_mayorr;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva2_12_NUMERO_MAYORR {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        

        int num1,num2 = 0; 
        Scanner captu = new Scanner(System.in);        
        
        do {
            System.out.println("Ingresa el numero: ");
            num1 = captu.nextInt(); 
            captu.nextLine(); 
                    if (num1>num2)
                        num2 = num1;
        } while (num1 != -1 ); 
        
        System.out.println(num2);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
