package rocks.zipcode;

import org.junit.Test;
import java.util.PriorityQueue;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestPriorityQueue {
//first in first out but with oer given
@Test
    public void priorityQueueRemoveTest(){
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("BANANA");
        pq.add("APPLE");
        pq.add("ORANGE");
        pq.remove();
        assertEquals(2,pq.size());
        assertArrayEquals(new String[]{"BANANA","ORANGE"},pq.toArray());
    }

    @Test
    public void priorityQueueTest(){
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("APPLE");
        pq.add("ORANGE");
        pq.add("BANANA");
        pq.add("PEACH");
        pq.add("LEMON");
        pq.remove();
        pq.remove();
        pq.remove();

        assertEquals("ORANGE",pq.peek());
    }

}
