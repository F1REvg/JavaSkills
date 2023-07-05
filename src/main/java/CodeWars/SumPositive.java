package CodeWars;

//You get an array of numbers, return the sum of all of the positives ones.
//
//Example [1,-4,7,12] => 1 + 7 + 12 = 20
//
//Note: if there is nothing to sum, the sum is default to 0.

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumPositive{

    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(x->x>0).sum();
    }

    @Test
    public void testSomething() {

         assertEquals(15, SumPositive.sum(new int[]{1,2,3,4,5}));
         assertEquals(13, SumPositive.sum(new int[]{1,-2,3,4,5}));
         assertEquals(0, SumPositive.sum(new int[]{}));
         assertEquals(0, SumPositive.sum(new int[]{-1,-2,-3,-4,-5}));
         assertEquals(9, SumPositive.sum(new int[]{-1,2,3,4,-5}));
    }
}

