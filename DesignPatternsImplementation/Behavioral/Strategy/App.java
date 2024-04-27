package DesignPatternsImplementation.Strategy;

import DesignPatternsImplementation.Strategy.Logic.Account;
import DesignPatternsImplementation.Strategy.Logic.Gmail;
import DesignPatternsImplementation.Strategy.Logic.Yahoo;

public class App {
    public static void main(String[] args) {
        Account account1 = new Gmail("name");
        account1.login();

        account1 = new Yahoo("name2");
        account1.login();
    }
}
