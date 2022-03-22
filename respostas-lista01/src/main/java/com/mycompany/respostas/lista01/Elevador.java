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
public class Elevador {

    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);

        System.out.println("Entre com o limite de peso do elevador (número real)");
        Integer limitePeso = leitorNumero.nextInt();

        System.out.println("Entre com o limite de pessoas permitidas no elevador");
        Integer limiteQuantidade = leitorNumero.nextInt();

        System.out.println("Entre com o peso da  1ª pessoa que entrou no elevador");
        Double pessoa1 = leitorNumero.nextDouble();

        System.out.println("Entre com o peso da  2ª pessoa que entrou no elevador");
        Double pessoa2 = leitorNumero.nextDouble();

        System.out.println("Entre com o peso da  3ª pessoa que entrou no elevador");
        Double pessoa3 = leitorNumero.nextDouble();

        Double pesoTotal = (pessoa1 + pessoa2 + pessoa3);
        
        System.out.println(String.format("\"Entraram 3 pessoas no elevador, "
                + "no qual cabem %d pessoas.\n"
                + "O peso total no elevador é de %.2f, sendo que ele suporta %d."
                , limiteQuantidade, pesoTotal, limitePeso ));
    }
}
