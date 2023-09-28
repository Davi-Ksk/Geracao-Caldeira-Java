import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Compra> listaDeCompras = new ArrayList<>();

        String nomeCompra;
        String dataDeValidade;

        boolean startWhile = true;

        while (startWhile) {
            System.out.println("-----------LISTA DE COMPRAS-----------");
            System.out.println("1 - Adicionar Compra");
            System.out.println("2 - Remover Compra");
            System.out.println("3 - Listar Compras");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção desejada: ");
            int opcao = input.nextInt();

            input.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome da compra: ");
                    nomeCompra = input.nextLine();
                    System.out.print("Digite a data de validade da compra: ");
                    dataDeValidade = input.nextLine();
                    listaDeCompras.add(new Compra(nomeCompra, dataDeValidade));

                }
                case 2 -> {
                    System.out.print("Digite o indice da compra a ser removida: ");
                    int indice = input.nextInt();
                    for (int i = indice; i < listaDeCompras.size(); i++) {
                        listaDeCompras.remove(i);
                    }

                    System.out.println("Compra removida com sucesso!");

                    System.out.println("Sua lista de compras atual é: ");
                    for (Compra listaDeCompra : listaDeCompras) {
                        System.out.println(listaDeCompra.getNome() + " - " + listaDeCompra.getDataDeValidade());
                    }
                }
                case 3 -> {
                    System.out.println("Sua lista de compras é: ");
                    for (Compra listaDeCompra : listaDeCompras) {
                        System.out.println(listaDeCompra.getNome() + " - " + listaDeCompra.getDataDeValidade());
                    }
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("Saindo...");
                    startWhile = false;
                }
            }
        }




    }
}