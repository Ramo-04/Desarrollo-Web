import java.util.Random;

public class SopaDeLetras {

    public static void main(String[] args) {
        String[] palabras = {"objeto", "clase", "herencia", "polimorfismo", "encapsulamiento",
                "abstraccion", "instancia", "metodo", "paquete", "enums", "wapper class"};

        char[][] sopaDeLetras = generarSopaDeLetras(palabras);

        imprimirSopaDeLetras(sopaDeLetras);
    }

    private static char[][] generarSopaDeLetras(String[] palabras) {
        int tamañoSopa = 12; // Puedes ajustar el tamaño según tus necesidades
        char[][] sopaDeLetras = new char[tamañoSopa][tamañoSopa];
        Random random = new Random();

        // Llenar la sopa de letras con caracteres aleatorios
        for (int i = 0; i < tamañoSopa; i++) {
            for (int j = 0; j < tamañoSopa; j++) {
                sopaDeLetras[i][j] = (char) ('A' + random.nextInt(26));
            }
        }

        // Colocar las palabras en la sopa de letras
        for (String palabra : palabras) {
            boolean colocada = false;
            while (!colocada) {
                int fila = random.nextInt(tamañoSopa);
                int columna = random.nextInt(tamañoSopa);
                boolean horizontal = random.nextBoolean();
                boolean vertical = !horizontal;

                if (puedeColocarPalabra(sopaDeLetras, palabra, fila, columna, horizontal, vertical)) {
                    colocarPalabra(sopaDeLetras, palabra, fila, columna, horizontal, vertical);
                    colocada = true;
                }
            }
        }

        return sopaDeLetras;
    }

    private static boolean puedeColocarPalabra(char[][] sopaDeLetras, String palabra,
                                               int fila, int columna, boolean horizontal, boolean vertical) {
        int longitud = palabra.length();

        if (horizontal && columna + longitud <= sopaDeLetras.length) {
            for (int i = 0; i < longitud; i++) {
                if (sopaDeLetras[fila][columna + i] != 0 && sopaDeLetras[fila][columna + i] != palabra.charAt(i)) {
                    return false;
                }
            }
            return true;
        } else if (vertical && fila + longitud <= sopaDeLetras.length) {
            for (int i = 0; i < longitud; i++) {
                if (sopaDeLetras[fila + i][columna] != 0 && sopaDeLetras[fila + i][columna] != palabra.charAt(i)) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    private static void colocarPalabra(char[][] sopaDeLetras, String palabra,
                                       int fila, int columna, boolean horizontal, boolean vertical) {
        int longitud = palabra.length();

        if (horizontal) {
            for (int i = 0; i < longitud; i++) {
                sopaDeLetras[fila][columna + i] = palabra.charAt(i);
            }
        } else if (vertical) {
            for (int i = 0; i < longitud; i++) {
                sopaDeLetras[fila + i][columna] = palabra.charAt(i);
            }
        }
    }

    private static void imprimirSopaDeLetras(char[][] sopaDeLetras) {
        for (char[] fila : sopaDeLetras) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
