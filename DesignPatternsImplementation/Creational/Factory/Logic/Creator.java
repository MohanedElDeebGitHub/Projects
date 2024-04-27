package DesignPatternsImplementation.Factory.Logic;

public abstract class Creator {
    abstract Product factoryMethod();

    public void performOperation(){
        Product product = factoryMethod();

        product.operation();
    }
}
