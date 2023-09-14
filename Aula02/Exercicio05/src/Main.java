// Exercicio 05
//Escreva um programa que separa a string em duas metades e imprime a primeira parte.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma frase ou palavra: ");
        String frase = input.nextLine();

        System.out.println(frase.substring(0, frase.length()/2));

    }
}