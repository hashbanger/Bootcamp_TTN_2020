class ForToWhile
{
    public static void main(String[] args) {

        int s=0,t=1;
// 	    for(int i=0;i<10;i++){
// 	        s=s+i;

// 	        for(int j = i;j>0;j--){
// 	            t=t*(j-i);
// 	        }
// 	        s=s*t;
// 	        System.out.println("t "+t);
// 	    }
// 		System.out.println("s "+s);
        int i=0,j=0;

        while(i<10){
            s=s+i;
            j=i;
            while(j>0){
                t=t*(j-i);
                j--;
            }
            i++;
            s=s*t;
            System.out.println("t "+t);
        }
        System.out.println("s "+s);
    }
}
