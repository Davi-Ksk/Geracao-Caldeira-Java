import java.util.Scanner;

public class Menu {

    public static void menu(){

        Scanner scanner = new Scanner(System.in);
        Impressao impressao = new Impressao();
        boolean sair = false;

        do {
            System.out.println("----------------------Menu-----------------------");
            System.out.println("1 - Adicionar documentos na fila de impressão");
            System.out.println("2 - Retirar documentos na fila de impressão");
            System.out.println("3 - Imprimir documentos na fila de impressão");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    impressao.adicionar();
                }

                case 2 -> {
                    impressao.retirar();
                }

                case 3 -> {
                    impressao.imprimirLista();
                }

                case 4 -> {
                    System.out.println("Saindo...");
                    sair = true;
                }

                default -> System.out.println("Opção inválida!");
            }

        } while (!sair);



    }

}
