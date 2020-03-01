package rocks.zipcode;

import org.junit.Test;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

public class TestQueue {

    @Test
    public void queueAddTest(){
        Queue<String> q = new LinkedList<>();
        q.add("Hewwo");
        q.add("Hello");

        assertEquals("Hewwo",q.peek());
    }

    @Test
    public void queueRemoveTest(){
        Queue<String> q = new LinkedList<>();
        q.add("Hewwo");
        q.add("Hello");
        q.add("Yay!");
        q.remove();

        assertEquals("Hello",q.peek());
    }

    @Test
    public void queuePollTest(){
        Queue<String> q = new LinkedList<>();
        q.add("Hewwo");
        q.add("Hello");
        q.add("Yay!");
        String s = q.poll();

        assertEquals("Hewwo",s);
    }


}
