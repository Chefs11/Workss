import Banco.CuentaBancaria;
import javax.swing.JOptionPane;
public class Banco {
    public static void main(String[] args) {

      CuentaBancaria cb = new CuentaBancaria();

      cb.setTitular("Alan");
      





System.out.println("Titular: " + cb.getTitular());

      double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad a depositar")) ;
       cb.depositar(monto);
       System.out.println("Tu saldo es de: " + cb.getSaldo());



        monto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad a retirar")) ;
       cb.retirar(monto);
       System.out.println("Tu saldo es de: " + cb.getSaldo());


       monto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad a retirar")) ;
       cb.retirar(monto);
       System.out.println("Tu saldo es de: " + cb.getSaldo());


      


    


}
}