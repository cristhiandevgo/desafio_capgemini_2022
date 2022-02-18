/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio_capgemini_2022;

/**
 *
 * @author Ivan Cristhian
 */
public class Questao_1 {
    private int n;

    public Questao_1(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public String desenha(int quantidade_espacos, int quantidade_caractere, int n){
        String caractere = new String();
        for(int i = 0; i < quantidade_espacos; i++){
            caractere += " ";
        }

        for(int i = 0; i < quantidade_caractere; i++){
            caractere += "*";
        }
        
        return caractere;
    }
    
    public void gera_escada(int n){
        String caractere = new String();
        int quantidade_espacos = n - 1; // 5
        int quantidade_caractere = n - quantidade_espacos; // 1
        
        for(int i = 0; i < n; i++){
            if(quantidade_caractere <= n){
                caractere = desenha(quantidade_espacos, quantidade_caractere, n);
                quantidade_caractere++;
                quantidade_espacos--;
            }
            System.out.println(caractere);
        }
        
    }
}
