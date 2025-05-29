package Password;
public class UsuarioSeguro {

    private String nombreUsuario;
    private String password;
    
    
    
    
    
//-----------------------------------------------
        public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario != null && !nombreUsuario.isEmpty())  {
             this.nombreUsuario = nombreUsuario;
            System.out.println("Usuario: " + nombreUsuario);
 
        } else{
System.out.println("El nombre es invalido");
        }
    
    }

    //------------------------------------------------
    public void setPassword(String password) {
        boolean esMinuscula = false;
        boolean esMayuscula = false;
        boolean esDigito = false;

        if (password.length() < 8) {
        
            System.out.println("La contraseña debe ser al menos de 8 caracteres");
            return;
        }else {
    
              
              for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)){
                    esMayuscula = true;
                } else if (Character.isLowerCase(c)) {
                    esMinuscula = true;
                } else if (Character.isDigit(c)) {
                    esDigito = true;
                }
        }                   
       
       
       }
        //preguntar si todas son true entonces todo esta ok sino algo est mal
        
        if (esDigito == true && esMayuscula == true && esMinuscula){
               this.password = password;
            System.out.println("La contraseña se guardó correctamente");
        } else {
            if (!esMayuscula) {
               System.out.println("La contraseña debe tener al menos una letra mayúscula");
              }
         if (!esMinuscula) {
        System.out.println("La contraseña debe tener al menos una letra minúscula");
            }
            if (!esDigito) {
                System.out.println("La contraseña debe tener al menos un número");
            }
            
            }

            

        }
                    public boolean autenticar(String intentPassword) {
                if (this.password == null) {
                    System.out.println("No hay contraseña guardada.");
                    return false;
                }
                return this.password.equals(intentPassword);
               }
      
    //-------------------------------------------------

}

