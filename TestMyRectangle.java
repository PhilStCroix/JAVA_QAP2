public class TestMyRectangle {
    public static void main(String[] args) {
        // Create MyPoint objects for top-left and bottom-right corners
        MyPoint topLeft = new MyPoint(1, 5);
        MyPoint bottomRight = new MyPoint(6, 2);

        // Create a MyRectangle object using the MyPoint objects
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        // Display the rectangle's properties
        System.out.println("Rectangle:");
        System.out.println("Top-Left Corner: " + rectangle.getTopLeft());
        System.out.println("Bottom-Right Corner: " + rectangle.getBottomRight());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle as String: " + rectangle.toString());
    }
}
