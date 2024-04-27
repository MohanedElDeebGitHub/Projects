package DesignPatternsImplementation.Factory.Logic;

public class ProductXCreator extends Creator{
    
    Product factoryMethod(){
        return new ConcreteProductX();
    }
}
