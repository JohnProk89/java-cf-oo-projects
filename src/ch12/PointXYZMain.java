package ch12;

import ch12.model.PointXYZ;

public class PointXYZMain {

    public static void main(String[] args) {

        PointXYZ point1 = new PointXYZ(1, 1, 1);
        PointXYZ point2 = new PointXYZ(2, 2, 2);

        System.out.println("I got the following points:");
        System.out.println(point1.convertToString());
        System.out.println(point2.convertToString());

        double xyDistance = point1.getXYDistance(point2);
        System.out.printf("Their distance in the xy plane is: %.4f \n", xyDistance);

        double yzDistance = point1.getYZDistance(point2);
        System.out.printf("Their distance in the yz plane is: %.4f \n", yzDistance);

        double xzDistance = point1.getXZDistance(point2);
        System.out.printf("Their distance in the xz plane is: %.4f \n", xzDistance);

        double xyzDistance = point1.getXYZDistance(point2);
        System.out.printf("Their distance in 3d is: %.4f\n", xyzDistance);
    }
}
