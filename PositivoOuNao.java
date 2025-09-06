import java.util.Scanner;

public class PositivoOuNao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("digite um numero: ");
        double numero = scanner.nextDouble();
        if (numero > 0){
            System.out.println(numero + " e positivo");
        }
        else {
            System.out.println(numero + " nao e positivo");
        }
        scanner.close();
    }
    
}
