import java.util.Scanner;

public class fabricacionPiezas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double longitudLamina = 4.0; // en metros
        double anchoLamina = 1.5; // en metros
        double consumoPorPieza = 0.5; // en metros

        double areaLamina = longitudLamina * anchoLamina;

        int piezasFabricadas = (int) (areaLamina / consumoPorPieza);

        double desperdicio = areaLamina % consumoPorPieza;

        System.out.println("Con una lámina se pueden fabricar " + piezasFabricadas + " piezas.");
        System.out.println("El desperdicio será de " + desperdicio + " metros cuadrados.");

        scanner.close();
    }
}
