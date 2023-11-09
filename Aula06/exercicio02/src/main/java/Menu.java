import java.util.Scanner;

public class Menu {
    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        String name = "";
        int age = 0;

        People people = new People(name, age);

        people.defaultPeople();

        do {
            System.out.println("----------------------Menu-----------------------");
            System.out.println("1 - Adicionar uma pessoa");
            System.out.println("2 - Remover uma pessoa");
            System.out.println("3 - Listar pessoas");
            System.out.println("4 - Listar pessoas com idade acima de 60 anos");
            System.out.println("5 - Sair");

            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> people.addPerson();

                case 2 -> people.removePerson();

                case 3 -> people.showPeople();

                case 4 -> people.showElderPeople();

                case 5 -> {
                    System.out.println("Saindo...");
                    exit = true;
                }

                default -> System.out.println("Opção invalida!");
            }

        } while (!exit);

    }

}
