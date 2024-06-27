import hetic.RomanNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRomanNumber {
    @Test
    void should_return_I_for_1() {
        assertEquals("I", RomanNumber.transform(1));
    }

    @Test
    void should_return_II_for_2() {
        assertEquals("II", RomanNumber.transform(2));
    }

    @Test
    void should_return_III_for_3() {
        assertEquals("III", RomanNumber.transform(3));
    }
}
