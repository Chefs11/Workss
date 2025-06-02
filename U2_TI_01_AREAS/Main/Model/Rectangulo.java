package Model;

public class Rectangulo extends FigureAbs {

    private double side;
    private double base;
    private double height;

            public Rectangulo (double side, double height, double base) {
                this.base = base;
                this.height = height;
                this.side = side;

            }
   
   
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea () {
        return (base*height) /2;
    }

    public double getPerimeter () {
        return (side+side+side);
    }
    

}
