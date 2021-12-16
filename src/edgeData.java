import api.EdgeData;

public class edgeData implements EdgeData {

    int src;
    int dest;
    double weight;
    String info;
    int tag;

    public edgeData(int src, int dest, double weight,String info,int tag) {
        this.tag = tag;
        this.src = src;
        this.dest = dest;
        this.weight = weight;
        this.info = info;
    }

    @Override
    public int getSrc() {
        return this.src;
    }

    @Override
    public int getDest() {
        return this.dest;
    }

    @Override
    public double getWeight() {
        return this.weight;
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
