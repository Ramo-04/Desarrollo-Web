import java.util.Scanner;

public class promedioAlumno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] porcentajeExamen = {0.9, 0.8, 0.85};
        double[] porcentajeTareas = {0.1, 0.2, 0.15};

        double promedioGeneral = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la calificación del examen de la materia " + (i + 1) + ": ");
            double calificacionExamen = scanner.nextDouble();

            double sumaTareas = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.print("Ingrese la calificación de la tarea " + j + " de la materia " + (i + 1) + ": ");
                sumaTareas += scanner.nextDouble();
            }

            double promedioTareas = sumaTareas / 3;

            double promedioMateria = calificacionExamen * porcentajeExamen[i] + promedioTareas * porcentajeTareas[i];

            System.out.println("El promedio en la materia " + (i + 1) + " es: " + promedioMateria);

            promedioGeneral += promedioMateria;
        }

        promedioGeneral /= 3;

        System.out.println("El promedio general es: " + promedioGeneral);

        // Cerrar el scanner
        scanner.close();
    }
}
