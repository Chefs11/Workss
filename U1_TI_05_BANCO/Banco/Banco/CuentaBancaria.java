package Banco;
public class CuentaBancaria {
    private String titular;
    private double saldo;
   
    
   //--------------------------------

   

   public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    
    //--------------------------------


                    public void depositar (double monto) {
                        if (monto > 0) {
                            saldo = saldo + monto;
                        } else {
                            System.out.println("El saldo es menor a 0");
                        }

                    }
                    public boolean retirar (double monto) {
                        if (monto > 0 && saldo >= monto) {
                            saldo = saldo - monto;
                            return true;
                        }  else {
                            System.out.println("No puedes retirar esa cantidad");
                            return false;
                        }
                        
                    }




}
