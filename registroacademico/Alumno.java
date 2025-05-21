package registroacademico;

public class Alumno extends DatoGeneral {
   private String nCarnet;
   private String encargado;
   public Alumno() {
   }
   public Alumno(String nombre, String direccion, String telefono, String email, String nCarnet, String encargado) {
    super(nombre, direccion, telefono, email);
    this.nCarnet = nCarnet;
    this.encargado = encargado;
   }
   public String getnCarnet() {
    return nCarnet;
   }
   public void setnCarnet(String nCarnet) {
    this.nCarnet = nCarnet;
   }
   public String getEncargado() {
    return encargado;
   }
   public void setEncargado(String encargado) {
    this.encargado = encargado;
   }
public void verNotas() {
    System.out.println("Notas del alumno " + getNombre() + ":");
    // Aquí se pueden agregar las notas del alumno
    // Por ejemplo, se puede usar un arreglo o una lista para almacenar las notas
    // y luego imprimirlas.
}
 public void entregarNotas() {
    System.out.println("Entrega de tarea del alumno " + getNombre() + ":");
    // Aquí se puede implementar la lógica para entregar las notas al alumno
    // Por ejemplo, se puede enviar un correo electrónico con las notas adjuntas.
}
 @Override
 public void registrar() {
    System.out.println("Registro de alumno:  Clase hija");
    System.out.println("Número de carnet: " + nCarnet);
    System.out.println("Encargado: " + encargado);
 }
 @Override
 public void imprimir() {
    // TODO Auto-generated method stub
    System.out.println("Imprimiendo datos del alumno: " );
    
 }

}
