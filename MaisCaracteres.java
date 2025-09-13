//Ler uma letra e dizer se o usuário acertou
import java.util.Scanner;

public class MaisCaracteres {
    public static void main(String[] args) {
        char misterio = 'p';
        System.out.print ("digite uma letra e acerte o misterio");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char chute = s.charAt(0);
        if (chute==misterio) {
            System.out.println("Parabens, voce acertou!");

        }
        else {
            System.out.println("Que pena, voce errou!");

        }
    }

    
}
