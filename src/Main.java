import dio.calculadoraEstrategica.*;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TipoCalculo somar = new Somar();
        TipoCalculo subtrair = new Subtrair();
        TipoCalculo multiplicar = new Multiplicar();
        TipoCalculo dividir = new Dividir();

        Calculadora calculadora = new Calculadora();
        String tipoDeCalculo = "";
        Scanner input = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        while (true) {
            System.out.println("Qual calculo você gostaria de fazer?:\n1)Somar\n2)Subtrair\n3)Multiplicar\n4)Dividir\n5)Fechar programa");
            tipoDeCalculo = input.next();
            if(Objects.equals(tipoDeCalculo, "1")){
                calculadora.setTipoCalculo(somar);
               // System.out.println("Digite o primeiro numero: ");
                try {
                    System.out.println("Digite o primeiro numero: ");
                    num1 = input.nextDouble();
                    System.out.println("Digite o Segundo numero: ");
                    num2 = input.nextDouble();
                    calculadora.calcular(num1, num2);
                }catch (InputMismatchException e){
                    System.out.println("Número inválido");
                }
            }
            if(Objects.equals(tipoDeCalculo, "2")){
                calculadora.setTipoCalculo(subtrair);

                try {
                    System.out.println("Digite o primeiro numero: ");
                    num1 = input.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    num2 = input.nextDouble();
                    calculadora.calcular(num1, num2);
                }catch (InputMismatchException e){
                    System.out.println("Número inválido");
                }
            }
            if(Objects.equals(tipoDeCalculo, "3")){
                calculadora.setTipoCalculo(multiplicar);

                try {
                    System.out.println("Digite o primeiro numero: ");
                    num1 = input.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    num2 = input.nextDouble();
                    calculadora.calcular(num1, num2);
                }catch (InputMismatchException e){
                    System.out.println("Número inválido");
                }
            }
            if(Objects.equals(tipoDeCalculo, "4")){
                calculadora.setTipoCalculo(dividir);

                try {
                    System.out.println("Digite o primeiro numero: ");
                    num1 = input.nextDouble();
                    System.out.println("Digite o segundo numero: ");
                    num2 = input.nextDouble();
                    calculadora.calcular(num1, num2);
                }catch (InputMismatchException e){
                    System.out.println("Número inválido");
                }
            }
            if(Objects.equals(tipoDeCalculo, "5")){
                System.out.println("Saindo do programa...");
                System.out.println("Você saiu do programa!");
                break;
            }
            else{
                System.out.println("Opção inválida");
            }
        }

        /*
        calculadora.setTipoCalculo(somar);
        calculadora.calcular(4,4);

        calculadora.setTipoCalculo(subtrair);
        calculadora.calcular(7,3);

        calculadora.setTipoCalculo(multiplicar);
        calculadora.calcular(5,5);

        calculadora.setTipoCalculo(dividir);
        calculadora.calcular(5,0);
*/

    }
}