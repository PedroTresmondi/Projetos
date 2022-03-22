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
public class Pergunta2 {
        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        
        System.out.println("Por favor digite o seu login: ");
        String loginDigitado = leitor.nextLine();
        
        System.out.println("Por favor digite a sua senha");
        String senhaDigitada = leitor.nextLine();
        
        System.out.println("Digite a quantidade de tentativas"
                + "antes do bloqueio");
        Integer tentativasBloqueio = leitor.nextInt();
        
        System.out.println(String.format("Seu login é %s e sua senha é %s."
                + " Você tem %d tentativas antes de ser bloqueado", loginDigitado, 
                senhaDigitada, tentativasBloqueio.intValue()));


    }
}
