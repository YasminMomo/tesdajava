public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", 0, 0, 5);
        Rectangle rectangle = new Rectangle("Purple", 6, 4);

        System.out.println("Circle:\nArea: " + String.format("%.2f", circle.calculateArea()) + "\nPerimeter: " + String.format("%.2f", circle.calculatePerimeter()));
        System.out.println();
        System.out.println("Rectangle:\nArea: " + rectangle.calculateArea() + "\nPerimeter: " + rectangle.calculatePerimeter());
    }
}
