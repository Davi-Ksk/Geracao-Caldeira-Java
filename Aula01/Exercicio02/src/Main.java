//Exercicio 02
//Crie um programa que receba 2 números e imprima na tela.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int firstNumber = Integer.parseInt(Scan.nextLine());

        System.out.print("Digite o segundo número: ");
        int secondNumber = Integer.parseInt(Scan.nextLine());
        System.out.println("Os números inseridos são: " + firstNumber + " e " + secondNumber);

    }
}