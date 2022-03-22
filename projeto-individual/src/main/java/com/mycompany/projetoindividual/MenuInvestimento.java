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
    public class MenuInvestimento {
        
    public static void main(String[] args) {
        
    Scanner leitor = new Scanner(System.in);
    Metodos met = new Metodos();
 

    //menu
    char sair = 'n';
    Integer escolha;
    String input;
    Double resultadoInvestimento = 0.0;
    Double investimentoIni = 0.0;
    Double resposta = 0.0;
    //menu
    
    //desafio
       Random gerador = new Random();
       String resultado = "", escolha_cpu = "";
       Integer pontos = 0;
        
    //desafio

    //opcao (1)

    Double taxa = 0.076;

    while (sair != 's') {
        System.out.println("=".repeat(71)
                + "\nBem-Vindo ao D7 Investimentos! Onde nosso CDB rende"
                + " 120% de CDI ao ano!\n"
                + "=".repeat(71));
        System.out.println("Digite uma opcao"
                + "\n (1) - Calcular Rendimento"
                + "\n (2) - Descubra os nossos planos pela renda inserida"
                + "\n (3) - Simulacao de ganhos"
                + "\n (4) - Encerrar Menu"
                + "\n (5) - Desafio");
        escolha = leitor.nextInt();

    switch (escolha){
        case 1: 

      System.out.println("Insira a quantidade de dinheiro que deseja investir");
    investimentoIni = leitor.nextDouble();
            System.out.println("Agora entre com a quantidade de tempo (em anos)"
                    + "que deseja");
    Integer ano = leitor.nextInt();

       resposta = met.CalculadorInv(investimentoIni, ano, taxa);
       System.out.println(String.format("Em %s anos rendera: R$%.2f"
        ,ano, resposta));

    resultadoInvestimento = met.resultadoInvestimento(investimentoIni);


     System.out.println("Gostaria de encerrar a sessao? (ao encerrar os dados "
             + "inseridos serão apagados)"
               + "\n (S)- Encerra o programa"
               + "\n (N)- Volta ao menu");
      input = leitor.next().toLowerCase();
      sair = input.charAt(0); 

            break;

        case 2:
             if (investimentoIni > 0) {
          System.out.println(met.SelecaoPlanos(resultadoInvestimento));

            } else {
                System.out.println("Valor nao identificado! Por favor inserir"
                        + "valor de investimento na opcao 1");
            }

     System.out.println("Gostaria de encerrar a sessao? (ao encerrar os dados "
             + "inseridos serão apagados"
               + "\n (S)- Encerra o programa"
               + "\n (N)- Volta ao menu");
      input = leitor.next().toLowerCase();
      sair = input.charAt(0);
            break;

        case 3:
            if (investimentoIni > 0) {
              Double  ganhos = met.investimentoGanho(resposta, investimentoIni);
            System.out.println(String.format("Seu ganho sera de:R$%.2f nesse"
                    + " periodo de tempo" , ganhos));
            } else {
                System.out.println("Valor nao identificado! Por favor inserir"
                        + "valor de investimento na opcao 1");
            }

            System.out.println("Gostaria de encerrar a sessao? (ao encerrar os dados "
             + "inseridos serão apagados"
               + "\n (S)- Encerra o programa"
               + "\n (N)- Volta ao menu");              
      input = leitor.next().toLowerCase();
      sair = input.charAt(0);
            break;
        case 4:
                  System.out.println("Encerrar Menu");
      System.out.println("Gostaria de sair? (S/N)");
      input = leitor.next().toLowerCase();
      sair = input.charAt(0);
      System.out.println("=".repeat(70) + 
              "\n programa finalizado, Obrigado....");
            break;

            case 5: 
                
                System.out.println("=".repeat(71));
                 System.out.println( "Bem vindo ao Jokenpo" 
                        + "\npara jogar digite a sua escolha"
                        + "\n Pedra"
                        + "\n Papel"
                        + "\n Tesoura"
                         + "\n para voltar ao menu digite 'sair'");
                   System.out.println("=".repeat(71));
                  
                met.desafio(resultado, escolha_cpu, leitor, gerador, pontos, sair);
                  
                break;

        default:
          System.out.println("Opcao indisponivel"); 

            }

            }

        }

    }


