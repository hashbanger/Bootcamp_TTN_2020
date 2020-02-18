package exercises;

import java.util.Scanner;

class Bank{
    private double rateOfInterest;
    public double getDetails(){
        return rateOfInterest;   
    }

    public void setDetails(double ROI){
        rateOfInterest = ROI;
    }
}

class BOI extends Bank{
    String fName, lName;
    public void setName(String fname, String lname){
        fName = fname;
        lName = lname;
    }
}

class ICICI extends Bank{
    String fName, lName;
    public void setName(String fname, String lname){
        fName = fname;
        lName = lname;
    }
}

class SBI extends Bank{
    String fName, lName;
    public void setName(String fname, String lname){
        fName = fname;
        lName = lname;
    }
}


public class BankInherit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BOI obj1 = new BOI();
        obj1.setName("Prashant", "Brahmbhatt");
        obj1.setDetails(4.6);
        System.out.println("The rate of interest is "+obj1.getDetails());

        SBI obj2 = new SBI();
        obj2.setName("Shubham", "Bhatt");
        obj2.setDetails(3.22);
        System.out.println("The rate of interest is "+obj2.getDetails());

        BOI obj3 = new BOI();
        obj3.setName("Mayank", "Taliwal");
        obj3.setDetails(2.74);
        System.out.println("The rate of interest is "+obj3.getDetails());

    }
}