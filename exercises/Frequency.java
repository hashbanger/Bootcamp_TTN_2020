package exercises;

import java.util.*;

public class Frequency
{
    private static void sortByFrequency(int[] inputArray)
    {
        Map<Integer, Integer> elementCountMap = new LinkedHashMap<>();

        for (int i = 0; i < inputArray.length; i++)
        {
            if (elementCountMap.containsKey(inputArray[i]))
            {

                elementCountMap.put(inputArray[i], elementCountMap.get(inputArray[i])+1);
            }
            else
            {
                elementCountMap.put(inputArray[i], 1);
            }
        }

        ArrayList<Integer> sortedElements = new ArrayList<>();



        elementCountMap.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(entry -> {
                    for(int i = 1; i <= entry.getValue(); i++)
                        sortedElements.add(entry.getKey());
                });


        System.out.println("elements with frequency is " +elementCountMap);
        System.out.println("Sorted Array Elements In Descending Order Of their Frequency :");

        System.out.println(sortedElements);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:\t");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elements:\t");
        for (int i = 0; i <n ; i++) {
           ar[i]=sc.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        sortByFrequency(ar);
    }
}