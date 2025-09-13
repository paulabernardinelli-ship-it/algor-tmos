//Ler 2 números e uma opção entre +, -, *, /, realizar a operação desejada, se possível, e exibir respostas adequadas

import java.util.Scanner;

public class Caluladora {
    public static void main (String[] args) {
        Scanner scanner + new Scanner(System.in);
        double num1, num2, resultado;
        char operacao;
        System.out.print ("digite o primeiro numero: ");
        num1 = scanner.nextDouble();
        System.out.print ("digite o segundo numero: ");
        num2 = scanner.nextDouble();
        System.out.print("escolha + - * /: ");
        operacao = scanner.nextLine().charAt(0);
        if (operacao == '+') {
            resultado = num1 + num 2
            System.out.println("soma = " + resultado);
        }
        else if (operacao == '-') {
            resultado = num1 - num2
            System.out.println("subtração = " + resultado);
        }
        else if (operacao == '*') {
            resultado = num1 * num2
            System.out.println("multiplicacao = " + resultado);
        }
        else if (operacao == /) {
            if (num2 == 0) {
                System.out.println("nao existe divisao por 0!");

            }
            else {
                resultado = num1 / num2
            System.out.println("divisao = " + resultado);

            }

        }
        else {
            System.out.println("operacao invalida!");
        }

    }
}
