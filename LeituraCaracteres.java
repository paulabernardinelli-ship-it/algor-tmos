//Ler uma string e obter algumas letras usando o método charAt()

import javax.swing.JOptionPane;

public class LeituraCaracteres {
    public static void main (String[] args) {
        String s;
        s = JOptionPane.showInputDialog("digite uma palavra");
        char letra1 = s.charAt(0);
        JOptionPane.showMessageDialog(null, "o tamanho da palavra e " + s.length());

        int posicao = Integer.parseInt(
            JOptionPane.showInputDialog("escolha uma posicao");
            
            if (posicao < s.length()) {
                char outraLetra = s.charAt(posicao);
                JOptionPane.showMessageDialog(null, " a letra da posicao " + posicao + " e " + outraLetra);
            } 
            else {
                JOptionPane.showMessageDialog(null, "posicao ");
            }

        char outraLetra = s.charAt(posicao);
        JOptionPane.showMessageDialog(null, "a letra da posicao " + posicao + "e " + outraLetra); 
    
    }

    private static void extracted(char letra1) {
        JOptionPane.showMessageDialog(null, "a primeira letra e " + letra1);
    }

}