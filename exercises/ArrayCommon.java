import java.util.Arrays;
import java.util.Scanner;; 

public class ArrayCommon {
public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of first array");
        int a1Length = sc.nextInt();

        int array1[] = new int[a1Length];

        System.out.println("Enter the length of first array");
        int a2Length = sc.nextInt();

        int array2[] = new int[a2Length];

        System.out.println("Enter the elements of first array");
        for (int i = 0; i < a1Length; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of second array");
        for (int i = 0; i < a2Length; i++) {
            array2[i] = sc.nextInt();
        }

        int arrayCommon[] = new int[a1Length];

        System.out.println("Array1 : "+Arrays.toString(array1));
        System.out.println("Array2 : "+Arrays.toString(array2));
 
        System.out.println("The common elements are:\n");
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                System.out.println(array1[i]);
                }
            }
        }
    }
}