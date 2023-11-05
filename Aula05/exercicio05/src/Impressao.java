import java.util.LinkedList;
import java.util.Scanner;

public class Impressao {
    private String nomeDaImpressao;
    private int numeroDePaginas;

    public Impressao() {
        this.nomeDaImpressao = nomeDaImpressao;
        this.numeroDePaginas = numeroDePaginas;
    }

    LinkedList<String> listaDeImpressao = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);


    public void imprimirLista(){

        int count = 1;

        System.out.println("===========LISTA DE IMPRESSÃO===========");
        for (String index : listaDeImpressao) {
            System.out.println(count + ": " + index);
            count++;
        }
    }

    public void adicionar(){

        System.out.print("Digite o nome da impressão: ");
        String nomeDaImpressao = scanner.nextLine();

        System.out.print("Digite o número de páginas: ");
        int numeroDePaginas = scanner.nextInt();

        String novaImpressao = nomeDaImpressao + ", " + numeroDePaginas;
        listaDeImpressao.add(novaImpressao);

        scanner.nextLine();
    }

    public void retirar(){

        System.out.print("Digite o número da impressão que deseja retirar: ");
        int index = scanner.nextInt();
        index = index - 1;
        listaDeImpressao.remove(index);

        scanner.nextLine();
    }

    public String getNome() {
        return nomeDaImpressao;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNomeDaImpressao(String nomeDaImpressao) {
        this.nomeDaImpressao = nomeDaImpressao;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}
