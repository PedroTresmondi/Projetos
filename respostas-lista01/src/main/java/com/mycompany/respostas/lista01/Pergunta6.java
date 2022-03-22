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
public class Pergunta6 {
    public static void main(String[] args) {
        
        Scanner leitorNumero = new Scanner(System.in);
        
        System.out.println("Digite o seu salário bruto");
        Double salarioBruto = leitorNumero.nextDouble();
        
        System.out.println("Digite o quanto custa sua"
                + "condução diária só de ida da casa para o trabalho.");
        
        Double valorVT = leitorNumero.nextDouble();
        
        Double descontoVT = (valorVT * 2 * 22);
        
        Double salarioINSS = (salarioBruto * 10/100 );
        Double salarioIR = (salarioBruto * 20/100 );
        
        Double descontoSalario = (salarioINSS + salarioIR + descontoVT);
        
        Double salarioLiquido = (salarioBruto - salarioINSS - salarioIR - descontoVT);
        
        
       
        
        System.out.println(String.format("Seu salário bruto é R$%.2f,"
                + " tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f"
                ,salarioBruto,descontoSalario,salarioLiquido ));
        
        
        
    }
    
}
