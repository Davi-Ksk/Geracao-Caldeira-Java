public class GerenciadorDeImpostoDeRenda {

    public void adicionar(Tributavel tributavel){
        if (tributavel instanceof ContaCorrente){
            ((ContaCorrente) this.tributavel).calculaSeguroDeVida();
        }
    }

}
