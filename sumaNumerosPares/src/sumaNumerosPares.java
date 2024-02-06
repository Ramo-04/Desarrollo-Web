public class sumaNumerosPares {

    public static void main(String[] args) {
        int suma = 0;

        for (int i = 97; i <= 1003; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de los números pares entre 97 y 1003 es: " + suma);
    }
}
