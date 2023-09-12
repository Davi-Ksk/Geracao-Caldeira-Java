//Exercicio 03
//Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.

//Nota: Não consegui tirar os Optionals dos prints.

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        int[] numberArray = {};


        System.out.print("Digite o primeiro número: ");
        int firstNumber = Integer.parseInt(Scan.nextLine());

        System.out.print("Digite o segundo número: ");
        int secondNumber = Integer.parseInt(Scan.nextLine());

        System.out.print("Digite o segundo número: ");
        int thirdNumber = Integer.parseInt(Scan.nextLine());

        numberArray = new int[]{firstNumber, secondNumber, thirdNumber};

        OptionalDouble numbersAvarage = Arrays.stream(numberArray).average();
        String numbersAvarageString = numbersAvarage.toString();

        OptionalInt numbersMax = Arrays.stream(numberArray).max();
        String numbersMaxString = numbersMax.toString();

        OptionalInt numbersMin = Arrays.stream(numberArray).min();
        String numbersMinString = numbersMin.toString();

        System.out.println("Média dos números: " + numbersAvarageString);
        System.out.println("Maior número: " + numbersMaxString);
        System.out.println("Menor número: " + numbersMinString);
    }
}