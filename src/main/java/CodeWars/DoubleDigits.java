package CodeWars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DoubleDigits {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x->x*2).toArray();
    }

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2, 4, 6}, DoubleDigits.map(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, DoubleDigits.map(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, DoubleDigits.map(new int[] {1, 1, 1, 1, 1, 1}));
    }
}
