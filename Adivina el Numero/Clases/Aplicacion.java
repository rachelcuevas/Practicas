package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intentos = new ArrayList<>();

        // Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int numeroUsuario;
        String resultado;

        System.out.println("¡Bienvenido al juego de Adivina el Número!");

        // Bucle que continúa hasta que el usuario adivine el número
        do {
            // Pedir número al usuario
            System.out.print("Por favor ingresa un número entre 1 - 100: ");
            numeroUsuario = scanner.nextInt();

            // Guardar el intento en el ArrayList
            intentos.add(numeroUsuario);

            // Comparar los números usando el método estático
            resultado = AdivinaNumero.adivinaNumero(numeroUsuario, numeroAleatorio);

            // Mostrar el resultado
            System.out.println(resultado);
        } while (!resultado.equals("¡Has conseguido adivinar el número!"));  // Condición correcta

        // Mostrar todos los intentos realizados
        System.out.println("Felicidades, Adivinaste el numero en: " + intentos.size() + " intentos. ");
        System.out.println("Intentos realizados: " + intentos);

        // Cerrar el Scanner
        scanner.close();
    }
}