public class Singleton {
    // this field must be declared as private
    private static Singleton instance;

    // constructor must be declared as private
    private Singleton() {

    }

    // this method must be declared as static
    public static Singleton createObject() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
