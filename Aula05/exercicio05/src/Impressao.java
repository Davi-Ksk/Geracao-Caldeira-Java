public class Impressao {
    private String nomeDaImpressao;
    private int numeroDePaginas;

    public Impressao(String nomeDaImpressao, int numeroDePaginas) {
        this.nomeDaImpressao = nomeDaImpressao;
        this.numeroDePaginas = numeroDePaginas;
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
