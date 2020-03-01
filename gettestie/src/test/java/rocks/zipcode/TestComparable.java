package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class TestComparable {

    @Test
    public void listComparableDefaultTest(){
        ArrayList<String> a = new ArrayList<>();

        a.add("CHERRY");
        a.add("APPLE");
        a.add("BANANA");

        Collections.sort(a);
        assertArrayEquals(new String[]{"APPLE","BANANA","CHERRY"}, a.toArray());

    }

    @Test
    public void comparableStringTest(){
        assertTrue(0 < "Banana".compareTo("Apple"));
    }

    @Test
    public void comparableIntegerTest(){
        Integer int1 = 1;
        Integer int2 = 10;
        assertTrue(0 > int1.compareTo(int2));
    }

    @Test
    public void comparableSameStringTest(){
        assertTrue(0 == "Apple".compareTo("Apple"));
    }

}
