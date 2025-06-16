public class Estudiante extends Persona {

private int promedio;


public Estudiante(String nombre, String email, int promedio) {
    super(nombre, email);
    this.promedio = promedio;
}


//GETTERS AND SETTERS
public int getPromedio() {
    return promedio;
}

public void setPromedio(int promedio) {
    this.promedio = promedio;
}
//GETTERS AND SETTERS


}
