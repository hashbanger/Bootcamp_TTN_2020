package exercises;

enum Houses{
    h1(250000),h2(1200000),h3(5430000),h4(3000000),h5(120000);

    private int price;

    Houses(int p){
        price = p;
    }
    int getPrice(){
        return price;
    }
}

public class EnumHouses{
    public static void main(String[] args){
        Houses h;

        // System.out.println(h.h1.getPrice());

        System.out.println("\nAll house prices");
        for (Houses hs : Houses.values()) {
            System.out.println("\nCost of "+hs + " is" + hs.getPrice());
        }
    }
}