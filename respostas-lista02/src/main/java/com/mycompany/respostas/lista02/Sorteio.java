/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.respostas.lista02;

/**
 *
 * @author pedro
 */
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 100");
        Integer numeroDigitado = leitor.nextInt();
        Integer sorteio = ThreadLocalRandom.current().nextInt(0, 101);
        Integer contador = 0;
        Integer par = 0;
        Integer impar = 0;

        for (Integer i = 0; i < 200; i++) {
            sorteio = ThreadLocalRandom.current().nextInt(0, 101);
            if (numeroDigitado.equals(sorteio) || contador == 0) {
                contador = i + 1;
            }
            if (sorteio % 2 == 0) {
                par++;
            }
            if (sorteio % 2 == 1) {
                impar++;
            }
            System.out.println(sorteio);
        }
        System.out.println(String.format("O numero foi sorteado "
                + "pela primeira vez em: %d\n\n"
                + "Foram sorteados %d numeros pares. \n\n"
                + "Foram sorteados %d numeros impares", contador, par, impar));
    }
}
