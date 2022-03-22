/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.respostas.lista01;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class CalculoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Entre com o seu nome");
        String nomeDigitado = leitor.nextLine();
        
        System.out.println("Entre com a sua primeiro nota");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Entre com a sua segunda nota");
        Double nota2 = leitor.nextDouble();

        Double mediaNota = ((nota1 + nota2) / 2);
        
        
        System.out.println(String.format("Olá, %s. Sua média foi de %.1f", nomeDigitado,mediaNota));
        
    }
}
