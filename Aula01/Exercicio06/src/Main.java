//Exercicio 06
//Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
//1, Se for menor de 16 anos, avisar que não pode votar;
//2, Se tiver 16 ou 17, avisar que o voto é facultativo;
//3, Se tiver mais de 65, avisar que também é facultativo o voto;
//4, De 18 até 65, é obrigatório votar.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int userAge = Integer.parseInt(Scan.nextLine());

        if(userAge < 16){
            System.out.println("Não pode votar.");
        } else if(userAge >= 16 && userAge <= 17){
            System.out.println("Voto facultativo.");
        } else if(userAge > 65){
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto obrigatório.");
        }
    }
}