package exercises;

class Singleton 
{ 
    private static Singleton single_instance = null; 
  
    
    public String str; 
  
    private Singleton() 
    { 
        str = "This string is a member of singleton class." ;
    } 
  
    public static Singleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Singleton(); 
  
        return single_instance; 
    } 
} 
  
class Main 
{
    public static void main(String args[]) 
    { 
        Singleton x = Singleton.getInstance(); 
  
        
  
        System.out.println("String from x is " + x.str); 
    	x.str = x.str.toUpperCase(); 
        System.out.println("String from x is " + x.str); 

	Singleton y = Singleton.getInstance(); 
  	System.out.println("String from y is " + y.str); 
       
     
    } 
} 
