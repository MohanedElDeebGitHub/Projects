package DesignPatternsImplementation.Factory;

import DesignPatternsImplementation.Factory.Logic.ProductXCreator;

public class App {
    public static void main(String[] args) {
        ProductXCreator x = new ProductXCreator();
        x.performOperation();
    }
}
