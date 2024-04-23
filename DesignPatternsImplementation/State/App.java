package DesignPatternsImplementation.State;

import DesignPatternsImplementation.State.Logic.ShoppingCart;

public class App {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItems();
        cart.checkout();
        cart.returnCart();
    }
}
