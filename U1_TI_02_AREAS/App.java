import Model.Circle;
import Model.Square;
import Model.Triangle;

public class App {
    public static void main (String[] args) throws Exception  {


        //SQUARE--------------------------------
Square sq = new Square ();
sq.getLado (10);
System.out.println("This is the perimeter and Area of the Square");
System.out.println(sq.getPerimeter());
System.out.println(sq.getArea());
System.out.println("");



         //CIRCLE-----------------------------------
        Circle cr = new Circle ();
        cr.getRadio(5);
        cr.getPi(3.1426);
    
        System.out.println("This is the perimeter and Area of the Circle");
        System.out.println(cr.getArea());
        System.out.println(cr.getPerimeter2());
        System.out.println("");

        //TRIANGLE

        Triangle tr = new Triangle();
        tr.getBase(5.1);
        tr.getHigh(8);
        tr.getLado(7);
        System.out.println("This is the perimeter and Area of the Triangle");
        System.out.println(tr.getArea());
        System.out.println(tr.getPerimeter3());



    }
}

