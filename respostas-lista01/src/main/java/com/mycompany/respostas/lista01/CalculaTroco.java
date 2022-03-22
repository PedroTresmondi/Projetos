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
public class CalculaTroco {
      public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Por favor inserir o valor unitário do produto");
        Double valorDigitado = leitorNumero.nextDouble();
        
        System.out.println("Digite a quantidade vendida");
        Integer quantidadeDigitada = leitorNumero.nextInt();
        
        System.out.println("Digite o Valor pago pelo cliente");
        Double valorPago = leitorNumero.nextDouble();
          
        Double quantidadeTroco = (valorDigitado * quantidadeDigitada - valorPago);
        
          System.out.println(String.format("Seu troco será de R$%.2f", quantidadeTroco));
        
        
        
        
          
    }
    
}
