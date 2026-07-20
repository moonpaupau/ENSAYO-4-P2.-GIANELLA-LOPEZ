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
public class ejercicioocho {

    /**
     * @param args the command line arguments
     */
     public static double CalcularArea(double base, double altura){
     double area = base * altura;
     return area;        
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double base = 6;
        double altura = 8;
        double resultado;
        resultado = CalcularArea(base, altura);
        System.out.println("Area del rectangulo: " + resultado);
        
    }
    
}
