/**
 * Cone class that extends the ThreeDShape class
 */
public class Cone extends ThreeDShape {
    
    private double radius;
    private double height;
    /**
     * Constructor for Cone class with 3 parameters
     * @param colour
     * @param radius
     * @param height
     */
    public Cone(String colour, double radius, double height) {
        super("Cone", colour);
        this.radius = radius;
        this.height = height;
    }

    /**
     * Getter for radius
     * @return the radius
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Getter for height
     * @return the height
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Setter for radius
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Setter for height
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Computes the surface area for cone
     */
    @Override
    public double surfaceArea() {
        double sArea = Math.PI * this.radius * (this.radius + Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.radius, 2)));
        return sArea;
    }

    /**
     * Computes volume for cone
     */
    @Override
    public double volume() {
        double vol = Math.PI * Math.pow(this.radius, 2) * (this.height / 3);
        return vol;
    }
    
    public String toString() {
        return super.toString() + "Radius: " + this.getRadius() + "\n" + "Height: " + this.getHeight() + "\n";
    }
}
