package algo;

import api.GeoLocation;

public class geoLocation implements GeoLocation {

    public double x;
    public double y;
    public double z;


    public geoLocation(){
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public geoLocation(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double x() {
        return this.x;
    }

    @Override
    public double y() {
        return this.y;
    }

    @Override
    public double z() {
        return this.z;
    }

    @Override
    public double distance(GeoLocation g) {
        return Math.sqrt(Math.pow(this.x - g.x(), 2) + Math.pow(this.y - g.y(), 2) + Math.pow(this.z - g.z(), 2));
    }

        public void setX(double x1) {
             this.x=x1;
        }

        public void setY(double y1) {
             this.y=y1;
        }

        public void setZ(double z1) {
             this.z=z1;
        }
    }

