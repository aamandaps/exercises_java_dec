import javax.swing.JOptionPane;

public class ex05 {

    /* Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente. */

    public static void main(String[] args) {

        int v1, v2;

        v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        v2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo valor: "));

        // Validando entrada
        if (v1 == v2)
        {
            JOptionPane.showMessageDialog(null, "Os valores devem ser diferentes.");
            return;
        }

        // Verificação
        if (v1>v2)
        {
            JOptionPane.showMessageDialog(null, "Ordem: "+v2+","+v1);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Ordem: "+v1+","+v2);
        }
    }

}
