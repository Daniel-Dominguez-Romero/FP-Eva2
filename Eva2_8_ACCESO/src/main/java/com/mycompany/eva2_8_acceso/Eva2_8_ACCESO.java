/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_acceso;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Eva2_8_ACCESO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //PANTALLA DE VALIDACION: USUARIO Y CONTRASENA 
        
        //PROGRAMA PRINCIPAL 
        
        
        String passw, user; 
        
        
        Scanner captu = new Scanner(System.in);        
        
        do { 
            
        System.out.println("Ingrese usuario: ");
        user = captu.nextLine();
        
        System.out.println("Ingrese contrasena: ");
        passw = captu.nextLine(); 
          }while(!(user.equals("ElMasPitudo") && passw.equals("SoyGay"))); 
        
        
        
        
        System.out.println("PROGRAMA PRINCIPAL");
        
        
        
        
        
    }
}
