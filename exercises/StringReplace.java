import java.util.Scanner;

public class StringReplace{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter sample string");
        String subInput = input.nextLine();
        System.out.println("\nEnter substring to replace");
        String subToRep = input.nextLine();
        System.out.println("\nEnter string to replace with");
        String subWithRep = input.nextLine();

        // System.out.println("The replaced string is: "+inpText);

        String repText = subInput.replace(subToRep, subWithRep);
        System.out.println("\nThe replaced string is:\n"+repText);
    }
}