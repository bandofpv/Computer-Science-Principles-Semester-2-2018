
public class ExTestCircle {  // Save as "TestCircle.java"
   public static void main(String[] args) {
      // Declare an instance of Circle class called c1.
      // Construct the instance c1 by invoking the "default" constructor
      // which sets its radius and color to their default value.
      ExCircle c1 = new ExCircle();
      // Invoke public methods on instance c1, via dot operator.
      System.out.println("The circle has radius of " 
         + c1.getRadius() + " and area of " + c1.getArea());
   
      // Declare an instance of class circle called c2.
      // Construct the instance c2 by invoking the second constructor
      // with the given radius and default color.
      ExCircle c2 = new ExCircle(2.0);
      // Invoke public methods on instance c2, via dot operator.
      System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());
      
//      Circle c4 = new Circle();   // construct an instance of Circle
//      c4.setRadius(5.0);          // change radius
//      System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
//      c4.setColor(......);        // Change color
//      System.out.println("color is: " + c4.getColor());   // Print color via getter
//
//      // You cannot do the following because setRadius() returns void,
//      // which cannot be printed.
//      System.out.println(c4.setRadius(4.0));
      
      ExCircle c3 = new ExCircle(5.0);
      System.out.println(c3.toString());   // explicit call
      
      ExCircle c5 = new ExCircle(1.2);
      System.out.println(c5.toString());  // explicit call
      System.out.println(c5);             // println() calls toString() implicitly, same as above
      System.out.println("Operator '+' invokes toString() too: " + c5);  // '+' invokes toString() too
   }
}