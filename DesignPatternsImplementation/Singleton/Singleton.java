package DesignPatternsImplementation.Singleton;


public class Singleton{
    private static Singleton instance;
    private static boolean canCreate = true;

    private Singleton(){
        if(!canCreate){
            System.out.println("Can't create any new instances.");
        }
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
            canCreate = false;

            System.out.println("New instance created.");
        }else{
            
        }

        return instance;
    }
}