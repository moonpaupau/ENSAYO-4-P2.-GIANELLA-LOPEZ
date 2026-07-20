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
public class ejercicioonce {

    /**
     * @param args the command line arguments
     */
    public static boolean esPar(int numero){
        boolean par;
        if (numero%2==0){
            par=true;
        }else{
            par=false;
        }
        return par;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 12;
        boolean resultado;
        resultado = esPar(numero);
        if(resultado==true){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
}
