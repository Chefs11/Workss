package Main;
public class Producto {


    private String codigo;
    private String nombre;
    private int cantidad;



    public Producto(String codigo, String nombre, int cantidad) {
        setCodigo(codigo);
        setNombre(nombre);
        setCantidad(cantidad);
    }

            //Setters
            public void setCodigo(String codigo) {
                if (codigo != null) {
                    this.codigo = codigo;
                } else {
                    System.out.println("El codigo no uede estar vacio");
                }  
            }

            public void setCantidad(int cantidad) {
                if (cantidad >= 0) {
                    this.cantidad = cantidad;
                }else {
                    System.out.println("La cantidad debe ser mayor a 0");
                }
              
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }


            //Getters
            public String getCodigo() {
                return codigo;
            }


            public String getNombre() {
                return nombre;
            }


            public int getCantidad() {
                return cantidad;
            }


            

            


    



    






}
