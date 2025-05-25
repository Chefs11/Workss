

import Model.Student;

public class Score {
    public static void main (String[] args) throws Exception {

    //--------------------------------------------------------------

    Student[]students = new Student [5];



//SUDENT ALAN 
     

      students[0] = new Student();
      students[0].setName("Alan");
      students[0].setMatricula("20243ds078");
      students[0].setNote1(100);
      students[0].setNote2(100);
      students[0].setNote3(100);
      students[0].setNote4(50);
      students[0].setNote5(100);
      students[0].setNote6(100);


//STUDENT DANIELA
     students[1] = new Student();
     students[1].setName("Daniela");
     students[1].setMatricula("20243ds079");
     students[1].setNote1(70);
     students[1].setNote2(50);
     students[1].setNote3(100);
     students[1].setNote4(50);
     students[1].setNote5(60);
     students[1].setNote6(40);


//STUDENT CARLOS
     students[2] = new Student ();
     students[2].setName("Carlos");
     students[2].setMatricula("20243ds080");
     students[2].setNote1(100);
     students[2].setNote2(80);
     students[2].setNote3(100);
     students[2].setNote4(80);
     students[2].setNote5(70);
     students[2].setNote6(80);



//STUDENT MIGUEL
     students[3] =new Student();
     students[3].setName("Miguel");
     students[3].setMatricula("20243ds081");
     students[3].setNote1(80);
     students[3].setNote2(80);
     students[3].setNote3(100);
     students[3].setNote4(80);
     students[3].setNote5(70);
     students[3].setNote6(65);


//STUDENT FRNACO
     students[4] = new Student();
     students[4].setName("Franco");
     students[4].setMatricula("20243ds082");
     students[4].setNote1(60);
     students[4].setNote2(80);
     students[4].setNote3(100);
     students[4].setNote4(80);
     students[4].setNote5(100);
     students[4].setNote6(100);




//--------------------------------------------------------------


for (Student sc : students) {

   System.out.println("---------------------------------------");
    System.out.println("Avarage: " + sc.getAverage());
    if (sc.isApproved()) {
        System.out.println("Satatus: You are approved, congratulations");
    } else {
        System.out.println("Status: You are not approved");
    }
    System.out.println("Matricula: " + sc.getMatricula());
    System.out.println("Name: " + sc.getName());
    System.out.println("---------------------------------------");
    System.out.println("");
}




       
     
    }
}
                
       