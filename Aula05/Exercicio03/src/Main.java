import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean startWhile = true;

        while (startWhile) {

            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Listar tarefas");
            System.out.println("4 - Sair" + "\n");
            int option = scanner.nextInt();

            scanner.nextLine(); // limpa o buffer

            switch (option) {
                case 1 -> {

                    System.out.println("Digite o nome da tarefa: ");
                    String nomeDaTarefa = scanner.nextLine();

                    System.out.println("Digite a data da tarefa: ");
                    String dataDaTarefa = scanner.nextLine();

                    System.out.println("Digite a descrição da tarefa: ");
                    String descricaoDaTarefa = scanner.nextLine();

                    String tarefa = nomeDaTarefa + " - " + dataDaTarefa + " - " + descricaoDaTarefa;
                    tarefas.add(tarefa);

                    System.out.println("Tarefa adicionada com sucesso!" + "\n");
                    }
                case 2 -> {
                    System.out.println("Digite o indice da tarefa a ser removida: ");
                    int indice = scanner.nextInt();
                    for (int i = 0; i < tarefas.size(); i++) {
                        if (i == indice) {
                            tarefas.remove(i);
                        }
                    }
                    System.out.println("Tarefa removida com sucesso!" + "\n");
                }
                case 3 -> {
                    for (String tarefa : tarefas) {
                        int indice = tarefas.indexOf(tarefa);
                        System.out.println(indice + " - " + tarefa);
                    }
                    System.out.print("\n");
                }
                case 4 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    startWhile = false;
                }
                default -> System.out.println("Comando inválido");
            }

    }
}

}