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
public class Pegunta3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu nome");
        String nomeDigitado = leitor.nextLine();
        
        System.out.println("Digite a quantidade de tempo (Em Minutos)"
                + "que você passou se aquecendo");
        
        Integer minutosAquecendo = leitor.nextInt();
        
        System.out.println("Digite a quantidade de tempo (Em Minutos)"
                + "que você passou fazendo"
                + " exercícios aeróbicos (correr, andar, pedalar etc)");
        
        Integer minutosExercicios = leitor.nextInt();
        
        
        System.out.println("Tempo fazendo musculação ");
        Integer minutosMusculacao = leitor.nextInt();
        
        
        
        Integer minutosTotal = (minutosAquecendo + minutosExercicios +
                minutosMusculacao);
       
        Integer calculoCalorias = (minutosAquecendo * 12) + 
                (minutosExercicios * 20) +
                (minutosMusculacao * 25);
           
                System.out.println(String.format("Olá, %s. Você fez um total "
                        + "de %d minutos de exercícios e perdeu "
                        + "cerca de %d calorias", nomeDigitado, minutosTotal,
                        calculoCalorias));
        
    }
}
