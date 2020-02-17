import java.util.Scanner;

public class ReverseRemove{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer subInput = new StringBuffer();
        System.out.println("\nEnter sample string");
        subInput.append(sc.nextLine());
        subInput.reverse();
        subInput.delete(4, 9);
        System.out.println("\nOutput: "+subInput);
    }
}