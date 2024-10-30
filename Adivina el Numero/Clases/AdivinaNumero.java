package Clases;

public class AdivinaNumero {
    // Método que compara dos números
    public static String adivinaNumero(int numeroUsuario, int numeroAleatorio) {

        if (numeroUsuario == numeroAleatorio) {
            return "¡Has conseguido adivinar el número!";
        } else if (numeroUsuario < numeroAleatorio) {
            return "Intenta con uno más grande.";
        } else {
            return "Intenta con uno más pequeño.";
        }
    }
}