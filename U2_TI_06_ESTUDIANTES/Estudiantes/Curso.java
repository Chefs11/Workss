public class Curso  {

    private String codigoCurso;
    private String nombreCurso;
    private Estudiante [] inscritos;
    
    
    public Curso (String codigoCurso, String nombreCurso, int capacidad) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.inscritos = new Estudiante[3];
    }




    public boolean inscritos (Estudiante estudiante) {
        for(int i = 0; i<inscritos.length; i++) {
            if (inscritos [i] == null) {
                inscritos [i] = estudiante;
                return true;
            }
        }
        return false;

    }



    public double calcularPromedioGrupo() {
    double suma = 0;
    int contador = 0;

    for (int i = 0; i < inscritos.length; i++) {
        if (inscritos[i] != null) {
            suma = suma + inscritos[i].getPromedio(); // ← esta es la línea modificada
            contador = contador + 1;
        }
    }

    if (contador == 0) {
        return 0;
    }

    return suma / contador;
}
    



    
    public String getCodigoCurso() {
        return codigoCurso;
    }
    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    public Estudiante[] getInscritos() {
        return inscritos;
    }
    public void setInscritos(Estudiante[] inscritos) {
        this.inscritos = inscritos;
    }

    
}
