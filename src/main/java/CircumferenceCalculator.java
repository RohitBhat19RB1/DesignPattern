public class CircumferenceCalculator {

    private ShapeArithmetic shapeArithmetic;

    public CircumferenceCalculator(ShapeArithmetic shapeArithmetic) {
        this.shapeArithmetic = shapeArithmetic;
    }

    public float findCircumference(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return (float) (2 * Math.PI * circle.radius);
        } else {
            if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                return 3 * triangle.base;
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                return (2 * (rectangle.length + rectangle.breadth));
            } else {
                return 0.0f;
            }
        }
    }
}
