import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws VideoJuegoNoEncontradoException {

        // Instanciando un objeto de la clase BibliotecaVideoJuegos
        BibliotecaVideoJuegos tipoVideoJuego = new BibliotecaVideoJuegos();

        // Uso de Scanner para la inserción de datos
        Scanner teclado1 = new Scanner(System.in); // Scanner para entradas de tipo int
        Scanner teclado2 = new Scanner(System.in); // Scanner para entradas de tipo String

        // Menú de Opciones
        String menu = """
                1 - Agregar VideoJuego.
                2 - Listar VideoJuegos.
                3 - Actualizar VideoJuegos.
                4 - Salir.
                """;

        // Creación de variables para VideoJuego y otros
        int opcion = 0;
        int codigo = 0;
        String titulo;
        String consola;
        int cantidadJugadores;
        String categoria;

        String nuevoTitulo;
        int nuevaCantidadJugadores = 0;

        // Bucle que muestra el menú hasta que el usuario elija la opción 4 (Salir)
        while (opcion != 4) {
            // Mostrar el menú y solicitar al usuario la operación que desea realizar
            System.out.println(menu);
            System.out.println("¿Qué operación desea realizar?: ");
            opcion = teclado1.nextInt();

            if (opcion == 1) {

                System.out.println("Agregue el número de código: ");
                codigo = teclado1.nextInt();
                teclado1.nextLine();
                System.out.println("Ingrese el nombre del título: ");
                titulo = teclado2.nextLine();
                System.out.println("Ingrese el tipo de consola: ");
                consola = teclado2.nextLine();
                System.out.println("Ingrese la cantidad de jugadores: ");
                cantidadJugadores = teclado1.nextInt();
                teclado1.nextLine();
                System.out.println("Ingrese la categoría: ");
                categoria = teclado2.nextLine();

                // Crear un nuevo objeto VideoJuego y agregarlo a la lista
                VideoJuego videoJuego = new VideoJuego(codigo, titulo, consola, cantidadJugadores, categoria);
                tipoVideoJuego.agregarVideoJuego(videoJuego);

            } else if (opcion == 2) {

                System.out.println("Lista de los VideoJuegos:");
                tipoVideoJuego.listarVideoJuegos();

            } else if (opcion == 3) {
                // Opción 3: Actualizar datos de un videojuego existente
                System.out.println("Escriba el nombre del título actual: ");
                titulo = teclado2.nextLine();
                System.out.println("Escriba el nombre del nuevo título: ");
                nuevoTitulo = teclado2.nextLine();
                System.out.println("Escriba la nueva cantidad de jugadores: ");
                nuevaCantidadJugadores = teclado1.nextInt();

                // Manejo de excepciones en caso de que no exista el videojuego
                try {
                    tipoVideoJuego.actualizacionDeDatos(titulo, nuevoTitulo, nuevaCantidadJugadores);
                } catch (VideoJuegoNoEncontradoException e) {
                    System.out.println(e.getMessage()); // Imprime el mensaje de la excepción
                }
            }
        }

        // Fin del bucle y finalización del programa
        System.out.println("Fin del Programa");
    }
}
