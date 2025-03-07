import Singleton.Singleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTests {
    @Test
    void TestOnlyOneInstance(){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        assertSame(s1, s2, "Instances of singleton should be the same");
    }

    @Test
    void TestNotNull(){
        assertNotNull(Singleton.getInstance(), "Singleton should never be null");
    }
}
