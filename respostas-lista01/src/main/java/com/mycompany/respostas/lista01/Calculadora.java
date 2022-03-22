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
public class Calculadora {

    public static void main(String[] args) {

        Scanner leitorNumero = new Scanner(System.in);

        System.out.println("Entre com um número real");
        Double numero1Digitado = leitorNumero.nextDouble();

        System.out.println("Entre com mais um número real");
        Integer numero2Digitado = leitorNumero.nextInt();

        Double somaResultado = (numero1Digitado + numero2Digitado);

        Double subtracaoResultado = (numero1Digitado - numero2Digitado);

        Double multiplicacaoResultado = (numero1Digitado * numero2Digitado);

        Double divisaoResultado = (numero1Digitado / numero2Digitado);

        System.out.println(String.format("Resultado da soma:\n"
                + "%.1f\n"
                + "Resultado da subtração:\n"
                + "%.1f\n"
                + "Resultado da multiplicação:\n"
                + "%.1f\n"
                + "Resultado da divisão:\n"
                + "%.1f", somaResultado,subtracaoResultado,multiplicacaoResultado,
                divisaoResultado));
    }
}
