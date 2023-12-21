import java.util.InputMismatchException;

public class BeverageFactory {

    protected Beverage beverage;

    public Beverage getBeverage(String order) {
        if (order.equalsIgnoreCase("darkroast"))
            beverage = new DarkRoast();
        else if (order.equalsIgnoreCase("darkroast+milk"))
            beverage = new Milk(new DarkRoast());
        else if (order.equalsIgnoreCase("darkroast+mocha"))
            beverage = new Mocha(new DarkRoast());
        else if (order.equalsIgnoreCase("darkroast+milk+mocha"))
            beverage = new Mocha(new Milk(new DarkRoast()));
        else if (order.equalsIgnoreCase("decaf"))
            beverage = new Decaf();
        else if (order.equalsIgnoreCase("decaf+milk"))
            beverage = new Milk(new Decaf());
        else if (order.equalsIgnoreCase("decaf+mocha"))
            beverage = new Mocha(new Decaf());
        else if (order.equalsIgnoreCase("decaf+milk+mocha"))
            beverage = new Milk(new Mocha(new Decaf()));
        else {
            System.out.println("Otillåtet argument för metoden getBeverage()");
            throw new InputMismatchException();
        }
        return beverage;
    }
}
