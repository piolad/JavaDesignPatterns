package Singleton;

public class Singleton {
    private static Singleton s = null;

    public  Singleton(){
        if(s != null){
            throw new RuntimeException("Singleton.Singleton already present");
        }

        s = this;
    }

    public static Singleton getInstance(){
        if (s == null)
            s = new Singleton();

        return s;
    }
}
