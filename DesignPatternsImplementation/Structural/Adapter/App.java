package DesignPatternsImplementation.Adapter;

import DesignPatternsImplementation.Adapter.Logic.Computer;
import DesignPatternsImplementation.Adapter.Logic.Mac;
import DesignPatternsImplementation.Adapter.Logic.Windows;

public class App {
    public static void main(String[] args) {
        Computer pc1 = new Mac();

        pc1.browse("TestSiteLink");
        pc1.calculate(1, 1);

        System.out.println("\n");
        
        pc1 = new Windows();
        pc1.browse("TestSiteLink");
        pc1.calculate(1, 1);
    }
}
