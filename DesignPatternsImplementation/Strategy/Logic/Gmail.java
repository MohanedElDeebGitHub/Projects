package DesignPatternsImplementation.Strategy.Logic;

public class Gmail implements Account{
    private String accountName;
    private final String password = "1234";

    public Gmail(String accountName){
        this.accountName = accountName;
    }

    public void login(){
        System.out.println("Logged in using Gmail.");
    }
}
