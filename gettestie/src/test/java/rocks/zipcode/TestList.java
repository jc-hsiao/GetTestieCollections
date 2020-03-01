package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestList {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void arrayListSizeTest(){
        List<String> a = new ArrayList<>();
        a.add("Hi!");
        a.add("Hello!");
        a.add("World!");

        assertEquals(3, a.size());
    }

    @Test
    public void arrayListRemoveTest(){
        List<String> a = new ArrayList<>();
        a.add("Hi!");
        a.add("Hello!");
        a.add("World!");
        a.remove("Hello!");

        assertEquals(2, a.size());
        assertFalse(a.contains("Hello"));
    }


    @Test
    public void listRemoveTest(){
        List<String> a = new LinkedList<>();
        a.add("Hi!");
        a.add("Hello!");
        a.add("World!");
        a.remove("Hello!");

        assertEquals(2, a.size());
        assertFalse(a.contains("Hello"));
    }

}
