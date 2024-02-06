import java.util.Scanner;

public class porcentajeHombresMujeres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de hombres en el grupo: ");
        int cantidadHombres = scanner.nextInt();

        System.out.print("Ingrese la cantidad de mujeres en el grupo: ");
        int cantidadMujeres = scanner.nextInt();

        int totalEstudiantes = cantidadHombres + cantidadMujeres;

        double porcentajeHombres = (double) cantidadHombres / totalEstudiantes * 100;
        double porcentajeMujeres = (double) cantidadMujeres / totalEstudiantes * 100;

        // Mostrar el resultado
        System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");

        scanner.close();
    }
}
