/**
 * Sphere class that inherits the ThreeDShape class
 */
public class Sphere extends ThreeDShape {
    
    private double radius;
    /**
     * Constructor for the Sphere class with 2 parameters
     * @param colour
     * @param radius
     */
    public Sphere(String colour, double radius) {
        super("Sphere", colour);
        this.radius = radius;
    }

    /**
     * Getter for radius
     * @return the radius
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Setter for radius
     * @param radius the radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Computes the surface area for sphere
     */
    @Override
    public double surfaceArea() {
        double sArea = 4 * Math.PI * Math.pow(this.radius, 2);
        return sArea;
    }

    /**
     * Computes the volume for sphere
     */
    @Override
    public double volume() {
        double vol = 4 * Math.PI * (Math.pow(this.radius, 3) / 3);
        return vol;
    }

    public String toString() {
        return super.toString()  + "Radius: " + this.getRadius() + "\n";
    }
}
