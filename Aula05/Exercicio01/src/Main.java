import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        int total = 0;
        double average;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero inteiro: ");
            numbers[i] = scan.nextInt();
            total += numbers[i];
        }

        average = (double) total / 5;


        System.out.println("O total é: " + total + " e a média é: " + average);


    }
}