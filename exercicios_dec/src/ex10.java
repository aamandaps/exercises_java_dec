import javax.swing.JOptionPane;

public class ex10 {

    /* Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
    Calcule e mostre a velocidade média em km/h. */

    public static void main (String[] args) {

        int qnt_v;
        double vel_m, tempo, metros;

        qnt_v = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas: "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo do percurso(em minutos): "));
        metros = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos metros foram percorridos: "));

        // Verificando qnt de voltas
        if(qnt_v>1)
        {
            metros = (qnt_v*metros);
            metros = (metros/1000);
            tempo = (tempo/60);
            vel_m = (metros/tempo);

            JOptionPane.showMessageDialog(null, "A velocidade média desse percurso foi: "+
                    String.format("%.2f" , vel_m)+"km/h");
        }
        else if (qnt_v == 1)
        {
            metros = (metros/1000);
            tempo = (tempo/60);
            vel_m = (metros/tempo);

            JOptionPane.showMessageDialog(null, "A velocidade média desse percurso foi: "+
                    String.format("%.2f", vel_m)+"km/h");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Insira um número de voltas maior OU igual à 1.");
        } // Fim Verificação

    }

}
