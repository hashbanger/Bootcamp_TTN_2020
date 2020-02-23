package exercises;

import java.util.*;


public class HashmapValueSort {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("one",1);
        hashMap.put("five",5);
        hashMap.put("three",3);
        hashMap.put("two",2);
        hashMap.put("four",4);

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        ArrayList<Integer> list = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            list.add(entry.getValue());
        }
        Collections.sort(list, new Comparator<Integer>(){
            public int compare(Integer str, Integer str1){
                return (str).compareTo(str1);
            }
        });

        for(int str : list){
            for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
                if(entry.getValue().equals(str)){
                    sortedMap.put(entry.getKey(), str);
                }
            }
        }
        System.out.println("\n"+sortedMap+"\n");

    }    
}