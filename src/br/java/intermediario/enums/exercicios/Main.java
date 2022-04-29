package br.java.intermediario.enums.exercicios;

import br.java.intermediario.enums.enums.CalculadoraEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Número 1: ");
        double numeroUm = dados.nextDouble();

        System.out.println("Número 2: ");
        double numeroDois = dados.nextDouble();


        CalculadoraEnum[] operacoes = CalculadoraEnum.values();

        for (CalculadoraEnum operacoe : operacoes) {
            System.out.println(operacoe.execeutarOperacao(numeroUm, numeroDois));
        }
    }
}
