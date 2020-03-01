package rocks.zipcode;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


import static org.junit.Assert.*;

public class TestMap {

    @Test
    public void mapPutTest(){
        Map<String,Integer> m = new HashMap<>();
        m.put("Apple",10);
        m.put("Pear",5);
        m.put("Orange",20);
        assertEquals(new Integer(10), m.get("Apple"));
    }

    @Test
    public void mapReplaceTest(){
        Map<String,Integer> m = new HashMap<>();
        m.put("Apple",10);
        m.put("Pear",5);
        m.put("Orange",20);
        m.replace("Pear",100);
        assertEquals(new Integer(100), m.get("Pear"));
    }

    @Test
    public void mapGetOrDefaultTest(){
        Map<String,Integer> m = new HashMap<>();
        m.put("Apple",10);
        m.put("Pear",5);
        m.put("Orange",20);
        Integer actual = m.getOrDefault("Banana",99);
        //Set<Map.Entry<String,Integer>> s = m.entrySet();
        assertEquals(new Integer(99), actual);
        assertFalse(m.containsKey("Banana"));
    }


    @Test
    public void treeMapTest(){
        Map<String,Integer> m = new TreeMap<>();

        m.put("Pear",5);
        m.put("Orange",20);
        m.put("Apple",10);
        m.put("Banana",10);

        String[] expected = {"Apple", "Banana", "Orange", "Pear"};
        assertArrayEquals(expected, m.keySet().toArray());

    }

}
