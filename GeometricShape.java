public class GeometricShape implements Shape {
    private int numSides;
    private double sideLength;
    private String color;

    public GeometricShape(int numSides, double sideLength, String color) {
        this.numSides = numSides;
        this.sideLength = sideLength;
        this.color = color;
    }

    @Override
    public double getArea() {
        // Implement the area calculation for a regular polygon with numSides
        return (1.0/4) * numSides *);
    }

    @Override
    public double getPerimeter() {
        // Implement the perimeter calculation for a regular polygon with numSides
        return numSides * sideLength;
    }

    @Override
    public String getColor() {
        return color;
    }

    // Add other methods or getters as needed

    public int getNumSides() {
        return numSides;
    }

    public double getSideLength() {
        return sideLength;
    }

    // Example usage
    public static void main(String[] args) {
        GeometricShape heptadecagon = new GeometricShape(17, 5, "green");

        System.out.println("Geometric Shape Information:");
        System.out.println("Number of Sides: " + heptadecagon.getNumSides());
        System.out.println("Side Length: " + heptadecagon.getSideLength());
        System.out.println("Color: " + heptadecagon.getColor());
        System.out.println("Area: " + heptadecagon.getArea());
        System.out.println("Perimeter: " + heptadecagon.getPerimeter());
    }
}