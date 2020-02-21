class CustomExp extends Exception {

    // String msg = "Value of y is 0.";

    public CustomExp(String m) {
        super(m, null, true, false);
    }

}

class Main{
    public static void main(String [] x){
        try {
            throw new CustomExp("Custom Exception!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

// OUTPUT - CustomExp: Custom Exception! 
