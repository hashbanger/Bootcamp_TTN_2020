package exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string\t");
        String s = sc.nextLine();

        unique(s);
    }
    
    private static void unique(String s){
        String[] a = s.split("");
        
        Set<String> set = new HashSet<String>(Arrays.asList(a));
        set.remove(" ");
        System.out.println("Number of unique characters are\t:" +set.size());
    }
}