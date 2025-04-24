/**
 * Tester program
 */
public class ThreeDShapeTester {
    
    public static void main(String[] args) {
        Cone shape1 = new Cone("Red", 2.5, 5.75);
        Sphere shape2 = new Sphere("Blue", 6.5);
        System.out.println("Welcome to the ThreeDShape tester!");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("This program will instantiate objects of the ThreeDShape hierarchy and test their methods.");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println("Surface area for shape1: " + shape1.surfaceArea());
        System.out.println("Surface area for shape2: " + shape2.surfaceArea());
        System.out.println("Volume for shape1: " + shape1.volume());
        System.out.println("Volume for shape2: " + shape2.volume() + "\n");
        System.out.println("Type of shape1 = " + shape1.getType());
        System.out.println("Colour of shape1 = " + shape1.getColour());
        System.out.println("Radius of shape1 = " + shape1.getRadius());
        System.out.println("Height of shape1 = " + shape1.getHeight() + "\n");
        shape2.setType("3DShape");
        shape2.setRadius(10.3);
        System.out.println(shape2);
    }
    
}
