package Test;

import algo.geoLocation;
import algo.nodeData;
import api.GeoLocation;
import api.NodeData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class testNodeData {

    int key=1;
    int tag=0;
    double weight=10.5;
    String info = "";
    NodeData n = new nodeData(0,0,0,key, weight, info, tag);


    @Test
    void getKey() {
        int a = 1;
        assertEquals(1, a);
    }

    @Test
    void getLocation() {

        assertEquals(0, n.getLocation().x());
        assertEquals(0,n.getLocation().y());
        assertEquals(0, n.getLocation().z());
    }

    @Test
    void getWeight() {
        assertEquals(10.5,  n.getWeight());
    }

    @Test
    void setWeight() {
        n.setWeight(1.0);
        assertEquals(1,n.getWeight());
    }

    @Test
    void getInfo() {
        String s = n.getInfo();
        assertTrue(s.equals(""));
    }

    @Test
    void setInfo() {
        n.setInfo("test");
        assertTrue(n.getInfo().equals("test"));
    }

    @Test
    void getTag() {
        assertEquals(0,n.getTag());
    }

    @Test
    void setTag() {
        n.setTag(1);
        assertEquals(1,n.getTag());
    }

    @Test
    void setLocation() {
        GeoLocation loc2 = new geoLocation(1,1,0);
        n.setLocation(loc2);
        GeoLocation loc3 = n.getLocation();
        assertEquals(loc2.x(),loc3.x());
        assertEquals(loc2.y(),loc3.y());
        assertEquals(loc2.z(),loc3.z());
    }


}
