//Exercicio 04
//
//Implemente uma calculadora, onde o usuário deve entrar
//com 2 números e escolher a operação que deseja realizar.
//Durante a execução o programa deve perguntar ao usuário se ele deseja continuar,
//se ele não quiser, deve digitar ‘n’ para o programa encerrar.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String continuar = "s";

        while (continuar.equals("s")) {
            System.out.print("Digite um número: ");
            int numeroUm = input.nextInt();
            System.out.print("Digite outro número: ");
            int numeroDois = input.nextInt();

            System.out.println("Digite a operação que deseja realizar:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("n - Sair");
            String operacao = input.next();

            if (operacao.equals("1")) {
                System.out.println("O resultado da soma é: " + (numeroUm + numeroDois));
            } else if (operacao.equals("2")) {
                System.out.println("O resultado da subtração é: " + (numeroUm - numeroDois));
            } else if (operacao.equals("3")) {
                System.out.println("O resultado da multiplicação é: " + (numeroUm * numeroDois));
            } else if (operacao.equals("4")) {
                System.out.println("O resultado da divisão é: " + (numeroUm / numeroDois));
            } else if (operacao.equals("n")) {
                continuar = "n";
            } else {
                System.out.println("Operação inválida");
            }

            System.out.println("Continuar? (s/n)");
            continuar = input.next();
            if (continuar.equals("n")) {
                break;
            } else {
                continuar = "s";
            }
        }






    }
}