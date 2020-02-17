package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// import java.lang.*;

public class DuplicateCharWoLoop{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter sample string");
        String inpStr = input.nextLine();
        System.out.println("\nEnter chararcter to check occurences");
        String inpChar = input.nextLine();
        ArrayList<String> chars = new ArrayList<String>();

        Collections.addAll(chars, inpStr.split(""));

        System.out.println("Frequency of the element: "+Collections.frequency(chars, inpChar));

    }

}