
import Main.Producto;
import Main.Inventario;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(3);

        Producto p1 = new Producto("111", "Mantecadas", 5);
        Producto p2 = new Producto("222", "Donitas", 5);
        Producto p3 = new Producto("333", "Rebanadas", 5);
        Producto p4 = new Producto("444", "Nito", 5);



        System.out.println("----------------------");
        System.out.println("Agregar productos:");
        System.out.println("Mantecadas: " + inventario.agregarProducto(p1));
        System.out.println("Donitas: " + inventario.agregarProducto(p2));
        System.out.println("Rebanadas: " + inventario.agregarProducto(p3));
        System.out.println("Nito: " + inventario.agregarProducto(p4));
        System.out.println("----------------------");

        inventario.mostrarProductos();
        System.out.println("Total de ítems: " + inventario.totalItems());
          System.out.println("----------------------");

        System.out.println("\nBuscar 222:");
        Producto encontrado = inventario.buscar("222");
        if (encontrado != null) {
            System.out.println(encontrado.getCodigo() + " - " + encontrado.getNombre() + " (" + encontrado.getCantidad() + ")");
        } else {
            System.out.println("No encontrado");
        }
        

        System.out.println("\nBuscar 444:");
        Producto noEncontrado = inventario.buscar("444");
        if (noEncontrado != null) {
            System.out.println(noEncontrado.getCodigo() + " - " + noEncontrado.getNombre() + " (" + noEncontrado.getCantidad() + ")");
        } else {
            System.out.println("No encontrado");
        }
          System.out.println("----------------------");

        System.out.println("\nEliminar 222:");
        System.out.println("Eliminado: " + inventario.eliminarProducto("222"));
        inventario.mostrarProductos();
        System.out.println("Total de ítems: " + inventario.totalItems());
          System.out.println("----------------------");

        System.out.println("\nIntentar agregar Nito de nuevo:");
        System.out.println("Nito: " + inventario.agregarProducto(p4));
        inventario.mostrarProductos();
        System.out.println("Total de ítems: " + inventario.totalItems());
          System.out.println("----------------------");
    }
}