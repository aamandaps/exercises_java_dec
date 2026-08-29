import javax.swing.JOptionPane;

public class ex02 {

    // Algoritmo que calcula e mostra maior valor

    public static void main (String[] args) {
        double v1, v2;

        v1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor real: "));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um segundo valor real: "));

        if (v1>v2)
        {
            JOptionPane.showMessageDialog(null, "O maior valor é: "+ v1);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O maior valor é: "+ v2);
        }
    }

}
