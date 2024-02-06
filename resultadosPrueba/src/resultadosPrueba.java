import java.util.Scanner;

public class resultadosPrueba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int todasCorrectas = 0;
        int primeraSegundaCorrectas = 0;
        int primeraTerceraCorrectas = 0;
        int segundaTerceraCorrectas = 0;
        int alMenosPrimeraCorrecta = 0;
        int alMenosSegundaCorrecta = 0;
        int alMenosTerceraCorrecta = 0;
        int ningunaCorrecta = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println("Persona " + i + ":");
            System.out.print("¿Correcta la primera pregunta? (S/N): ");
            char primera = scanner.next().charAt(0);

            System.out.print("¿Correcta la segunda pregunta? (S/N): ");
            char segunda = scanner.next().charAt(0);

            System.out.print("¿Correcta la tercera pregunta? (S/N): ");
            char tercera = scanner.next().charAt(0);

            if (primera == 'S' && segunda == 'S' && tercera == 'S') {
                todasCorrectas++;
            }
            if (primera == 'S' && segunda == 'S' && tercera == 'N') {
                primeraSegundaCorrectas++;
            }
            if (primera == 'S' && segunda == 'N' && tercera == 'S') {
                primeraTerceraCorrectas++;
            }
            if (primera == 'N' && segunda == 'S' && tercera == 'S') {
                segundaTerceraCorrectas++;
            }

            if (primera == 'S' || segunda == 'S' || tercera == 'S') {
                alMenosPrimeraCorrecta++;
            }

        }

        ningunaCorrecta = 100 - alMenosPrimeraCorrecta;

        System.out.println("a. Correctamente las tres preguntas: " + todasCorrectas);
        System.out.println("b. Correctamente primera y segunda pregunta: " + primeraSegundaCorrectas);
        System.out.println("c. Correctamente primera y tercera pregunta: " + primeraTerceraCorrectas);
        System.out.println("d. Correctamente segunda y tercera pregunta: " + segundaTerceraCorrectas);
        System.out.println("e. Correctamente al menos la primera pregunta: " + alMenosPrimeraCorrecta);
        System.out.println("f. Correctamente al menos la segunda pregunta: " + alMenosSegundaCorrecta);
        System.out.println("g. Correctamente al menos la tercera pregunta: " + alMenosTerceraCorrecta);
        System.out.println("h. No respondieron correctamente ninguna pregunta: " + ningunaCorrecta);

        scanner.close();
    }
}
