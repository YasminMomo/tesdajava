class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double length, double width, double radius) {
        super(color, length, width);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
