import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String usuario;
        // Declaracion de variables
        String saludo = "Hola";
        String nombre = "Jose";

        System.out.println("Hola Mundo");

        // Concatenación
        System.out.println(saludo + " " + nombre);

        // Leer datos
        System.out.println("Ingresa tu nombre completo: ");
        usuario = scanner.nextLine();

        System.out.println("El usuario que ingresaste fue: " + usuario);
    }
}
