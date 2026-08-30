import javax.swing.JOptionPane;

public class ex06 {

    /* Receba 3 valores obrigatoriamente em ordem crescente e um 4o valor não necessariamente em ordem.
     Mostre os 4 números em ordem crescente. */

    public static void main(String[] args){

        int n1, n2, n3, n4;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor maior que o anterior: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor maior que o anterior: "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor aleatório: "));

        // Validando a entrada
        if (n1>n2 || n2>n3)
        {
            JOptionPane.showMessageDialog(null, "Os três primeiros" +
                    " valores precisam estar em ordem crescente !!");
        }

        // Verificando a ordem
        if (n4<n1)
        {
            JOptionPane.showMessageDialog(null, "A ordem correta é: "+n4+","+n1+","+n2+","+n3);
        }
        else if (n4>n1 && n4<n2)
        {
            JOptionPane.showMessageDialog(null, "A ordem correta é: "+n1+","+n4+","+n2+","+n3);
        }
        else if (n4>n2 && n4<n3)
        {
            JOptionPane.showMessageDialog(null, "A ordem correta é: "+n1+","+n2+","+n4+","+n3);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "A ordem correta é: "+n1+","+n2+","+n3+","+n4);
        } // Fim Verificação
    }
}
