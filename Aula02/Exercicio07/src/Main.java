import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int soldados = 300;
        int numeroSoldados = 0;

        while (numeroSoldados != soldados) {

            System.out.print("Quantos soldados Leonidas e seus soldados vao enfrentar? ");
            numeroSoldados = scanner.nextInt();

            if (numeroSoldados > soldados) {
                System.out.println("Um pouco menos!");
            } else if (numeroSoldados < soldados) {
                System.out.println("Um pouco mais!");
            } else {
                System.out.println("Voce ganhou!");
            }
        }




    }
}