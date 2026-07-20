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
public class ejercicionueve {

    /**
     * @param args the command line arguments
     */
    public static double calcularPromedio(double n1, double n2, double n3){
        double promedio= (n1+n2+n3)/3;;
        return promedio;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double n1 = 3.3;
        double n2 = 4.5;
        double n3 = 6.7;
        double promedio;
        
        promedio = calcularPromedio(n1,n2,n3);
        System.out.println("Promedio:" + promedio);
        if (promedio >=7){
            System.out.println("El estudiante aprobó");
        }else{
            System.out.println("El estudiante desaprobó");
        }
        
    }
    
}
