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
        String fname,lname, bname;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your first name\t");
        fname = sc.nextLine();
        System.out.println("Enter your last name\t");       
        lname = sc.nextLine();
        System.out.println("Enter bank name\t");       
        bname = sc.nextLine();

        if(bname.equals("BOI")){
            BOI obj = new BOI();
            obj.setName(fname,lname);
            obj.setDetails(4.6);
            System.out.println("The rate of interest is "+obj.getDetails());
        }

        else if(bname.equals("SBI")){
            SBI obj = new SBI();
            obj.setName(fname,lname);
            obj.setDetails(5.3);
            System.out.println("The rate of interest is "+obj.getDetails());
        }

        else if(bname.equals("ICICI")){
            ICICI obj = new ICICI();
            obj.setName(fname,lname);
            obj.setDetails(3.33);
            System.out.println("The rate of interest is "+obj.getDetails());       

        }

        else{
            System.out.println("Invalid Bank Name\n");
        }


    }
}