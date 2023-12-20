public class Main {

    protected Beverage beverage;
    protected BeverageFactory beverageFactory;
    public static void main(String[] args) {
        Main main = new Main();
        main.beverageFactory = new BeverageFactory();
        main.beverage = main.beverageFactory.getBeverage("decaf+milk+mocha");
        System.out.println("En " + main.beverage.getDescription() + " som kostar " + main.beverage.cost() + " kr");
    }
}
