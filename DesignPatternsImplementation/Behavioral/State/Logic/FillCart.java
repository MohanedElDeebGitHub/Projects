package DesignPatternsImplementation.State.Logic;

public class FillCart implements ShoppingCartState{
    @Override
    public void takeCart() {
        System.out.println("Cart already taken.");
    }

    @Override
    public void addItems() {
        System.out.println("Adding items to cart...");
    }

    @Override
    public void checkout() {
        System.out.println("Can't checkout yet!");        
    }

    @Override
    public void returnCart() {
        System.out.println("Can't return yet!");        
    }
}
