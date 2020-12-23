public class ShapeArithmetic {
    private static ShapeArithmetic instance;

    private ShapeArithmetic() {
    }

    public static ShapeArithmetic getInstance() {
        if (instance == null) {
            instance = new ShapeArithmetic();
        }
        return instance;
    }

    public float findArea(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return (float) (Math.PI * circle.radius * circle.radius);
        } else {
            if(shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                return (float) (0.5 * triangle.base * triangle.height);
            } else if(shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                return  (rectangle.length * rectangle.breadth);
            } else {
                return 0.0f;
            }
        }
    }

    public float findCircumference(Shape shape){
        CircumferenceCalculator circumferenceCalculator = new CircumferenceCalculator(this);
        return circumferenceCalculator.findCircumference(shape);
    }

}
