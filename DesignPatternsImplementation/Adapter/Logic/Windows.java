package DesignPatternsImplementation.Adapter.Logic;

public class Windows implements Computer{

    @Override
    public double calculate(int x, int y) {
        System.out.println("Calculated on WINDOWS-OS");
        return x+y;
    }

    @Override
    public void browse(String websiteLink) {
        System.out.println("Browsing Website: " + websiteLink + "\t ON WINDOWS-OS");        
    }
}
