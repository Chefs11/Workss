public class Main {

    public static void main(String[] args) {
        
Garage garage = new Garage(4);

Coche vehiculo1 = new Coche("Audi", "325591A23", 2);
Motocicleta vehiculo2 = new Motocicleta("BMW", "ABC5643", false);
Coche vehiculo3 =  new Coche("Audi ", "ABFS5667", 4);
Motocicleta vehiculo4 = new Motocicleta("BMW", "1238DSHGD", true);
Coche vehiculo5 = new Coche("hONDA", "FUI3NF3UFN3    ", 2);





garage.estacionar(vehiculo1);
garage.estacionar(vehiculo2);
garage.estacionar(vehiculo3);
garage.estacionar(vehiculo4);
garage.estacionar(vehiculo5);

System.out.println("");
System.out.println("---Vehiculos---");
System.out.println("");
System.out.println("---Coches---");
System.out.println("Marca: " + vehiculo1.getMarca());
System.out.println("Placa: "+ vehiculo1.getPlaca());
System.out.println("Puertas: "+ vehiculo1.getNumeroPuertas());
System.out.println("");
System.out.println("Marca: " + vehiculo3.getMarca());
System.out.println("Placa: "+ vehiculo3.getPlaca());
System.out.println("Puertas: "+ vehiculo3.getNumeroPuertas());
System.out.println("");
System.out.println("---Motocicletas---");
System.out.println("Marca: " + vehiculo2.getMarca());
System.out.println("Placa: "+ vehiculo2.getPlaca());
System.out.println("Caja:: "+ vehiculo2.isTieneCaja());
System.out.println("");
System.out.println("Marca: " + vehiculo4.getMarca());
System.out.println("Placa: "+ vehiculo4.getPlaca());
System.out.println("Caja:: "+ vehiculo4.isTieneCaja());

 System.out.println("");
        System.out.println("Vehículos estacionados en el garage: " + garage.contarVehiculos());




    }

}
