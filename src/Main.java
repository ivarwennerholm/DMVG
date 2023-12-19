public class Main {


    public static void main(String[] args) {
        Beverage beverage = new Milk(new Mocha(new DarkRoast()));
        System.out.println("En " + beverage.getDescription() + " som kostar " + beverage.cost() + " kr");
    }
}
