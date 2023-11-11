import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class TestNeptune {

    @Test
    @DisplayName("Test Neptune.")
    public void testNoValuesConstructor() {
        Neptune neptune = new Neptune();
        assertEquals(1, neptune.triton(1));
    }

    @Test
    @DisplayName("Test first item in sequence.")
    public void testNeptuneOne() {
        Neptune neptune = new Neptune();
        neptune.triton(1);
        assertEquals(1, neptune.triton(1));
    }

    @Test
    @DisplayName("Test fourth item in sequence.")
    public void testNeptuneFour() {
        Neptune neptune = new Neptune();
        neptune.triton(1);
        assertEquals(6, neptune.triton(4));
    }

    @Test
    @DisplayName("Test sixth item in sequence.")
    public void testNeptuneSix() {
        Neptune neptune = new Neptune();
        neptune.triton(6);
        assertEquals(20, neptune.triton(6));
    }
}
