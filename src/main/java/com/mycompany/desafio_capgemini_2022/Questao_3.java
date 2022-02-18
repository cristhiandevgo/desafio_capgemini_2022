/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio_capgemini_2022;

/**
 *
 * @author Ivanc
 */
public class Questao_3 {
    String anagrama;

    public Questao_3(String anagrama) {
        this.anagrama = anagrama;
    }

    public String getAnagrama() {
        return anagrama;
    }

    public void setAnagrama(String anagrama) {
        this.anagrama = anagrama;
    }
    
    public void valida_anagrama(String palavra){
        // Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.
        
        // Entrada: ovo
        // Saída: 3
        // A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0, 2], [0, 1], [1, 2]] respectivamente.
        
        // Entrada: ifailuhkqq
        // Saída: 3
        // A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0, 3]], [[8, 9]] e [[0, 1, 2], [1, 2, 3]].
        
        int quantidade = 0, i_aux = 0;
        String aux = "";
        
        for(int i = 0; i < palavra.length(); i++){
            for(int j = i + 1; j < palavra.length(); j++){
                                
                if(palavra.charAt(i) == palavra.charAt(j)){
                    System.out.println("Iguais!");
                    System.out.println("arr[i][" + i + "]: " + palavra.charAt(i));
                    System.out.println("arr[j][" + j + "]: " + palavra.charAt(j));
                    System.out.println("");
                    aux += palavra.charAt(i) + palavra.charAt(i+1);
                    quantidade++;
                    System.out.println(palavra.charAt(i));
                    System.out.println(palavra.charAt(i+1));
                }
            }
        }
        
        System.out.println("arr_aux: " + aux);
        System.out.println(quantidade + " anagramas encontrados.");
        
        /*
        
        for (String arr1 : arr) {
            for (String arr2 : arr) {
                System.out.println("arr[i]: " + arr1);
                System.out.println("arr[j]: " + arr2);
                
                if (arr1 == arr2) {
                    System.out.println("Iguais!");
                }
                System.out.println("");
            }
        }
        
        */

    }
    
}
