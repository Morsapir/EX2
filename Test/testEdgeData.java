package Test;

import algo.edgeData;

import api.EdgeData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class testEdgeData {

    int tag=0;
    double weight=10.5;
    String info = "";
    EdgeData e = new edgeData(6,12,weight, info, tag);


    @Test
    void getSrc() {
        assertEquals(6, e.getSrc());
    }

    @Test
    void getDest() {
        assertEquals(12, e.getDest());
    }

    @Test
    void getWeight() {
        assertEquals(10.5, e.getWeight());
    }

    @Test
    void getInfo() {;
        assertTrue(e.getInfo().equals(""));
    }


    @Test
    void setInfo() {
        e.setInfo("test");
        assertTrue(e.getInfo().equals("test"));
    }

    @Test
    void getTag() {
        assertEquals(0, e.getTag());
    }

    @Test
    void setTag() {
        e.setTag(15);
        assertEquals(15, e.getTag());
    }
}



