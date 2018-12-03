/*
 *Escribir una frase y contabilizar tiempo
 */
package boletin11_cuantotarda;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Boletin11_CuantoTarda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //usar el equals para comparar la frase dada con la frase escrita
        // if (fraseDada.equals(fraseEscrita)==true)
        // mide el tiempo
        long inicio, fin, Empezar;
        String fraseDada, fraseEscrita;

        Empezar = JOptionPane.showOptionDialog(null, "DESEA INICIAR EL PROGRAMA?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        while (Empezar == 0) {
            fraseDada = "A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática.";
            inicio = System.currentTimeMillis();
            fraseEscrita = JOptionPane.showInputDialog(null, "Escriba la siguiente frase" + "\n A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática.");
            while (fraseDada.equals(fraseEscrita) != true) {
                fraseEscrita = JOptionPane.showInputDialog(null, "Escriba la siguiente frase" + "\n A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática.");
            }
            fin = System.currentTimeMillis();
            long total = fin - inicio;
            JOptionPane.showMessageDialog(null, "Tardaches " + (total / 1000) + " segundos en escribir a frase");
            break;

        }

    }
}
