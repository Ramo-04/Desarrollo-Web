import java.util.Scanner;

public class signoZodiacal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la fecha de nacimiento (DD/MM): ");
        String fechaNacimiento = scanner.next();

        int dia = Integer.parseInt(fechaNacimiento.substring(0, 2));
        int mes = Integer.parseInt(fechaNacimiento.substring(3, 5));

        String signo = determinarSignoZodiaco(dia, mes);

        int edad = calcularEdad();

        System.out.println("Signo del zodiaco: " + signo);
        System.out.println("Edad: " + edad + " años");

        scanner.close();
    }

    private static String determinarSignoZodiaco(int dia, int mes) {
        if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            return "Acuario";
        } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 19)) {
            return "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 22)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 23) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else {
            return "Escorpio";
        }
    }

    private static int calcularEdad() {
        int añoActual = 2024;
        int mesActual = 1;
        int diaActual = 28;

        int añoNacimiento = 1990;
        int mesNacimiento = 8;
        int diaNacimiento = 15;

        int edad = añoActual - añoNacimiento;

        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }

        return edad;
    }
}
