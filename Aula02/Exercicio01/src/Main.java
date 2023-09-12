//Exercicio 01
//
//Crie um programa que determine e escreva os
//números primos compreendidos entre um intervalo fornecido pelo usuário.

import java.util.Scanner;

public class Main {
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o inicio do intervalo: ");
        int primeiroNumero = input.nextInt();
        System.out.print("Digite o final do intervalo: ");
        int segundoNumero = input.nextInt();

        for (int i = primeiroNumero; i <= segundoNumero; i++) {
            if( ehPrimo(i) )
                System.out.println(i + " é primo.");
        }
    }
}