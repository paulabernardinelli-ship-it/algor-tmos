//Ler 2 números, mostrar o maior, ou se são iguais

import java.util.Scanner;

public class Numeros {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        System.out.print("Digite um numero");
        num1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero");
        num2 = scanner.nextDouble();
        if(num1 > num2){
            System.out.println("O numero maior e: " + num1);

        }
        else if (num2 > num1) {
            System.out.println("O numero maior e " + num2);

        }
        else {
            System.out.println("Os numeros sao iguais" + num2);
        }


    }

}
