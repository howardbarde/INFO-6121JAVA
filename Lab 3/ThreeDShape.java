/*
 * ThreeDShape class - the parent class
 */
public abstract class ThreeDShape {
    
    private String type;
    private String colour;
    /**
     * Constructor for ThreeDShape with 2 parameters
     * @param type
     * @param colour
     */
    public ThreeDShape(String type, String colour) {
        this.type = type;
        this.colour = colour;
    }

    /**
     * Getter for type
     * @return the type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Getter for colour
     * @return the colour
     */
    public String getColour() {
        return this.colour;
    }

    /**
     * Setter for type
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Setter for colour
     * @param colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return "Type: " + this.getType() + "\n" + "Colour: " + this.getColour() + "\n";
    }
    
    //abstract methods
    public abstract double surfaceArea();
    public abstract double volume();
}
