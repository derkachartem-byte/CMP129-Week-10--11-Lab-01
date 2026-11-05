
public interface Device{
        default void turnOn(){
            System.out.println("This device is now on.");
        }
}

