import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(5, 6);
        Triangulo triangulo = new Triangulo(5, 6);
        Losango losango = new Losango(5, 6);

        ArrayList<FormaGeometrica> formasGeometricas = new ArrayList<FormaGeometrica>();
        formasGeometricas.add(circulo);
        formasGeometricas.add(quadrado);
        formasGeometricas.add(retangulo);
        formasGeometricas.add(triangulo);
        formasGeometricas.add(losango);

        for (  FormaGeometrica formaGeometrica : formasGeometricas) {
            System.out.println(formaGeometrica.calcularArea());
        }



    }
}