/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoindividual;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Metodos {

    Scanner leitor = new Scanner(System.in);

//Opcoes do Menu
    Double resultadoInvestimento(Double investimento) {
        return investimento;
    }

    ;
    

    Double CalculadorInv(Double investimentoIni, Integer ano, Double taxa) {

        Double resultado = (investimentoIni * ano) * taxa;
        return resultado;
    }

    String SelecaoPlanos(Double resultadoInvestimento) {
        if (resultadoInvestimento >= 0 && resultadoInvestimento <= 1500) {
            return "Seu plano de associado: Bronze";
        } else if (resultadoInvestimento > 1500 && resultadoInvestimento <= 2500) {
            return "Seu plano de associado: Silver";
        } else if (resultadoInvestimento > 2500 && resultadoInvestimento <= 4500) {
            return "Seu plano de associado: Gold";
        } else if (resultadoInvestimento > 4500 && resultadoInvestimento <= 5500) {
            return "Seu plano de associado: Platinum";
        } else {
            return "Seu plano de associado: Elite";
        }

    }

    Double investimentoGanho(Double resposta, Double investimentoIni) {

        Double ganho = resposta + investimentoIni;
        return ganho;

    }
    //opcao(5)

    void desafio(String resultado, String escolha_cpu, Scanner teclado
            ,Random gerador, Integer pontos, char sair) {
        
        while (teclado.hasNext()) {
            String escolha = teclado.next(); 
            int aleatorio = gerador.nextInt(100000) % 3; 
         
                if (escolha.equals("sair"))
                    
                break;
                
                if(!escolha.equals("pedra") && (!escolha.equals("papel") &&
                        (!escolha.equals("tesoura")))) {
                    System.out.println("opcao invalida, por favor digite de novo");
                   
            } else {
              switch (aleatorio) {
            case 0:
                escolha_cpu = "tesoura";
                break;
            case 1:
                escolha_cpu = "papel";
                break;
            default:
                escolha_cpu = "pedra";
            }
            

            if (escolha.equals("tesoura")) {
                switch (aleatorio) {
                case 0:
                    resultado = "empate";
                    break;
                case 1:
                    resultado = "voce venceu!";
                    pontos++;
                    break;
                default:
                    resultado = "voce perdeu :(";
                    pontos--;
                }
            }
             

            if (escolha.equals("papel")) {
                switch (aleatorio) {
                case 0:
                    resultado = "voce perdeu :(";
                    pontos--;
                    break;
                case 1:
                    resultado = "empate";
                    break;
                default:
                    resultado = "voce venceu!";
                    pontos++;
                }
                
                
            } 

            if (escolha.equals("pedra")) {
                switch (aleatorio) {
                case 0:
                    resultado = "voce venceu!";
                    pontos++;
                    break;
                case 1:
                    resultado = "voce perdeu :(";
                    pontos--;
                    break;
                default:
                    resultado = "empate";
                }
                
                } 
                    System.out.println(String.format("%s VS %s: %S "
                    + "\n Pontos: %d"
                    , escolha, escolha_cpu, resultado, pontos));
            }      
            }
                
            
           
        }
       
        }

    
