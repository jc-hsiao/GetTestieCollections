package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

public class TestIterator {

    @Test
    public void iteratorTest(){
        Set<String> someSet = new LinkedHashSet<>();
        someSet.add("Hi");
        someSet.add("Hello");
        someSet.add("World");
        someSet.add("Cool");

        ArrayList<String> arr = new ArrayList<>();
        Iterator<String> it = someSet.iterator();
        while(it.hasNext()){
            arr.add(it.next());
        }
        assertArrayEquals(someSet.toArray(),arr.toArray());
    }

    @Test
    public void iteratorRemoveTest(){
        Set<String> someSet = new LinkedHashSet<>();
        someSet.add("Hi");
        someSet.add("Hello");
        someSet.add("World");
        someSet.add("Cool");

        Iterator<String> it = someSet.iterator();
        while(it.hasNext()){
            if (it.next().equals("World") ) {
                it.remove();
            }
        }
        assertFalse(someSet.contains("World"));
    }
}
