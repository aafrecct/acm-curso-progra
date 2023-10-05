import java.security.SecureRandom;
import java.util.Scanner;

class PassWordGen {
  static SecureRandom rand = new SecureRandom();
  static Scanner scanner = new Scanner(System.in);

  /* COMPLICADO
  Intenta entender el código pero puede ser un poco complejo de entender.
  Intenta ir linea a linea y entender qué hace el programa en cada momento. */
  static String caracteresPosibles(String[] gruposCaracteres, boolean[] incluir) {
    String resultado = "";
    for (int i = 0; i < gruposCaracteres.length; i++) {
      if (incluir[i]) {
        resultado += gruposCaracteres[i];
      }
    }
    return resultado;
  }

  /* COMPLICADO
   * Son muchas funciones dentro de otras funciones.
   * ¿Eres capaz de entender qué está ocurriendo? */
  static char generarCaracter(String posibilidades) {
    return posibilidades.charAt(rand.nextInt(posibilidades.length()));
  }

  /* ATENCIÓN
   * Esta función se llama a sí misma, eso es raro.
   * Observa lo que ocurre poniendo algo que no sea 'si' o 'no'. */
  static boolean respuestaUsuario(String input) {
    switch (input.strip().toLowerCase()) {
      case "si":
        return true;
      case "no":
        return false;
      default:
        System.out.println("Por favor, reponde 'si' o 'no'");
        return respuestaUsuario(scanner.nextLine());
    }
  }

  /* EXPLICADO
   * Presta atención a los comentarios antes de cada parte para entender lo que hace.
   */
  static public void main(String[] args) {
    // Creamos un resultado vacío.
    String resultado = "";

    // Creamos los grupos de caracteres que vamos a utilizar.
    String minusculas = "abcdefghijklmnopqrstuvwxyz";
    String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String numeros = "1234567890";
    String simbolos = "?!-_*";
    // Ponemos todos en un array para agruparlos.
    String[] caracteres = {minusculas, mayusculas, numeros, simbolos};

    // Preguntamos la longitud de la contraseña.
    System.out.print("Introduce la longitud de la contraseña: ");
    int longitud = Integer.parseInt(scanner.nextLine());

    // Preguntamos qué simbolos queremos incluir.
    System.out.print("¿Quieres incluir letras minusculas? ");
    boolean incluirMinusculas = respuestaUsuario(scanner.nextLine());
    System.out.print("¿Quieres incluir letras mayusculas? ");
    boolean incluirMayusculas = respuestaUsuario(scanner.nextLine());
    System.out.print("¿Quieres incluir números? ");
    boolean incluirNumeros = respuestaUsuario(scanner.nextLine());
    System.out.print("¿Quieres incluir símbolos? ");
    boolean incluirSimbolos = respuestaUsuario(scanner.nextLine());
    // Ponemos todos en un array para agruparlos.
    boolean[] incluir = {incluirMinusculas, incluirMayusculas, incluirNumeros, incluirSimbolos};

    // Llamamos a la función para crear una String con todos los caracteres que
    // vamos a utilizar.
    String caracteresPosibles = caracteresPosibles(caracteres, incluir);

    // Generamos la contraseña
    for (int i = 0; i < longitud; i++) {
      resultado += generarCaracter(caracteresPosibles);
    }

    // Imprimimos la contraseña
    System.out.println("Su contraseña es: " + resultado);
  }
}
