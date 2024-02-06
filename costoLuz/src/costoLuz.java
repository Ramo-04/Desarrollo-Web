import java.util.Scanner;

public class costoLuz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir las lecturas del contador
        System.out.print("Ingrese la lectura anterior del contador: ");
        int lecturaAnterior = scanner.nextInt();
        System.out.print("Ingrese la lectura actual del contador: ");
        int lecturaActual = scanner.nextInt();

        // Pedir el costo por kilovatio
        System.out.print("Ingrese el costo por kilovatio: ");
        double costoKilovatio = scanner.nextDouble();

        // Calcular el consumo de energía
        int consumo = lecturaActual - lecturaAnterior;

        // Calcular el costo total
        double costoTotal = consumo * costoKilovatio;

        // Mostrar el resultado
        System.out.println("El consumo de energía en este mes fue de: " + consumo + " kWh");
        System.out.printf("El costo total a pagar es de: $%,.2f", costoTotal);
    }
}
