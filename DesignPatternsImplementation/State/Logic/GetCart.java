package DesignPatternsImplementation.State.Logic;

public class GetCart implements ShoppingCartState {
    @Override
    public void takeCart() {
        System.out.println("Cart taken succesfully!");        
    }

    @Override
    public void addItems() {
        System.out.println("Can't add items to cart yet!");
    }

    @Override
    public void checkout() {
        System.out.println("Can't checkout cart yet!");
    }

    @Override
    public void returnCart() {
        System.out.println("Can't return cart yet!");        
    }
}
