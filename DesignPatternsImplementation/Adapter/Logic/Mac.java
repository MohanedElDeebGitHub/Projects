package DesignPatternsImplementation.Adapter.Logic;

public class Mac implements Computer{

    @Override
    public double calculate(int x, int y) {
        System.out.println("Calculated on MAC-OS PC");
        return x + y;
    }

    @Override
    public void browse(String websiteLink) {
        System.out.println("Browsing " + websiteLink + "\t ON: MAC-OS");
    }
}
