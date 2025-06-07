package Main;

public class Inventario {
    private Producto[] stock;

    public Inventario(int tamaño) {
        stock = new Producto[tamaño];
    }

    public boolean agregarProducto(Producto p) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == null) {
                stock[i] = p;
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProducto(String codigo) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null && stock[i].getCodigo().equals(codigo)) {
                stock[i] = null;
                return true;
            }
        }
        return false;
    }

    public Producto buscar(String codigo) {
        for (Producto p : stock) {
            if (p != null && p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public int totalItems() {
        int total = 0;
        for (Producto p : stock) {
            if (p != null) {
                total += p.getCantidad();
            }
        }
        return total;
    }

    public void mostrarProductos() {
        System.out.println("Productos en inventario:");
        for (Producto p : stock) {
            if (p != null) {
                System.out.println(p.getCodigo() + " - " + p.getNombre() + " (" + p.getCantidad() + ")");
            }
        }
    }
}