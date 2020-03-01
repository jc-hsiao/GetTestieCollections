package rocks.zipcode;

import org.junit.Test;


import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.Assert.assertEquals;

public class TestDeque {

    @Test
    public void dequeueAddFirstTest(){
        Deque<String> d = new ArrayDeque<>();
        d.add("APPLE");
        d.add("BANANA");
        d.addFirst("KIWI");
        d.add("GRAPES");

        assertEquals("KIWI", d.peekFirst());
    }

    @Test
    public void dequeuEelementTest(){
        Deque<String> d = new ArrayDeque<>();

        d.add("APPLE");
        d.add("BANANA");
        d.add("GRAPES");

        assertEquals("APPLE", d.element());
    }
}
