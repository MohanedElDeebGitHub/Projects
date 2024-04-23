package DesignPatternsImplementation.State.Logic;

public class CartReadyToReturn implements ShoppingCartState{

    public void takeCart(){
        System.out.println("Can't take cart yet!");
    }

    public void addItems(){
        System.out.println("Can't add items to cart yet!");
    }

    public void checkout(){
        System.out.println("Can't checkout cart yet!");
    }

    public void returnCart(){
        System.out.println("Cart returned successfully!");
    }
}
