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
public class ejerciciocinco {

    /**
     * @param args the command line arguments
     */
    public static void operaciones(double a, double b){
        double suma;
        double resta;
        double multiplicacion;
        double division;
        suma = a + b;
        resta = a - b;
        multiplicacion = a * b;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        
        if (b != 0){
            division = a/b;
            System.out.println("Division: " + division); 
        }else{
            System.out.println("No se puede dividir entre cero"); 
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        
        a= 2;
        b= 7;
        
        operaciones(a,b);
    }
    
}
