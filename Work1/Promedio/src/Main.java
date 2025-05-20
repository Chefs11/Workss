import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String x1 = JOptionPane.showInputDialog( "Dame un numero");
        String x2 = JOptionPane.showInputDialog( "Dame otro numero");
        String x3 = JOptionPane.showInputDialog( "Dame otro numero");

        int n1 = Integer.parseInt (x1);
        int n2 = Integer.parseInt (x2);
        int n3 = Integer.parseInt (x3);

        int suma = n1 + n2 + n3;
        int promedio = suma / 3;

        System.out.println("El promedio es " + promedio);
    }
}