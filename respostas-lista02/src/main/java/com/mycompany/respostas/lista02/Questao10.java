/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.respostas.lista02;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Questao10 {
    public static void main(String[] args) {
        Scanner leitorVoto = new Scanner(System.in);
        Integer contadorVotos = 0;
        Integer votos = 11;
        Integer votoFavorito = 0;
        Integer votoMussarela = 0;
        Integer votoCalabresa = 0;
        Integer votoQuatroQueijos = 0;

        while (contadorVotos < 10) {

            for (contadorVotos = 0; contadorVotos < 10; contadorVotos++) {
                votos--;
                System.out.println(String.format("Vote na sua pizza favorita "
                        + "\n (Votos necessários : %d)\n"
                        + "Mussarela - Digite 5 \n\n"
                        + "Calabresa - Digite 25 \n\n"
                        + "Quatro queijos - Digite 50 \n\n", votos));
                votoFavorito = leitorVoto.nextInt();

                switch (votoFavorito) {
                    case 5:
                        votoMussarela++;
                        break;
                    case 25:
                        votoCalabresa++;
                        break;
                    case 50:
                        votoQuatroQueijos++;
                        break;
                    default:
                        break;
                }
            }
        }
        String saborFavorito = "";
        if (votoMussarela > votoCalabresa || votoMussarela > votoQuatroQueijos) {
            saborFavorito = "Mussarela";
        } else if (votoCalabresa > votoMussarela || votoCalabresa > votoQuatroQueijos) {
            saborFavorito = "Calabresa";
        } else if (votoQuatroQueijos > votoMussarela || votoQuatroQueijos > votoCalabresa) {
            saborFavorito = "Quatro queijos";
        }
        System.out.println(String.format("Votos de cada sabor : \n"
                + "Mussarela: %d  \n"
                + "Calabresa: %d  \n"
                + "Quatro Queijos: %d \n\n"
                + "O sabor de pizza mais votado foi: %s!",
                votoMussarela, votoCalabresa, votoQuatroQueijos, saborFavorito));
    }
}
