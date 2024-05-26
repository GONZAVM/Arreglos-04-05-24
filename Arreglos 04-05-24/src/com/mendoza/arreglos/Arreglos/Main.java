import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Arreglos arreglos = new Arreglos();
        Archivos archivos = new Archivos();

        String informacion = null;
        try {
            informacion = arreglos.copiarArreglo() + arreglos.copiarOtroArreglo();
        } catch (Exception e) {
            System.err.println("Error al obtener la información: " + e.getMessage());
            return;
        }

        try {
            archivos.guardarInformacionEnArchivo(informacion);
            System.out.println("Información guardada correctamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al guardar la información en el archivo: " + e.getMessage());
        }
    }
}
