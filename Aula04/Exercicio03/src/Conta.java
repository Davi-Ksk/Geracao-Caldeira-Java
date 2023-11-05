public abstract class Conta {

    double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(saldo < valor){
            System.out.println("Saldo insuficiente!");
        }
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public double obterSaldo(){
        return saldo;
    }

    public double getSaldo(){
        return saldo;
    }




}
