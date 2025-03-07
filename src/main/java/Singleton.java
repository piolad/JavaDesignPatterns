public class Singleton {
    private static Singleton s = null;

    Singleton(){
        if(s != null){
            throw new RuntimeException("Singleton already present");
        }

        s = this;
    }

    public static Singleton getInstance(){
        if (s == null)
            s = new Singleton();

        return s;
    }
}
