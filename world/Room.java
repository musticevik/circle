package world;

public class  Room {
    public double minX = 0;
    public double maxX = 800;
    public double minY = 0;
    public double maxY = 800;
    public double minZ = 0;
    public double maxZ = 800;

    public Room(double minX, double maxX, double minY, double maxY, double minZ, double maxZ){
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.minZ = minZ;
        this.maxZ = maxZ;
    }
}
