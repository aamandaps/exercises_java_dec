import javax.swing.JOptionPane;

public class ex03 {

    /* Receba 3 coeficientes A, B, e C de uma
    equação do 2o grau da fórmula AX2+BX+C=0. Verifique e mostre a
    existência de raízes reais e se caso exista, calcule e mostre */

    public static void main(String[] args) {
        int a, b, c;
        double delta, x1, x2;

        a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de A: "));

        // Validando valor de A
        if (a == 0)
        {
            JOptionPane.showMessageDialog(null, "O valor de A deve ser igual à 0");
            return;
        }

        b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de C: "));

        delta = ( Math.pow(b,2) -(4*a*c) );

        // Verificando a existência de raízes
        if (delta<0)
        {
            JOptionPane.showMessageDialog(null, "Delta = "+ delta +"\nNão há raízes.");
        }
        else if (delta == 0)
        {
            x1 = (-b / (2*a));

            JOptionPane.showMessageDialog(null, "Delta = 0\nHá apenas uma raiz real: " +
                    "\nX = "+ String.format("%.2f", x1));
        }
        else
        {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);

            JOptionPane.showMessageDialog(null, "Delta = "+delta +
                    "\nHá duas raízes: \nX1 = "+ String.format("%.2f", x1) +
                    "\nX2 = "+ String.format("%.2f" , x2));
        } // Fim Condicional
    }
}
