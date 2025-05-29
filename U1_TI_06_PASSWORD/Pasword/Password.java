import Password.UsuarioSeguro;
import javax.swing.JOptionPane;

public class Password {
public static void main(String[] args) {

    UsuarioSeguro us = new UsuarioSeguro();    

    
    String nombreUsuario = JOptionPane.showInputDialog("Ingresa tu nombre de usuario");
    us.setNombreUsuario(nombreUsuario);

    String password = JOptionPane.showInputDialog("Ingresa una contraseña");
    us.setPassword(password);
    
    
    String intento = JOptionPane.showInputDialog("Ingresa la contraseña para autenticar");

        if (us.autenticar(intento)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

    
}

}