package dio.calculadoraEstrategica;

public class Multiplicar implements TipoCalculo{
    @Override
    public void calcular(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println("Você multiplicou " + num1 + " e " + num2 + " resultando em: " + resultado);
    }
}
