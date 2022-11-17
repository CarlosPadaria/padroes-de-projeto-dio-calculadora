package dio.calculadoraEstrategica;

public class Calculadora {

    TipoCalculo tipoCalculo;

    public void setTipoCalculo(TipoCalculo tipoCalculo) {
        this.tipoCalculo = tipoCalculo;
    }

    public void calcular(double num1, double num2){
        tipoCalculo.calcular(num1, num2);
    }


}
