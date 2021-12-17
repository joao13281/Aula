package com.company;

import javax.swing.*;

public class TesteExcecao {
    public static  void main(String args[]){
        String nomes[] = new String[2]; // tamanho = 2
        nomes[0] = "Ana";
        nomes[1] = "josé";
        int indice;

        try {
            String entrada = JOptionPane.showInputDialog("Escreva o indice");
            indice = Integer.parseInt(entrada);
            System.out.println(nomes[indice]);


        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Indice fora dos limites");
        }
    }
}
