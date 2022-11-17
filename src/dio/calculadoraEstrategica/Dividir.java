package dio.calculadoraEstrategica;

public class Dividir implements TipoCalculo{
    @Override
    public void calcular(double num1, double num2) {


        if(num2 == 0){
            System.out.println("Impossível dividir por 0");
        }
        else{
            double resultado = num1 / num2;
            System.out.println("Você dividiu " + num1 + " e " + num2 + " resultando em: " + resultado);
        }

    }
}
