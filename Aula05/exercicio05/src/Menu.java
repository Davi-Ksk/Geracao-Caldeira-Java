import java.util.Scanner;

public class Menu {

    public static void menu(){

        Scanner scanner = new Scanner(System.in);

        boolean sair = false;

        do {
            System.out.println("----------------------Menu-----------------------");
            System.out.println("1 - Adicionar documentos na fila de impressão");
            System.out.println("2 - Imprimir documentos na fila de impressão");
            System.out.println("3 - Retirar documentos na fila de impressão");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                }
                // Adicionar documentos na fila de impressão
                case 2 -> {
                }
                // Imprimir documentos na fila de impressão
                case 3 -> {
                }
                // Retirar documentos na fila de impressão
                case 4 ->
                    // Sair
                        sair = true;
                default -> System.out.println("Opção inválida!");
            }

        } while (!sair);



    }

}
