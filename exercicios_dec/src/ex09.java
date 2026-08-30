import javax.swing.JOptionPane;

public class ex09 {

    /* Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor */

    public static void main (String[] args) {

        int n1, n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if (n1 > n2 && n1%n2 == 0)
        {
            JOptionPane.showMessageDialog(null, "O maior ("+n1+") é múltiplo do menor ("+n2+").");
        } else if (n2 > n1 && n2%n1 == 0)
        {
            JOptionPane.showMessageDialog(null, "O maior ("+n1+") é múltiplo do menor ("+n2+").");
        }

    }

}
