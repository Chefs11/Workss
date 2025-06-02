import Model.Circle;
import Model.FigureAbs;
import Model.Square;
import Model.Triangle;
import Model.Escaleno;
import Model.Equilatero;
import Model.Rectangulo;

public class App {
    public static void main(String[] args) throws Exception {

        FigureAbs sq = new Square(10);
        FigureAbs cir = new Circle(10);
        FigureAbs triangle = new Triangle(20, 25, 20);
        FigureAbs esc = new Escaleno(10, 20, 30);
        FigureAbs equ = new Equilatero(25, 22, 17);
        FigureAbs rect = new Rectangulo(10, 20, 18);

       
       
        FigureAbs[] figures = { sq, cir, triangle, esc, equ, rect};

        for (FigureAbs figureAbs : figures) {
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
        }

    }
}
