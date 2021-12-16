package Test;
import algo.geoLocation;
import algo.nodeData;
import api.GeoLocation;
import api.NodeData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class testgeoLocation {

     GeoLocation l = new geoLocation(0, 0, 0);

    @Test
    void distance() {
        GeoLocation l1 = new geoLocation(1, 1, 1);
        double dis = l.distance(l1);
        assertEquals(1.7320508075688772, dis);
    }

    @Test
    void getX() {
        assertEquals(0, l.x());
    }

    @Test
    void getY() {
        assertEquals(0, l.y());
    }

    @Test
    void getZ() {
        assertEquals(0, l.z());
    }


}
