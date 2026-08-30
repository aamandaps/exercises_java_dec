import javax.swing.JOptionPane;

public class ex12 {

    /* Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento.
    Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%.
    Demais tipos não serão considerados. */

    public static void main (String[] args) {
        String tipo;
        String poup = "poupança";
        String rend_fixa = "renda fixa";
        double rend, valor;

        valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor investido: "));
        tipo = JOptionPane.showInputDialog("Insira o tipo de investimento: ");

        if (tipo.equals(poup))
        {
            rend = (valor*1.03);

            JOptionPane.showMessageDialog(null, "Rendimento = R$" + String.format("%.2f", rend));
        }
        else if (tipo.equals(rend_fixa))
        {
            rend = (valor*1.05);

            JOptionPane.showMessageDialog(null, "Rendimento = R$" + String.format("%.2f", rend));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Insira um tipo de investimento válido.");
        }
    }
}
