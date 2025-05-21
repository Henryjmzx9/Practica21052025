package registroacademico;

public class Maestro extends DatoGeneral{
private String dui;
private String grados;
public Maestro() {
}
public Maestro(String nombre, String direccion, String telefono, String email, String dui, String grados) {
    super(nombre, direccion, telefono, email);
    this.dui = dui;
    this.grados = grados;
}
public String getDui() {
    return dui;
}
public void setDui(String dui) {
    this.dui = dui;
}
public String getGrados() {
    return grados;
}
public void setGrados(String grados) {
    this.grados = grados;
}
public void pasarLista() {
    System.out.println("Pasar lista del maestro " + getNombre() + ":");
    // Aquí se puede implementar la lógica para pasar lista
    // Por ejemplo, se puede imprimir una lista de alumnos o enviar un correo electrónico.
}

}
