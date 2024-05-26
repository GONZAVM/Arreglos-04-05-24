import javax.swing.*;
import java.util.Arrays;

public class Arreglos {

    public void mostrarVentana() {
        JFrame ventana = new JFrame("Copiar Arreglos");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        ventana.add(panel);
        placeComponents(panel);

        ventana.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel tituloLabel = new JLabel("Copiar Arreglos");
        tituloLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel.add(tituloLabel);

        JLabel arreglo1Label = new JLabel(copiarArreglo());
        arreglo1Label.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        panel.add(arreglo1Label);

        JLabel arreglo2Label = new JLabel(copiarOtroArreglo());
        arreglo2Label.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        panel.add(arreglo2Label);
    }

    public String copiarArreglo() {
        int[] arregloOriginal = {1, 2, 5, 10};
        int[] copia = new int[arregloOriginal.length];

        copia = Arrays.copyOf(arregloOriginal, copia.length);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < copia.length; i++) {
            sb.append("Elemento del nuevo arreglo: ").append(copia[i]).append("\n");
        }
        return sb.toString();
    }

    public String copiarOtroArreglo() {
        String[] palabras = {"Mouse", "Teclado", "Papel"};
        String[] copiaDePalabras = new String[palabras.length];

        copiaDePalabras = Arrays.copyOf(palabras, copiaDePalabras.length);

        StringBuilder sb = new StringBuilder();
        for (String palabra : copiaDePalabras) {
            sb.append(palabra).append("\t\t");
        }
        sb.append("\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        Arreglos arreglos = new Arreglos();
        arreglos.mostrarVentana();
    }
}
