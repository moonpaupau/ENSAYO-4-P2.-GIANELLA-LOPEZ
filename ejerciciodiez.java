/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ensayo4p2;
import java.util.Scanner;
/**
 *
 * @author Gianella Paulina Lopez Mora
 */
public class ejerciciodiez {

    /**
     * @param args the command line arguments
     */
    public static int mayor(int a, int b){
        int mayor;
        if (a>b){
            mayor = a;
        }else{
            mayor = b;
        }
       return mayor;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 45;
        int b= 60;
        int resultado;
        resultado = mayor(a,b);
        System.out.println("El numero mayor es: " + resultado);
        
    }
    
}
