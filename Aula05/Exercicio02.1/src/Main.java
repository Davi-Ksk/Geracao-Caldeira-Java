import java.util.Arrays;
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

        int guessCompare = 0;


            for (int i = 0; i < 10; i++) {
                if (numbersList[i] == guess) {
                    guessCompare = guess;
                    i = 10;
                }
            }


            if (guessCompare == guess) {
                System.out.println("Acertou!");
            } else {
                System.out.println("Errou!");
            }


        System.out.println(Arrays.toString(numbersList));

        }



    }