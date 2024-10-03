//Creacion de una Excepcion personalizada
public class VideoJuegoNoEncontradoException extends Exception{

    public VideoJuegoNoEncontradoException() {
    }

    public VideoJuegoNoEncontradoException(String message) {
        super(message);
    }
}
