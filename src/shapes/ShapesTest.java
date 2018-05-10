package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape;


//        myShape = new Rectangle(45, 56);
        myShape = new Square(5);

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());


        //Question 9. Why does the code fail to compile if you leave off
        //the getPerimeter method in rectangle?

        //A class that implements an interface, in this case "Measurable"
        //must implement each method defined by the interface.

        //Question 10. What happens if you try to call the getLength
        //or getWidth methods of the myShape variable? Why?

        //It wont work because there is no "getWidth" or "getLength"
        //method on the Measurable class and you are calling it on
        //a variable that is the type "Measurable"


    }
}
