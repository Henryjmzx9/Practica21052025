import registroacademico.Alumno;
import registroacademico.DatoGeneral;
import registroacademico.ISearch;
import registroacademico.Maestro;
public class Main {
public static void main(String[] args) {
    // Crear un objeto Alumno
   Alumno alumno = new Alumno();
 
    alumno.setNombre("Juan Perez");
    alumno.setDireccion("Calle 123");
    alumno.registrar();
    alumno.modificar();
    Maestro maestro = new Maestro();
  maestro.setNombre("Maria Lopez");
    maestro.setDireccion("Calle 456");
    maestro.registrar();
    maestro.modificar();
} 
public static void ver (ISearch iSearch) {
    iSearch.obtenerPotId(1);
    iSearch.obtenerTodos();

}
}

