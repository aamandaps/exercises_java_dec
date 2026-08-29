import javax.swing.JOptionPane;

public class ex01 {

    // Algoritmo que mostra a diferença entre dois valores

    public static void main (String[] args) {
        int n1, n2, dif;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro valor inteiro: "));

        if (n1 > n2)
        {
            dif = (n1-n2);
        }
        else
        {
            dif = (n2-n1);
        } //Fim Condicional

        JOptionPane.showMessageDialog(null,
                "A diferença entre esses valores é igual à: "+ dif);
    }

}
