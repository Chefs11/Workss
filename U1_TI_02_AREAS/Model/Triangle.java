package Model;

public class Triangle {

    private double base;
    private double high;
    private double lado;

    public double getArea() {
        double Area = (base*high) /2;
        return Area;
    }

    public double getPerimeter3() {
        double Perimeter3= lado*3;
        return Perimeter3;
    }


    //-----------------------------------

    public void getBase(double base) {
        this.base = base;
       }

       public double setBase() {
        return this.base;
    }

    public void getHigh(double high) {
        this.high = high;
       }

       public double setHigh () {
        return this.high;
    }

    public void getLado(double lado) {
        this.lado = lado;
       }

        
       public double setLado () {
        return this.lado;
    }


       //---------------------------------


      

     

       
    
    
    
    
    
    
    
       








}