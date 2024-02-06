import java.util.Scanner;

public class Reforestacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la superficie del bosque en hectáreas: ");
        double superficieHectareas = scanner.nextDouble();

        double superficieMetrosCuadrados = superficieHectareas * 10000;

        int numPinos, numOyameles, numCedros;

        if (superficieMetrosCuadrados > 1000000) {
            numPinos = (int) (0.7 * superficieMetrosCuadrados / 10);
            numOyameles = (int) (0.2 * superficieMetrosCuadrados / 15);
            numCedros = (int) (0.1 * superficieMetrosCuadrados / 18);
        } else {
            numPinos = (int) (0.5 * superficieMetrosCuadrados / 10);
            numOyameles = (int) (0.3 * superficieMetrosCuadrados / 15);
            numCedros = (int) (0.2 * superficieMetrosCuadrados / 18);
        }

        System.out.println("Número de pinos a sembrar: " + numPinos);
        System.out.println("Número de oyameles a sembrar: " + numOyameles);
        System.out.println("Número de cedros a sembrar: " + numCedros);

        scanner.close();
    }
}
