package Model;


public class Circle {


    private double radio;
    private double pi;

    //GET CIRCLE AREA
    public double getArea () {
        double Area = (radio*radio)*pi;
        return Area;

    }

    // GET CIRCLE PERIMETER
    public double getPerimeter2 () {
        double Perimeter2 = (2*pi)*radio;
        return Perimeter2;


    }

public void getRadio(double radio) {
    this.radio = radio;
}

public double setRadio() {
    return this.radio;
}



public void getPi (double pi) {
     this.pi = pi;
}

public double setPi() {
    return this.pi;

}

}