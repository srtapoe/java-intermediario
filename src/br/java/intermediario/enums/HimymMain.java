package br.java.intermediario.enums;

import java.util.Scanner;

public class HimymMain {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);

        System.out.println("Digite o elemento do capítulo e diremos qual temporada ele pertence: ");
        String elementoCapitulo = dadosEntrada.nextLine();

        mostrarTemporadaCorrespondente(elementoCapitulo);

    }

    private static void mostrarTemporadaCorrespondente(String elementoCapitulo){
        switch (elementoCapitulo) {
            case "abacaxi" -> System.out.println("Elemento pertence a: " + TemporadaHIMYM.TEMPORADA_UM);
            case "swarley" -> System.out.println("Elemento pertence a: " + TemporadaHIMYM.TEMPORADA_DOIS);
            case "iglesias" -> System.out.println("Elemento pertence a: " + TemporadaHIMYM.TEMPORADA_TRES);
            case "naked" -> System.out.println("Elemento pertence a: " + TemporadaHIMYM.TEMPORADA_QUATRO);
            case "playbook" -> System.out.println("Elemento pertence a: " + TemporadaHIMYM.TEMPORADA_CINCO);
            case "babytalk" -> System.out.println("Elemento pertence a: " + TemporadaHIMYM.TEMPORADA_SEIS);
            case "blitz" -> System.out.println("Elemento pertence a: " + TemporadaHIMYM.TEMPORADA_SETE);
            case "sparkles" -> System.out.println("Elemento pertence a: " + TemporadaHIMYM.TEMPORADA_OITO);
            case "tapasfinal" -> System.out.println("Elemento pertence a: " + TemporadaHIMYM.TEMPORADA_NOVE);
            default -> System.out.println("Capítulo não selecionado!");
        }
    }
}
