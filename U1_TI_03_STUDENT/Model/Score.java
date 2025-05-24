package Model;

public class Score {

    private String name;
    private String id;
    private double note1;
    private double note2;
    private double note3;
    private double note4;
    private double note5;
    private double note6;


    //Promedium -----------------------------------------------------
    public double getAverage () {
    double Average = (note1 + note2 + note3 + note4 + note5 + note6) / 6;
    return Average;
    }

    //Aprove or not -------------------------------------------------

    public boolean isApproved() {
        return getAverage() >= 70;
    }

//------------------------------------------------------


//THIS IS FOR THE STRING "NAME"

public void setName (String name) {
    this.name = name;
}

public String getName () {
    return this.name;
}

//THIS IS FOR THE STRING "ID" 

public void setId (String id) {
    this.id = id;
}
public String getId () {
    return  this.id;
}

//THIS IS FOR THE NOTE NUMBER 1 

public void setNote1 (double note1) {
    this.note1 = note1;
}
public double getNote1 () {
    return this.note1;
}

//THIS IS FOR THE NOTE NUMBER 2 

public void setNote2 (double note2) {
    this.note2 = note2;
}
public double getNote2 () {
    return this.note2;
}

//THIS IS FOR THE NOTE NUMBER 2

public void setNote3 (double note3) {
    this.note3 = note3;
}
public double getNote3 () {
    return this.note3;
}

//THIS IS FOR THE NOTE NUMBER 4

public void setNote4 (double note4) {
    this.note4 = note4;
}
public double getNote4 () {
    return this.note4;
}

//THIS IS FOR THE NOTE NUMBER 5

public void setNote5 (double note5) {
    this.note5 = note5;
}
public double getNote5 () {
    return this.note5;
}

//THIS IS FOR THE NOTE NUMBER 6

public void setNote6 (double note6) {
    this.note6 = note6;
}
public double getNote6 () {
    return this.note6;
}



}



