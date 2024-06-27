import hetic.RomanNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRomanNumber {
    @Test
    void should_return_1_for_1() {
        assertEquals("I", RomanNumber.toto(1));
    }
}
