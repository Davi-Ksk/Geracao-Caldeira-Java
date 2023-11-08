import java.util.Scanner;

public class Menu {

    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        String title = "";
        String category = "";

        Books books = new Books(title, category);

        do {
            System.out.println("----------------------Menu-----------------------");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Retirar livro (ultimo livro adicionado)");
            System.out.println("3 - Listar livros");
            System.out.println("4 - Limpar lista");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> books.addBook();

                case 2 -> books.removeBook();

                case 3 -> books.listBooks();

                case 4 -> books.clearBooksStack();

                case 5 -> {
                    System.out.println("Saindo...");
                    exit = true;
                }

                default -> System.out.println("Opção invalida!");
            }

        } while (!exit);

    }

}
