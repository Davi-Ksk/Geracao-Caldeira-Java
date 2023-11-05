import java.util.Scanner;

public class Menu {
    public static void menu(){

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        String name = "";
        String local = "";
        String cpf = "";
        Reservations reservations = new Reservations(name, local, cpf);


        do {
            System.out.println("----------------------Menu-----------------------");
            System.out.println("1 - Reservar uma passagem");
            System.out.println("2 - Cancelar reserva");
            System.out.println("3 - Listar minhas reservas");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    reservations.addReservation();
                }

                case 2 -> {
                    reservations.cancelReservation();
                }

                case 3 -> {
                    reservations.listReservations();
                }

                case 4 -> {
                    System.out.println("Saindo...");
                    exit = true;
                }

                default -> System.out.println("Opção invalida!");
            }

        } while (!exit);

    }

}
