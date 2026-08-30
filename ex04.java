import javax.swing.JOptionPane;

public class ex04 {

    /* Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
     Mostre a mensagem de acordo com a média */

    public static void main(String[] args) {
        double  n1, n2, n3, n4, media;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Inira a terceira nota: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Insira a quarta nota: "));

        media = (n1+n2+n3+n4)/4;

        // Verificação
        if (media>=6)
        {
            JOptionPane.showMessageDialog(null, "Média = "+ String.format("%.2f" , media) +
                    "\nAluno Aprovado");
        }
        else if (media<3)
        {
            JOptionPane.showMessageDialog(null, "Média = "+ String.format("%.2f" , media) +
                    "\nAluno Reprovado");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Média = "+ String.format("%.2f", media) +
                    "\nAluno em Exame");
        }
    }
}
