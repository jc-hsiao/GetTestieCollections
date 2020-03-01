package rocks.zipcode;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TestSet {

    @Test
    public void setAddTest(){
        Set<String> s = new HashSet<>();
        s.add("Hi");
        s.add("Hello");
        s.add("Hello");
        s.add("World");
        assertEquals(3, s.size());
    }

    @Test
    public void setClearTest() {
        Set<String> s = new LinkedHashSet<>();
        s.add("Hi");
        s.add("Hello");
        s.add("World");
        s.add("Cool");

        s.clear();
        assertEquals(0,s.size());
    }

    @Test
    public void treeSetTest() {
        Set<Integer> s = new TreeSet<>();
        s.add(20);
        s.add(5);
        s.add(10);
        s.add(15);
        assertArrayEquals(new Integer[]{5,10,15,20}, s.toArray());

    }
}
