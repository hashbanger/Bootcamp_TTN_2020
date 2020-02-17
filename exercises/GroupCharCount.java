package exercises;

import java.util.Scanner;

public class GroupCharCount{
    public static void main(String[] args){
        int lowerCount = 0,upperCount = 0, digitCount = 0, specialCount = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter sample string");
        String inpString = input.nextLine();
        for (int i = 0; i < inpString.length(); i++) {
            if(Character.isLowerCase(inpString.charAt(i))){
                lowerCount++;
            }
            else if(Character.isUpperCase(inpString.charAt(i))){
                upperCount++;
            }
            else if(Character.isDigit(inpString.charAt(i))){
                digitCount++;
            }
            else{
                specialCount++;
            }
        }

        System.out.println("-----The Stats are--------");
        System.out.println("No of Lower : " + lowerCount + " Percentage: "+ lowerCount * 100 / inpString.length() + "%");
        System.out.println("No of Lower : " + upperCount + " Percentage: "+ upperCount * 100 / inpString.length() + "%");
        System.out.println("No of Lower : " + digitCount + " Percentage: "+ digitCount * 100 / inpString.length() + "%");
        System.out.println("No of Lower : " + specialCount + " Percentage: "+ specialCount * 100 / inpString.length() + "%");


    }

    // public int pct(int total, int value){
    //     return value/total * 100;
    // }

}