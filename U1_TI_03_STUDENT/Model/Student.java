package Model;


public class Student {
    public static void main (String[] args) throws Exception {

    //--------------------------------------------------------------
    //ALAN
        Score sc = new Score ();
        sc.setName("Alan");
        sc.setId("20243ds078");
        sc.setNote1(100);
        sc.setNote2(100);
        sc.setNote3(100);
        sc.setNote4(50);
        sc.setNote5(80);
        sc.setNote6(100);
                
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.printf("Average: %.2f\n", sc.getAverage());
        if (sc.isApproved()) {
            System.out.println("Status: Approved ✅");
        } else {
            System.out.println("Status: Not approved ❌");
        }
        System.out.println("Student: " + sc.getName());
        System.out.printf("ID:" + sc.getId());
        System.out.println("");
        System.out.println("---------------------------------");

    //--------------------------------------------------------------
    //JAIME
        sc.setName("Jaime");
        sc.setId("20243ds073");
        sc.setNote1(80);
        sc.setNote2(70);
        sc.setNote3(100);
        sc.setNote4(100);
        sc.setNote5(100);
        sc.setNote6(70);

 
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.printf("Average: %.2f\n", sc.getAverage());
        if (sc.isApproved()) {
            System.out.println("Status: Approved ✅");
        } else {
            System.out.println("Status: Not approved ❌");
        }
        System.out.println("Student: " + sc.getName());
        System.out.printf("ID:" + sc.getId());
        System.out.println("");
        System.out.println("---------------------------------");


    //--------------------------------------------------------------
    //DANIELA
     
    sc.setName("Daniela");
    sc.setId("20243ds064");
    sc.setNote1(50);
    sc.setNote2(50);
    sc.setNote3(100);
    sc.setNote4(100);
    sc.setNote5(30);
    sc.setNote6(15);


    System.out.println("---------------------------------");
    System.out.println("");
    System.out.printf("Average: %.2f\n", sc.getAverage());
    if (sc.isApproved()) {
        System.out.println("Status: Approved ✅");
    } else {
        System.out.println("Status: Not approved ❌");
    }
    System.out.println("Student: " + sc.getName());
    System.out.printf("ID:" + sc.getId());
    System.out.println("");
    System.out.println("---------------------------------");





    //--------------------------------------------------------------
    //PABLO
    sc.setName("Pablo");
    sc.setId("20243ds055");
    sc.setNote1(100);
    sc.setNote2(70);
    sc.setNote3(100);
    sc.setNote4(100);
    sc.setNote5(80);
    sc.setNote6(70);


    System.out.println("---------------------------------");
    System.out.println("");
    System.out.printf("Average: %.2f\n", sc.getAverage());
    if (sc.isApproved()) {
        System.out.println("Status: Approved ✅");
    } else {
        System.out.println("Status: Not approved ❌");
    }
    System.out.println("Student: " + sc.getName());
    System.out.printf("ID:" + sc.getId());
    System.out.println("");
    System.out.println("---------------------------------");



    //--------------------------------------------------------------

    sc.setName("Carlos");
    sc.setId("20243ds045");
    sc.setNote1(60);
    sc.setNote2(50);
    sc.setNote3(100);
    sc.setNote4(100);
    sc.setNote5(40);
    sc.setNote6(15);


    System.out.println("---------------------------------");
    System.out.println("");
    System.out.printf("Average: %.2f\n", sc.getAverage());
    if (sc.isApproved()) {
        System.out.println("Status: Approved ✅");
    } else {
        System.out.println("Status: Not approved ❌");
    }
    System.out.println("Student: " + sc.getName());
    System.out.printf("ID:" + sc.getId());
    System.out.println("");
    System.out.println("---------------------------------");



    //--------------------------------------------------------------









    }
}