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
public class ejercicioseis {

    /**
     * @param args the command line arguments
     */
    public static int obtenerNumero(){
        int numero;
        numero = (int) (Math.random()*100)+1;
        return numero;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int resultado;
        resultado =  obtenerNumero();
        System.out.println("Numero aleatorio: " + resultado);
    }
    
}
