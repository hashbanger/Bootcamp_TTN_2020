import java.util.Scanner;

class DoneCheckWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter some string word\t"));
        String inpStr = sc.next();

        while(!inpStr.equals("done")){
            {
                if(inpStr.charAt(0) == inpStr.charAt(inpStr.length()-1)){
                    System.out.println("The word's start and end are same\n");
                }
                else{
                    System.out.println("The word's start and end are NOT same\n");
                }
                inpStr = sc.next();
            }
        }
    }
}