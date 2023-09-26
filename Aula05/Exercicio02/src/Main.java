import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbersList = new int[10];

        for (int i = 0; i < 10; i++) {
            numbersList[i] = (int)(Math.random() * 100) + 1;
        }

        System.out.print("Digite um numero inteiro e tente acertar qual é: ");
        int guess = scan.nextInt();

        for (int i : numbersList) {
            if (numbersList[i] == guess){
                System.out.println("Esse número está presente na lista!");
            } else {
                System.out.println("Esse número não está presente na lista!");

            }
        }

    }
}