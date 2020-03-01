package rocks.zipcode;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertFalse(stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void stackAddTest(){
        Stack<String> stack = new Stack<>();
        stack.add("Hi!");
        stack.add("Woo!");
        assertEquals(2,stack.size());
        assertEquals("Woo!",stack.peek());
    }

    @Test
    public void stackPopTest(){
        Stack<String> stack = new Stack<>();
        stack.add("Hi!");
        stack.add("Woo!");
        stack.pop();
        assertEquals(1,stack.size());
        assertEquals("Hi!",stack.peek());
    }

}
