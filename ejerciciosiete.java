/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ensayo4p2;
import java.util.Scanner;
/**
 *
 * @author mauro
 */
public class ejerciciosiete {

    /**
     * @param args the command line arguments
     */
    public static double obtenerPI(){
        double pi= 3.1416;
        return pi;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double resultado;
        resultado = obtenerPI();
        System.out.println("El valor de PI es: " + resultado);
    }
    
}
