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
public class Pergunta1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nomeDigitado = sc.nextLine();

        System.out.println(
                String.format("Olá %s,"
                        + " Digite a quantidade de"
                        + " filhos de 0 a 3 anos", nomeDigitado));
        Integer filhos0a3 = sc.nextInt();

        System.out.println(
                String.format("Ok %s, agora"
                        + " Digite a quantidade de"
                        + " filhos de 4 a 16 anos", nomeDigitado));

        Integer filhos4a16 = sc.nextInt();

        System.out.println(
                String.format("%s, Por fim"
                        + " Digite a quantidade de"
                        + " filhos de 17 a 18 anos", nomeDigitado));

        Integer filhos17a18 = sc.nextInt();
        
        
        Double pagamento0a3 = 25.12;
        Double pagamento4a16 = 15.88;
        Double pagamento17a18 = 12.44;
        
        Double pagamentoTotal = (pagamento0a3 * filhos0a3 + 
                pagamento4a16 * filhos4a16 + pagamento17a18 * filhos17a18);
        
        Integer quantidadeFilhos = (filhos0a3 + filhos4a16 + filhos17a18);
        
        System.out.println(
        String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa",
                quantidadeFilhos, pagamentoTotal));

       
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        Scanner filhos0a3 = new Scanner (System.in);
        Scanner filhos4a16 = new Scanner (System.in);
        Scanner filhos17a18 = new Scanner (System.in);
        
        
        System.out.println(
        String.format("Olá %s, Por favor Insira a quantidade de filhos"
                + "de 0 a 3 anos",nomeUser));
        
        Integer filhos0a3Digitados = filhos0a3.nextInt();
      
         */
    }
}
