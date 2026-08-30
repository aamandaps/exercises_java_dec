import javax.swing.JOptionPane;

public class ex08 {

    /* Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em
     horas e minutos, sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro. */

    public static void main(String[] args){

        int hora_i, hora_f, min_i, min_f, qnt_hora, qnt_min;

        hora_i = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora inicial do jogo: "));
        min_i = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto inicial do jogo: "));
        hora_f = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora final do jogo: "));
        min_f = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto final do jogo: "));

        // Verificando hora
        if (hora_f<hora_i)
        {
            hora_f = hora_f + 24;
        }
        // Verificando minuto
        else if (min_f<min_i)
        {
            min_f = min_f + 60;
            hora_f = hora_f - 1;
        }

        // Cálculo
        qnt_hora = hora_f - hora_i;
        qnt_min = min_f - min_i;

        JOptionPane.showMessageDialog(null, "Você jogou por "+qnt_hora+"hr e "+qnt_min+"min.");

    }

}
