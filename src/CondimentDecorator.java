public abstract class CondimentDecorator extends Beverage{

    protected Beverage decoratedBeverage;

    public String getDescription() {
        return this.decoratedBeverage.getDescription();
    }

}
