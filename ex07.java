import javax.swing.JOptionPane;

public class ex07 {

    /* Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3. */

    public static void main(String[] args) {
        int num;

         num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

         if (num % 2 == 0  && num % 3 == 0)
         {
             JOptionPane.showMessageDialog(null, "Esse valor é divisível por 3 e por 2.");
         }
         else
         {
             JOptionPane.showMessageDialog(null, "Esse valor não é divisível por 3 e 2.");
         } // Fim Condicional

    }
}
