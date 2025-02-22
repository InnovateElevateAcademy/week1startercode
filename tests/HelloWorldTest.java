import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import org.junit.jupiter.api.Test;

class HelloWorldTest {
    @Test
    void testHelloWorldOutput() throws IOException {
        // Capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run student's main method
        HelloWorld.main(new String[]{});

        // Check output
        assertEquals("Hello, World!\n", outContent.toString());
    }
}
