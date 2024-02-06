import java.util.Scanner;

public class sueldoAumento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría del trabajador (1-4): ");
        int categoria = scanner.nextInt();

        System.out.print("Ingrese el sueldo del trabajador: $");
        double sueldo = scanner.nextDouble();

        double porcentajeAumento = 0.0;

        switch (categoria) {
            case 1:
                porcentajeAumento = 0.15;
                break;
            case 2:
                porcentajeAumento = 0.10;
                break;
            case 3:
                porcentajeAumento = 0.08;
                break;
            case 4:
                porcentajeAumento = 0.07;
                break;
            default:
                System.out.println("Categoría no válida. Debe ser 1, 2, 3 o 4.");
                scanner.close();
                return;
        }

        double aumento = sueldo * porcentajeAumento;
        double nuevoSueldo = sueldo + aumento;

        System.out.println("Categoría del trabajador: " + categoria);
        System.out.println("Sueldo anterior: $" + sueldo);
        System.out.println("Porcentaje de aumento: " + (porcentajeAumento * 100) + "%");
        System.out.println("Aumento: $" + aumento);
        System.out.println("Nuevo sueldo: $" + nuevoSueldo);

        scanner.close();
    }
}
