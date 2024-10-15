/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_acceso_while;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva2_9_ACCESO_WHILE {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        
        
        
        
        String passw="", user=""; 
        Scanner captu = new Scanner(System.in);        
        
        while(!(user.equals("ElMasPitudo") && passw.equals("SoyGay")));{ 
            
        System.out.println("Ingrese usuario: ");
        user = captu.nextLine();
        
        System.out.println("Ingrese contrasena: ");
        passw = captu.nextLine(); 
          
        
        }
        
        
        System.out.println("PROGRAMA PRINCIPAL");
    }
}
