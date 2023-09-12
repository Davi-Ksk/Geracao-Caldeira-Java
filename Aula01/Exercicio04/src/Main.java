//Exercicio 04
//Crie um programa que leia o valor do salário mínimo
// e o valor do salário de um usuário, calcule a quantidade de salários mínimos
// que esse usuário ganha e imprima o resultado, assuma que o salário mínimo é R$1.320.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int minimumSalary = 1320;

        Scanner Scan = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        float userSalary = Integer.parseInt(Scan.nextLine());

        float minimumSalaryQuantity = userSalary / minimumSalary;

        System.out.println("Seu salário de R$" + userSalary + " equivale a " + minimumSalaryQuantity + " salários minimos de R$" + minimumSalary);

    }
}