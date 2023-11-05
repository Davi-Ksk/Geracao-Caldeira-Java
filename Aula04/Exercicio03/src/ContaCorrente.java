public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(double saldo) {
        super(saldo);
    }


    @Override
    public double calculaTributos() {
       this.saldo -= this.saldo * 0.1;
       return this.saldo;
    }

    public void calculaSeguroDeVida(){
        this.saldo -= this.saldo - 42;
    }


}
