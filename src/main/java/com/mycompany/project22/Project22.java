package com.mycompany.project22;

public class Project22 {

    public static void main(String[] args) {
        Double soma = 0.0;
        int i = 1;
        while(i <= 1000){
            soma = soma + i;
            i++;
        }
        Double media = soma / 1000;
        System.out.println("Média: " + media);
    }
}
