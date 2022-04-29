package br.java.intermediario.enums.exercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Número 1: ");
        double numeroUm = dados.nextDouble();

        System.out.println("Número 2: ");
        double numeroDois = dados.nextDouble();


        CalculadoraEnum[] operacoes = CalculadoraEnum.values();

        for(int i=0; i<operacoes.length; i++){
            System.out.println(operacoes[i].execeutarOperacao(numeroUm, numeroDois));
        }
    }
}
