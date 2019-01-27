package triangle;

public class Triangle {
    private int x, y, z;

    public Triangle() {
    }

    public Triangle(int x, int y, int z) {
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

    private String type() {
        if (x == y && y == z) {
            return "equilateral";
        } else if (x == y || y == z || z == x) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    public void testTriangle() {
        System.out.println(type());
    }

}
