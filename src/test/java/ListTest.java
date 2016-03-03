import org.junit.Test;
import org.omg.PortableInterceptor.Interceptor;

import static org.junit.Assert.*;

/**
 * Created by blstream on 3/3/2016.
 */
public class ListTest {

    @Test
    public void testGetSize() throws Exception {
        List<Integer> list = new List<Integer>();
        list.addElement(5);
        list.addElement(4);
        list.addElement(2);
        list.addElement(7);
        assertEquals(4, list.getSize());
    }

    @Test
    public void testAddElement() throws Exception {

    }

    @Test
    public void testRemoveId() throws Exception {

    }

    @Test
    public void testRemoveFirst() throws Exception {

    }

    @Test
    public void testClear() throws Exception {

    }

    @Test
    public void testContains() throws Exception {

    }

    @Test
    public void testGet() throws Exception {

    }

    @Test
    public void testShowList() throws Exception {

    }
}