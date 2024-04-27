package DesignPatternsImplementation.State.Logic;

public class CartCheckout implements ShoppingCartState{
    @Override
    public void takeCart() {
        System.out.println("Can't take cart yet!");
    }

    @Override
    public void addItems() {
        System.out.println("Can't add items to cart yet!");
    }

    @Override
    public void checkout() {
        System.out.println("Checkout Process Initiated.");
    }

    @Override
    public void returnCart() {
        System.out.println("Can't return cart yet!");
    }
}
