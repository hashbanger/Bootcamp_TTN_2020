import exercises.Test;

class Test
{
	public static void main(final String[] args) {
	    
	   int x = 10,y=0,z=5;
	   final int[] arr = {1,2,3,4,5};
	    
	   try{
	       
	            y=arr[z];
	            z= x/y;
	            
	       
	   }
	   catch(final ArithmeticException e){
	       System.out.println("ArithmeticException : The value of y is 0.");
	   }
	   catch(final ArrayIndexOutOfBoundsException e){
	       System.out.println("ArrayIndexOutOfBoundsException : The value of z is greater than 4 or less than 0.");
	   }
	   catch(final Exception e){
	       System.out.println("Can't specify which type of Exception occured.");
	   }
	   finally{
	       System.out.println("This block will always execute.");
	       x = 1000;
	   }
	   
	   System.out.println("The final value of x : "+x);
	}
}
