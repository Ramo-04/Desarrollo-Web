import java.util.Scanner;

public class diagnosticoAnemia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el nivel de hemoglobina (en g%): ");
        double nivelHemoglobina = scanner.nextDouble();

        System.out.print("Ingrese el sexo de la persona (M para masculino, F para femenino): ");
        char sexo = scanner.next().charAt(0);

        boolean tieneAnemia = DiagnosticoAnemia(edad, nivelHemoglobina, sexo);

        if (tieneAnemia) {
            System.out.println("La persona tiene anemia.");
        } else {
            System.out.println("La persona no tiene anemia.");
        }

        scanner.close();
    }

    private static boolean DiagnosticoAnemia(int edad, double nivelHemoglobina, char sexo) {
        if (edad >= 0 && edad <= 1) {
            return (sexo == 'M' && nivelHemoglobina < 13) || (sexo == 'F' && nivelHemoglobina < 13);
        } else if (edad > 1 && edad <= 6) {
            return nivelHemoglobina < 10;
        } else if (edad > 6 && edad <= 12) {
            return nivelHemoglobina < 11;
        } else if (edad > 12 && edad <= 60) {
            if (sexo == 'M') {
                return nivelHemoglobina < 14;
            } else if (sexo == 'F') {
                return nivelHemoglobina < 12;
            }
        } else {
            return (sexo == 'M' && nivelHemoglobina < 14) || (sexo == 'F' && nivelHemoglobina < 12);
        }

        return false;
    }
}

