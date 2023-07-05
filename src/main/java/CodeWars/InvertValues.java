package CodeWars;

//Given a set of numbers, return the additive inverse of each. Each positive becomes negatives,
// and the negatives become positives.
//
//invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
//invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
//invert([]) == []

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvertValues {

    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(x->x*-1).toArray();
    }

    @Test
    public void testSomething() {

        int[] input = new int[] {-1,-2,-3,-4,-5};
        int[] expected = new int[] {1,2,3,4,5};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));

        input = new int[] {-1,2,-3,4,-5};
        expected = new int[] {1,-2,3,-4,5};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));

        input = new int[] {};
        expected = new int[] {};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));

        input = new int[] {0};
        expected = new int[] {0};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));
    }
}
