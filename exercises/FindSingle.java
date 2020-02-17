import java.util.Arrays;
import java.util.HashMap; 
import java.util.Set;
import java.util.Iterator;

public class FindSingle {

public static void usingHashmap(int [] arr){
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
    for (int i = 0; i < arr.length; i++) {
        if(map.containsKey(arr[i])){
            int count = map.get(arr[i]);
            map.put(arr[i], ++count);
        }
        else{
            map.put(arr[i], 1);
        }
    }
    Set<Integer> set = map.keySet();
    Iterator <Integer> iterator = set.iterator();
    while(iterator.hasNext()){
        int key = iterator.next();
        if(map.get(key)==1){
            System.out.println("\nElement appearing only once is: "+ key+"\n");
        }
    }
}
public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,1,2,4,5,3};
        usingHashmap(arr);
    }
}