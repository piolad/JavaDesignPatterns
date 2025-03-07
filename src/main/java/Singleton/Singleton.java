package Singleton;

public class Singleton {
    private static Singleton s = null;

    private  Singleton(){
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
