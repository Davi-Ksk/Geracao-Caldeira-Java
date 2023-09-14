// Exercicio 06
//Escreva um programa que receba uma string do usuário e imprima ela ao contrário

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = in.nextLine();

        for (int i = frase.length() - 1; i >= 0; i--){
            System.out.print(frase.charAt(i));
        }

    }
}