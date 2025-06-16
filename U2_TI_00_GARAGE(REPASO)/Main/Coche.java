public class Coche extends Vehiculo{

private int numeroPuertas;


public Coche (String marca, String placa, int numeroPuertas ) {
    super(marca, placa);
    this.numeroPuertas = numeroPuertas;
}


public int getNumeroPuertas() {
    return numeroPuertas;
}

public void setNumeroPuertas(int numeroPuertas) {
    this.numeroPuertas = numeroPuertas;
}




}
