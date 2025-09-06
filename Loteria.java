// Ler o prêmio da loteria, ler o valor da aposta de 3 amigos no bolão, calcular o
//valor que cada um leva e exibir

import javax.swing.JOptionPane;

public class Loteria {
 public static void main(String[] args) {
    String aux;

    aux = JOptionPane.showInputDialog("digite o premio da semana");
    double premio = Double.parseDouble(aux); 
    
    double apostaAmigo1 = Double.parseDouble(
        JOptionPane.showInputDialog("Quanto o amigo 1 apostou?")
    );
    double apostaAmigo2 = Double.parseDouble(
        JOptionPane.showInputDialog("Quanto o amigo 2 apostou")
    );
    double apostaAmigo3 = Double.parseDouble(
        JOptionPane.showInputDialog("Quanto o amigo 3 apostou?")
    );
    double apostaTotal = apostaAmigo1 + apostaAmigo2 + apostaAmigo3;
    
    double premio1 = apostaAmigo1 / apostaTotal * premio;
    double premio2 = apostaAmigo2 / apostaTotal * premio;
    double premio3 = apostaAmigo3 / apostaTotal * premio;
    //saída
    aux = "O amigo 1 leva R$ " + premio1 + "\nO amigo 2 leva R$ " + premio2 + "\nO amigo 3 leva R$ " + premio3;
    //saída
    aux = "O amigo 1 leva R$ " + String.format("%.2f", premio1) + "\nO amigo 2 leva R$ " + String.format("%.2f", premio2) + "\nO Amigo 3 leva R$ " + String.format("%.2f", premio3);
        
    JOptionPane.showMessageDialog(null, aux);


}   
}
