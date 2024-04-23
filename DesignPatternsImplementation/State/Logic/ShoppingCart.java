package DesignPatternsImplementation.State.Logic;

public class ShoppingCart implements ShoppingCartState{
    private ShoppingCartState state;

    public ShoppingCart(){
        takeCart();
    }

    public void setState(ShoppingCartState newState){
        this.state = newState;
    }

    @Override
    public void takeCart() {
        this.state = new GetCart();
        state.takeCart();
    }

    @Override
    public void addItems() {
        if(state instanceof GetCart){
            state = new FillCart();
        }

        state.addItems();
        // Other Item Adding Logic
        
    }

    @Override
    public void checkout() {

        if(state instanceof FillCart){
            state = new CartCheckout();
        }

        state.checkout();
    }

    @Override
    public void returnCart() {
        if(state instanceof CartCheckout){
            state = new CartReadyToReturn();
        }

        state.returnCart();
        state = new ShoppingCart();
    }
}
