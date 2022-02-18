/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio_capgemini_2022;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ivanc
 */
public class Questao_2 {
    String senha, dicas;

    public Questao_2(String senha, String dicas) {
        this.senha = senha;
        this.dicas = dicas;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDicas() {
        return dicas;
    }

    public void setDicas(String dicas) {
        this.dicas = dicas;
    }
    
    public boolean valida_senha(String senha){
        /* 
        Teste
        OK - Possui no mínimo 6 caracteres.
        OK - Contém no mínimo 1 digito. 
        OK - Contém no mínimo 1 letra em minúsculo. 
        OK - Contém no mínimo 1 letra em maiúsculo. 
        OK - Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+ 
        */
        
        // Quantidade de digitos
        if(senha.length() < 6){
            System.out.println("Sua senha possui " + senha.length() + " caracteres."
                    + " A senha deve possuir no mínimo 6 caracteres.");
            
            return false;
        }
        // Tipos de caractere
        char[] chars = senha.toCharArray();
        boolean possui_numero = false,
                possui_letra = false,
                possui_maiusculo = false,
                possui_minusculo = false,
                possui_caractere_especial = false;
        
        for (char ch : chars) {
            if(Character.isLetter(ch)){
                possui_letra = true;
            }
            if(Character.isDigit(ch)){
                possui_numero = true;
            }
            if(Character.isUpperCase(ch)){
                possui_maiusculo = true;
            }
            if(Character.isLowerCase(ch)){
                possui_minusculo = true;
            }
            
            Pattern pattern = Pattern.compile("\\W");
            Matcher matcher = pattern.matcher(senha);
            
            if(matcher.find()){
                possui_caractere_especial = true;
            }
            
        }
        
        System.out.println("");
        if(!possui_letra){
            System.out.println("Alerta: A senha deve conter pelo menos uma letra.");
            return false;
        }
        
        if(!possui_numero){
            System.out.println("Alerta: A senha deve conter pelo menos um número.");
            return false;
        }
        
        if(!possui_maiusculo){
            System.out.println("Alerta: A senha deve conter pelo menos uma letra maiúscula.");
            return false;
        }
        
        if(!possui_minusculo){
            System.out.println("Alerta: A senha deve conter pelo menos uma letra minúscula.");
            return false;
        }
        
        if(!possui_caractere_especial){
            System.out.println("Alerta: A senha deve conter pelo menos um caractere especial.");
            return false;
        }
        
        System.out.println("Senha segura gerada com sucesso!\n");
        return true;
    }
    
}
