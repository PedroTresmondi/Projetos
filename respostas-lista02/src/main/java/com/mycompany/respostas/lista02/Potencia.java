/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.respostas.lista02;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Potencia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com o valor da base");
        Integer valorBase = leitor.nextInt();
        
        System.out.println("Entre com o expoente");
        Integer valorExpoente = leitor.nextInt();
        
        int potencia = valorExpoente;
        int resultado = 1;
       
        while (potencia != 0) {
            resultado = resultado * valorBase;
          
            potencia--;
        }
        System.out.println("Resultado =  " + resultado);
    }
}
