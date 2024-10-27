import java.util.Scanner;

public class Login {

    // Credenciales estáticas
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "12345";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de login.");
        
        // Solicitar nombre de usuario
        System.out.print("Ingrese su usuario: ");
        String inputUsername = scanner.nextLine();

        // Solicitar contraseña
        System.out.print("Ingrese su contraseña: ");
        String inputPassword = scanner.nextLine();

        // Validar credenciales
        if (authenticate(inputUsername, inputPassword)) {
            System.out.println("Datos correctos. ¡Bienvenido, " + inputUsername);
        } else {
            System.out.println("Usuario o contraseña incorrectos. Inténtalo de nuevo.");
        }

        scanner.close();
    }

    //Autenticación de datos
    private static boolean authenticate(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}