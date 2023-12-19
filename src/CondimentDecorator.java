
public abstract class CondimentDecorator extends Beverage{
    Beverage decoratedBeverage;
    String getDescription() {
        return this.decoratedBeverage.getDescription();
    }

}
