package rocks.zipcode;
import org.junit.Test;
import java.util.Vector;
import static org.junit.Assert.assertEquals;


public class TestVector {

    @Test
    public void vectorAddTest(){
        Vector<String> v = new Vector<>();
        v.add("vector");
        v.add("is");
        v.add("synchronized");
        assertEquals("is",v.elementAt(1));
    }

    @Test
    public void vectorLastElementTest(){
        Vector<String> v = new Vector<>();
        v.add("vector");
        v.add("is");
        v.add("synchronized");
        assertEquals("synchronized",v.lastElement());
    }


}
