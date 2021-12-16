import api.GeoLocation;
import api.NodeData;

public class nodeData  implements NodeData {

    private geoLocation l;
    private int key;
    private double weight;
    private String info;
    private int tag;

    public nodeData(double x, double y, double z, int key,double weight,String info,int tag){
        this.key = key;
        this.l = new geoLocation(x, y, z);
        this.weight= weight;
        this.info=info;
        this.tag=tag;
    }
    public nodeData(){
        this.key = 0;
        this.l = new geoLocation(0.0, 0.0, 0.0);
        this.info="";
        this.tag=0;
    }


    @Override
    public int getKey() {
        return key;
    }

    @Override
    public GeoLocation getLocation() {
        return l;
    }

    @Override
    public void setLocation(GeoLocation p) {
        l.setX(p.x());
        l.setY(p.y());
        l.setZ(p.z());
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double w) {
        this.weight=w;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public void setInfo(String s) {
       this.info=s;
    }

    @Override
    public int getTag() {
        return this.tag;
    }

    @Override
    public void setTag(int t) {

        this.tag=t;
    }
}
