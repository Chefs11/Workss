public class Main {


    public static void main(String[] args) {
        
    
    EmpleadoTiempoCompleto Empleado = new EmpleadoTiempoCompleto("325591", "Julian", 1000, "Seguro");
    EmpleadoPorHoras Empleado1 = new EmpleadoPorHoras("325678", "Alan", 1000, "Seguro", 8);
    
System.out.println("");
System.out.println("------------------------------");
System.out.println("EMPLEADO POR HORAS");
System.out.println("ID: " + Empleado1.getId());
System.out.println("Nombre: " + Empleado1.getNombre());
System.out.println("Salario. " + Empleado1.calcularSalario());
System.out.println("------------------------------");
System.out.println("");

System.out.println("");
System.out.println("------------------------------");
System.out.println("EMPLEADO TIEMPO COMPLETO");
System.out.println("ID: " + Empleado.getId());
System.out.println("Nombre: " + Empleado.getNombre());
System.out.println("Beneficios: " + Empleado.getBeneficios());
System.out.println("Salario. " + Empleado.calcularSalario());
System.out.println("------------------------------");
System.out.println("");



}
}
