import Entidad.Libro;
import Servicio.LibroService;

public class App {
    public static void main(String[] args) throws Exception {
        LibroService libroService = new LibroService();
        Libro libro = libroService.crearLibro();
    }
}
