import java.util.Scanner;

public class DuplicateWords{
    public static void main(String[] args){
        int count = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter sample string");
        String inpStr = input.nextLine();
        // System.out.println("\nEnter the Delimiter");
        // String delimit = input.next();
        inpStr = inpStr.toLowerCase(); // converting to lowercase to ignore case matching
        String words[] = inpStr.split(" ");

        System.out.println("The Duplicate words are-\n");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])){
                    count++;
                    words[j] = "NULL";
                }                
            }

            if(count > 1 && words[i] != "NULL" ){
                System.out.println(words[i] + " : "+count);
            }

        }

    }
}