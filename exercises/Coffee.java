package exercises;

abstract class Barista extends Cashier{
    boolean coffeePrepared;
    abstract void getNextOrder();
    boolean prepareCoffee(){
    System.out.println("processing coffee");
    coffeePrepared=true;
    return coffeePrepared;
}

abstract int completedOrder();

String orderCompletedNotification(){
    return "order completed";
    }
}

abstract public class Coffee extends Barista {
}
    abstract class Customer{
    boolean coffeePrepared=false;
    abstract void payment();
    abstract int getToken();
    abstract boolean isCoffeePrepared();
    }
    abstract class Cashier extends Customer{
    abstract void getOrder();
    abstract void createOrder();
    abstract int waitCustomer();
    void getPayment(){
    createOrder();
    waitCustomer();
    }
}
