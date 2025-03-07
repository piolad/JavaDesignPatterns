import Singleton.Singleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTests {
    @Test
    void TestOnlyOneInstance(){
        Singleton s = Singleton.getInstance();

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            Singleton s1 = new Singleton();
            }
        );

    }
}
