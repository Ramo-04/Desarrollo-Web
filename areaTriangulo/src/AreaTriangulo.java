import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado a: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado b: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Ingrese la longitud del lado c: ");
        double ladoC = scanner.nextDouble();

        double semiperimetro = (ladoA + ladoB + ladoC) / 2;

        double areaTriangulo = semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC);

        areaTriangulo = areaTriangulo * areaTriangulo;

        System.out.println("El área del triángulo es: " + areaTriangulo);

        scanner.close();
    }
}
