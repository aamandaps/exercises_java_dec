import javax.swing.JOptionPane;

public class ex11 {

    /* Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço  */

    public static void main (String[] args) {

        double media_mensal, preco_atual, preco_novo;

        preco_atual = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço atual do produto: "));
        media_mensal = Double.parseDouble(JOptionPane.showInputDialog("Insira a média mensal do produto: "));

        // Verificando se o produto recebe +10%
        if (media_mensal<500 && preco_atual<30.00)
        {
            preco_novo = (preco_atual*1.10);

            JOptionPane.showMessageDialog(null, "O preço com 10% de aumento é: R$" +
                    String.format("%.2f", preco_novo));
        }
        // Verificando se o produto recebe +15%
        else if (media_mensal>=500 && media_mensal<1000 && preco_atual>=30.00 && preco_atual<80.00)
        {
            preco_novo = (preco_atual*1.15);

            JOptionPane.showMessageDialog(null, "O novo preço com 15% de aumento é: R$" +
                    String.format("%.2f", preco_novo));
        }
        // Verificando se o produto recebe -5%
        else if (media_mensal>=1000 && preco_atual>=80.00)
        {
            preco_novo = (preco_atual*(1-0.5));

            JOptionPane.showMessageDialog(null, "O novo preço com 5% de desconto é: R$"+
                    String.format("%.2f", preco_novo));
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O preço permanece o mesmo.");
        } // Fim Verificação

    }

}
