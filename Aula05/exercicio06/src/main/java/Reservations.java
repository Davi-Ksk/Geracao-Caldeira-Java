import java.util.LinkedList;
import java.util.Scanner;

public class Reservations {

    String name;
    String local;
    String cpf;

    LinkedList<String> reservations = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public Reservations(String name, String local, String cpf) {
        this.name = name;
        this.local = local;
        this.cpf = cpf;
    }

    public void addReservation(){

        System.out.println("Digite seu nome: ");
        this.name = scanner.nextLine();

        System.out.println("Digite seu cpf: ");
        this.cpf = scanner.nextLine();

        System.out.println("Digite o local: ");
        this.local = scanner.nextLine();

        String reservation = name + ", " + cpf + ", " + local;
        reservations.add(reservation);

        System.out.println("Reserva realizada com sucesso!");
    }

    public void cancelReservation(){

        System.out.println("Digite o número da reserva que deseja cancelar: ");
        int reservationNumber = scanner.nextInt();

        reservations.remove(reservationNumber - 1);

        System.out.println("Reserva cancelada com sucesso!");
    }

    public void listReservations(){

        int count = 1;

        for (String reservation : reservations) {
            System.out.println(count + ": " + reservation);
            count ++;
        }
    }

}
