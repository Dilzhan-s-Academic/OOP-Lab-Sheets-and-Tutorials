public class ex02{
    public static void main(String[] arg){
        Point3D point1 = new Point3D(2,4,6);
        point1.calDistance();

        System.out.println(point1.distance);
    }
}

public class Point3D{
    private int x;
    private int y;
    private int z;

    public double distance;

    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void calDistance(){
        distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
    }
}