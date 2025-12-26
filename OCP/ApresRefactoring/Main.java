package OCP.ApresRefactoring;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Rectangle(4, 3);

        // Fixed the string concatenation and quotation marks
        System.out.println("Area = " + shape.calculateArea());
    }
}