package DesignPatternsImplementation.State.Logic;

public interface ShoppingCartState {
    public void takeCart();
    public void addItems();
    public void checkout();
    public void returnCart();

}
    