import java.util.ArrayList;
import java.util.List;

public class BibliotecaVideoJuegos {

    private ArrayList<VideoJuego> tipoVideoJuegos;

    // Constructor que inicializa la lista de videojuegos
    public BibliotecaVideoJuegos() {
        tipoVideoJuegos = new ArrayList<>();
    }

    // Método para agregar un nuevo videojuego a la lista
    public void agregarVideoJuego(VideoJuego videoJuego) {
        tipoVideoJuegos.add(videoJuego);
    }

    // Método para listar todos los videojuegos en la lista
    public void listarVideoJuegos() {
        for (VideoJuego videoJuego : tipoVideoJuegos) {
            System.out.println(videoJuego);
        }
    }

    // Método para actualizar los datos de un videojuego existente
    public void actualizacionDeDatos(String tituloActual, String nuevoTitulo, int nuevaCantidadJugadores) throws VideoJuegoNoEncontradoException {
        boolean encontrado = false;
        for (VideoJuego videoJuego : tipoVideoJuegos) {
            if (videoJuego.getTitulo().equalsIgnoreCase(tituloActual)) {
                videoJuego.setTitulo(nuevoTitulo);
                videoJuego.setCantidadJugadores(nuevaCantidadJugadores);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new VideoJuegoNoEncontradoException("El VideoJuego " + tituloActual + " no existe.");
        }
    }
}
