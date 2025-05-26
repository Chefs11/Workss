package Model;

public class Computer {

    private String brand = "Apple";
    private String model;
    private boolean ignited;
    
 // To on the computer
    public void on() {
        if (!ignited) {
            ignited = true;
            System.out.println("Starting...");
        } else {
            System.out.println("The computer is on");
        }
    }

    // To off the computer
    public void off() {
        if (ignited) {
            ignited = false;
            System.out.println("Shutting down ...");
        } else {
            System.out.println("The computer is off");
        }
    }


    //------------getters--------------------------
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public boolean isIgnited() {
        return ignited;
    }
    
    
    //------------setters--------------------------
    
    public void setModel(String model) {
        this.model = model;
    } 
    
    
    }
    