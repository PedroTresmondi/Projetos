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
public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Por favor, digite o seu nome");
        String nomeDigitado = leitor.nextLine();
        
        System.out.println(String.format("Olá, %s! Qual o ano de seu nascimento?", nomeDigitado));
        Integer dataDigitada = leitor.nextInt();
        
        Integer calculoIdade = (2030 - dataDigitada);
        
        System.out.println(String.format("Em 2030 você terá %d anos",
                calculoIdade));
        
        
    }
}
