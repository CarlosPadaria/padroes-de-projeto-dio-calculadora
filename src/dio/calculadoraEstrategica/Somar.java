package dio.calculadoraEstrategica;

public class Somar implements TipoCalculo{
    @Override
    public void calcular(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("Você somou " + num1 + " e " + num2 + " resultando em: " + resultado);
    }
}
