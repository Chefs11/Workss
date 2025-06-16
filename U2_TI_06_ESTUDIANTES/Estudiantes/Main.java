public class Main {

    public static void main(String[] args) {
        
            Curso curso = new Curso("3244", "Curso de Java", 3);

            Estudiante estudiante1 = new Estudiante("Alan Salgado", "20243ds078@utez.edu.mx", 10);
            Estudiante estudiante2 = new Estudiante("Valentina Caballero", "20243ds079@utez.edu.mx", 10);
            Estudiante estudiante3 = new Estudiante("Obed Salgado", "20243ds090@utez.edu.mx", 8);

            System.out.println("");
            System.out.println("---CURSO---");
            System.out.println("Nombre: " + curso.getNombreCurso());
            System.out.println("Codigo; " +curso.getCodigoCurso());
            System.out.println("");
           

            System.out.println("---Estudiantes---");
            System.out.println("");
            System.out.println("ESTUDIANTE 1");
            System.out.println("Nombre: " + estudiante1.getNombre());
            System.out.println("Email: " + estudiante1.getEmail());
            System.out.println("promedio : " + estudiante1.getPromedio());
            System.out.println("");

                    System.out.println("");
                    System.out.println("ESTUDIANTE 2");
                    System.out.println("Nombre: " + estudiante2.getNombre());
                    System.out.println("Email: " + estudiante2.getEmail());
                    System.out.println("promedio : " + estudiante2.getPromedio());
                    System.out.println("");

            System.out.println("ESTUDIANTE 3");
            System.out.println("Nombre: " + estudiante3.getNombre());
            System.out.println("Email: " + estudiante3.getEmail());
            System.out.println("promedio : " + estudiante3.getPromedio());
            System.out.println("");


            curso.inscritos(estudiante1);
            curso.inscritos(estudiante2);
            curso.inscritos(estudiante3);

            double promedio = curso.calcularPromedioGrupo();
            System.out.println("Promedio grupal " + promedio);










    }

}
