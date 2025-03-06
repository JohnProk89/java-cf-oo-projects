package ch13;

/**
 * Class representing a three-dimensional point
 */
public class PointXYZ {
    private int x;
    private int y;
    private int z;

    public PointXYZ() {
    }

    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String convertToString(){
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public double getXYDistance(PointXYZ point){
        int dx = this.getX() - point.getX();
        int dy = this.getY() - point.getY();
        return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
    }

    public double getYZDistance(PointXYZ point){
        int dy = this.getY() - point.getY();
        int dz = this.getZ() - point.getZ();
        return Math.sqrt(Math.pow(dy,2) + Math.pow(dz,2));
    }

    public double getXZDistance(PointXYZ point){
        int dx = this.getX() - point.getX();
        int dz = this.getZ() - point.getZ();
        return Math.sqrt(Math.pow(dx,2) + Math.pow(dz,2));
    }

    public double getXYZDistance(PointXYZ point){
        int dx = this.getX() - point.getX();
        int dy = this.getY() - point.getY();
        int dz = this.getZ() - point.getZ();
        return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2) + Math.pow(dz,2));
    }
}
