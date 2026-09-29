import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner entrada_dados = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = entrada_dados.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = entrada_dados.nextDouble();

        
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;


    }
}