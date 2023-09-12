//Exercicio 05
//Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis,
// depois, determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s
// e a quantidade de segundos que faltam para a meia-noite.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.print("Digite uma hora: ");
        int hours = Integer.parseInt(Scan.nextLine());

        System.out.print("Digite os minutos: ");
        int minutes = Integer.parseInt(Scan.nextLine());

        System.out.print("Digite os segundos: ");
        int seconds = Integer.parseInt(Scan.nextLine());

        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        int remainingSeconds = 86400 - totalSeconds;

        System.out.println("Segundos que passaram des das 0h00min0s: " + totalSeconds);
        System.out.println("Segundos que faltam para a meia-noite: " + remainingSeconds);


    }
}