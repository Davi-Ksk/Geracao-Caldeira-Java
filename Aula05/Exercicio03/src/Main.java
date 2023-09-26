import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            switch (scanner.nextLine()) {
                case "sair":
                    break;
                case "adicionar":
                    tarefas.add(scanner.nextLine());
                    break;
                case "remover":
                    tarefas.remove(scanner.nextLine());
                    break;
                case "listar":
                    for (String tarefa : tarefas) {
                        System.out.println(tarefa);
                    }
                    break;
                default:
                    System.out.println("Comando inválido");
        }

    }
}