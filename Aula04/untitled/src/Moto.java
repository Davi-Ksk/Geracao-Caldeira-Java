public class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void calcularCustoViagem(double distancia) {
        double custoViagem = distancia * 0.15;
        System.out.println("O custo da viagem é: R$" + custoViagem);
    }
}
