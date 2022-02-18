/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio_capgemini_2022;

import java.util.Scanner;

/**
 *
 * @author Ivanc
 */
public class Principal {
    
    public static void main(String[] args){
        
        System.out.println("DESAFIO DE PROGRAMAÇÃO - ACADEMIA CAPGEMINI - 2022");
        
        /*
        // Questão 1
        System.out.println("\nQuestão 1 - Gerar Escada");
        Questao_1 q1 = new Questao_1(6);
        q1.gera_escada(q1.getN());
        
        // Questão 2
        System.out.println("\nQuestão 2 - Validar Senha Segura");
        Scanner pw = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = pw.next();
        String dicas = "* Deve possuir no mínimo 6 caracteres.\n * Deve possuir no mínimo 1 digito.\n * Deve possuir no mínimo 1 letra em minúsculo.\n * Deve possuir no mínimo 1 letra em maiúsculo.\n * Deve possuir no mínimo 1 caractere especial. (Os caracteres especiais são: !@#$%^&*()-+)";
        Questao_2 q2 = new Questao_2(senha, dicas);
        
        System.out.println("Dicas de senha: \n " + q2.getDicas());
        
        while(!q2.valida_senha(q2.getSenha())){
            System.out.println("\nDigite outra senha: ");
            senha = pw.next();
            q2.setSenha(senha);
        }
        */
        
        // Questão 3
        System.out.println("\nQuestão 3 - Anagrama");
        //String anagrama = "ifailuhkqq";
        String anagrama = "ovo";
        Questao_3 q3 = new Questao_3(anagrama);
        q3.valida_anagrama(q3.getAnagrama());
        
        /*
        
        Testes
        Questao_1 q1 = new Questao_1(12);
        
        */
    }
}
