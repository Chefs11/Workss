

import Model.Computer;
import javax.swing.JOptionPane;

public class Mcom {
    public static void main (String[] args) throws Exception {

        Computer cm = new Computer();

        String Model = JOptionPane.showInputDialog("Write the model of the computer, just Apple computers ");
       cm.setModel(Model);
        System.out.println("Model: " + cm.getModel());
        System.out.println("Brand: " + cm.getBrand());
      
               
               cm.on();  
               cm.on();  
               cm.off();   
       
       



    }
}