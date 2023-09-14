import java.sql.SQLOutput;
import java.time.LocalDateTime;

public class ContaBancaria {
    private String nome;
    private int cpf;
    private int identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalDateTime horarioAtual = LocalDateTime.now();


    public ContaBancaria(String nome, int cpf, int identificadorConta, String banco, String endereco, double saldo, LocalDateTime horarioAtual) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldo;
        this.horarioAtual = horarioAtual;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito realizado, saldo atual: " + this.saldo);
    }

    public void sacar(double valor){
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente");
            return;
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado, saldo atual: " + this.saldo);
        }
    }

    public void verificarSaldo(){
        System.out.println("Saldo atual: " + this.saldo);

    }

    public void verificarHorario(){
        System.out.println("Horario atual: " + this.horarioAtual);
    }

    public void verificarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Identificador da conta: " + this.identificadorConta);
        System.out.println("Banco: " + this.banco);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Saldo: " + this.saldo);
    }






    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdentificadorConta() {
        return identificadorConta;
    }

    public void setIdentificadorConta(int identificadorConta) {
        this.identificadorConta = identificadorConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDateTime getHorarioAtual() {
        return horarioAtual;
    }

    public void setHorarioAtual(LocalDateTime horarioAtual) {
        this.horarioAtual = horarioAtual;
    }
}

