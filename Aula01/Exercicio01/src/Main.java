import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.print("Digite seu nome: ");

        String userName = myObj.nextLine();
        System.out.println("Seu nome é: " + userName);

    }
}