package src.test.java;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WebsiteTest {

    @Test
    public void testWelcomeMessage() {
        String message = "Welcome to Jenkins";
        assertEquals("Welcome to Jenkins", message);
    }
}

