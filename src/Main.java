public class Main {

    protected Beverage beverage;
    public static void main(String[] args) {
        Main main = new Main();
        main.beverage = new Milk(new Mocha(new DarkRoast()));
        System.out.println("En " + main.beverage.getDescription() + " som kostar " + main.beverage.cost() + " kr");
    }
}
