package exercises;

import java.util.*;

class Occurence {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string\t");
    String s = sc.nextLine();
    
    frequencyChar(s);
    }

    private static void frequencyChar(String str) {
        String arr[] = str.split("");
        ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            String next = iterator.next();
            if(!next.equals(" ")){
                int freq = Collections.frequency(al, next);
                System.out.println(next + " : " + freq);
            }
        }
}
}