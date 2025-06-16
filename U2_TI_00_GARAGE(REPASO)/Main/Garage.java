public class Garage {

private Vehiculo[] espacios;

public Garage (int numEspacios) {
    espacios = new Vehiculo[numEspacios];
}

//ESTACIOAR EL CARRO 
public boolean estacionar(Vehiculo vehiculo) {
    for (int i= 0; i <espacios.length; i ++) {
        if (espacios[i] == null) {
            espacios [i] = vehiculo;
            return true;
        }
    }
    return false;
}




//RETIRAR EL CARRO
public boolean  retirar (String placa) {
    for (int i = 0; i < espacios.length; i ++){
        if (espacios[i] != null && espacios[i].getPlaca().equals(placa)){
            espacios[i] = null;
            return true;
        }
    }
    return false;
}


//CONTAR VEHICULOS


public int contarVehiculos() {
    int contador  = 0;
    for (int i = 0; i<espacios.length; i ++) {
        if (espacios [i] != null){
            contador ++;
   
        }
    }
    return contador;

}

}
