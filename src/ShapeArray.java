//shapeArray.java

public class ShapeArray {
    public static void main(String[] args) {

        //Instantiate one of each shape
        Sphere sphere = new Sphere(5.0);
        Cylinder cylinder = new Cylinder(3.0, 7.0);
        Cone cone = new Cone(4.0, 6.0);

        //Store class instances
        Shape[] shapeArray = { sphere, cylinder, cone };

        //Array loop and output
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}