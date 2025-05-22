
package Model;

public class Square {

    private double lado; //LADOO
    

    //Get square Area

    
    public double getArea() {
       
        double Area = lado*lado;
        return Area;
    }
    //-----------------------------------------------------------------

    //Get square Perimeter
    public double getPerimeter(){
       double perimeter=lado*4;
        return perimeter;

    }

    //--------------------------------------------------------------------



public void getLado(double lado) {
 this.lado = lado;
}

public double setLado () {
    return this.lado;
}
    
    }
    




