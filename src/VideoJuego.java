public class VideoJuego {

    // Atributos de la clase VideoJuego
    private int codigo;
    private String titulo;
    private String consola;
    private int cantidadJugadores;
    private String categoria;

    // Constructor por defecto
    public VideoJuego() {
    }

    // Constructor que inicializa todos los atributos
    public VideoJuego(int codigo, String titulo, String consola, int cantidadJugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantidadJugadores = cantidadJugadores;
        this.categoria = categoria;
    }

    // Métodos getters y setters para cada atributo
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "VideoJuego{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", consola='" + consola + '\'' +
                ", cantidadJugadores=" + cantidadJugadores +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
