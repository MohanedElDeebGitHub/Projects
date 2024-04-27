package DesignPatternsImplementation.Strategy.Logic;

public class Yahoo implements Account{
    private String accountName;
    private static String password = "5678";

    public Yahoo(String accountName){
        this.accountName = accountName;
    }

    public void login(){
        System.out.println("Logged in using Yahoo.");
    }
}
