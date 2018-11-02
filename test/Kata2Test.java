import org.junit.Test;

import static org.junit.Assert.*;

public class Kata2Test {
    private Kata2 kata = new Kata2();
    @Test
    public void testChop() {
        assertEquals(-1, kata.chop(3, new int[]{}));
        assertEquals(-1, kata.chop(3, new int[]{1}));
        assertEquals(0,  kata.chop(1, new int[]{1}));
        //------------------------
        assertEquals(0,  kata.chop(1, new int[]{1, 3, 5}));
        assertEquals(1,  kata.chop(3, new int[]{1, 3, 5}));
        assertEquals(2,  kata.chop(5, new int[]{1, 3, 5}));
        assertEquals(-1, kata.chop(0, new int[]{1, 3, 5}));
        assertEquals(-1, kata.chop(2, new int[]{1, 3, 5}));
        assertEquals(-1, kata.chop(4, new int[]{1, 3, 5}));
        assertEquals(-1, kata.chop(6, new int[]{1, 3, 5}));
        //
        assertEquals(0,  kata.chop(1, new int[]{1, 3, 5, 7}));
        assertEquals(1,  kata.chop(3, new int[]{1, 3, 5, 7}));
        assertEquals(2,  kata.chop(5, new int[]{1, 3, 5, 7}));
        assertEquals(3,  kata.chop(7, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata.chop(0, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata.chop(2, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata.chop(4, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata.chop(6, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata.chop(8, new int[]{1, 3, 5, 7}));
    }
}