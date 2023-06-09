import Entidad.Persona;
import Servicio.PersonaService;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Persona juan = new Persona("juan", 23, "salamanca");
        PersonaService perSerivicio = new PersonaService();
        Persona personaManual = perSerivicio.crearPersona();
        System.out.println("finalizado");
    }
}
