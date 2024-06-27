import hetic.RomanNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRomanNumber {
    @Test
    void should_return_I_for_1() {
        assertEquals("I", RomanNumber.toto(1));
    }

    @Test
    void should_return_12_for_2() {
        assertEquals("12", RomanNumber.toto(2));
    }
}
