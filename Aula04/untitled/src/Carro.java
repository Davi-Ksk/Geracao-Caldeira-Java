public class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void calcularCustoViagem(double distancia) {
        double custoViagem = distancia * 0.2;
        System.out.println("O custo da viagem é: R$" + custoViagem);
    }
}
