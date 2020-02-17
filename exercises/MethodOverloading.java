package exercises;

public class MethodOverloading { 
  
    public int add(int x, int y) 
    { 
        return (x + y); 
    } 
  
    public double add(double x, double y) 
    { 
        return (x + y); 
    } 

    public int mul(int x, int y) 
    { 
        return (x * y); 
    } 

    public double mul(double x, double y) 
    { 
        return (x * y); 
    } 

    public String concat(String x, String y) 
    { 
        return (x + y); 
    } 
  
    public String concat(String x, String y, String z) 
    { 
        return (x + y + z); 
    } 

    public static void main(String args[]) 
    { 
        MethodOverloading a = new MethodOverloading();
        System.out.println(a.add(10, 20)); 
        System.out.println(a.add(10.5, 20.5)); 
        System.out.println(a.mul(10, 20));
        System.out.println(a.mul(1.2, 2.4));
        System.out.println(a.concat("Prashant", " Brahmbhatt")); 
        System.out.println(a.concat("Prashant", " Freakin", " Brahmbhatt")); 
    } 
} 