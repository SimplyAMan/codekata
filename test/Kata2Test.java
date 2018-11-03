import org.junit.Test;

import static org.junit.Assert.*;

public class Kata2Test {
    private Kata2 kata = new Kata2();
    @Test
    public void testChop() {
        assertEquals(-1, kata.iterator_chop(3, new int[]{}));
        assertEquals(-1, kata.iterator_chop(3, new int[]{1}));
        assertEquals(0,  kata.iterator_chop(1, new int[]{1}));
        //------------------------
        assertEquals(0,  kata.iterator_chop(1, new int[]{1, 3, 5}));
        assertEquals(1,  kata.iterator_chop(3, new int[]{1, 3, 5}));
        assertEquals(2,  kata.iterator_chop(5, new int[]{1, 3, 5}));
        assertEquals(-1, kata.iterator_chop(0, new int[]{1, 3, 5}));
        assertEquals(-1, kata.iterator_chop(2, new int[]{1, 3, 5}));
        assertEquals(-1, kata.iterator_chop(4, new int[]{1, 3, 5}));
        assertEquals(-1, kata.iterator_chop(6, new int[]{1, 3, 5}));
        //------------------------
        assertEquals(0,  kata.iterator_chop(1, new int[]{1, 3, 5, 7}));
        assertEquals(1,  kata.iterator_chop(3, new int[]{1, 3, 5, 7}));
        assertEquals(2,  kata.iterator_chop(5, new int[]{1, 3, 5, 7}));
        assertEquals(3,  kata.iterator_chop(7, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata.iterator_chop(0, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata.iterator_chop(2, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata.iterator_chop(4, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata.iterator_chop(6, new int[]{1, 3, 5, 7}));
        assertEquals(-1, kata.iterator_chop(8, new int[]{1, 3, 5, 7}));
    }
}