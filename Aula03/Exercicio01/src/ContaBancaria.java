import javax.management.StringValueExp;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class ContaBancaria {
    private String nome;
    private int cpf;
    private int identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalDateTime horarioAtual = LocalDateTime.now();


    public ContaBancaria(String nome,
                         int cpf,
                         int identificadorConta,
                         String banco,
                         String endereco,
                         double saldo,
                         LocalDateTime horarioAtual) {
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

    public int validarHorario(){
        //int hora = 4;
        return this.horarioAtual.getHour();
    }

    public void transferir(ContaBancaria destino, double valor){
        if (this.validarHorario() >= 8 && this.validarHorario() <= 19){
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência realizada");
        } else {
            System.out.println("Horario inválido");
        }
    }

    public void pix(ContaBancaria destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("Pix realizado");
    }

    public void verificarInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Identificador da conta: " + this.identificadorConta);
        System.out.println("Banco: " + this.banco);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Saldo: " + this.saldo);
    }

    public void alterarEndereço(String endereco){
        this.endereco = endereco;
        System.out.println("Endereço alterado, novo endereço: " + this.endereco);
    }

    public void historicoDeConta(
            ContaBancaria horarioAtual,
            String tipoOperacao,
            ContaBancaria origem,
            ContaBancaria destino,
            ContaBancaria nome){

        ArrayList<String> historico = new ArrayList();

        String transacao =
                String.valueOf(horarioAtual)
                .concat(", ")
                .concat(tipoOperacao)
                .concat(", ")
                .concat(String.valueOf(origem))
                .concat(", ")
                .concat(String.valueOf(destino))
                .concat(", ")
                .concat(String.valueOf(nome))
                .concat(", ")
                .concat(String.valueOf(nome))
                ;

        historico.add(transacao);
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

