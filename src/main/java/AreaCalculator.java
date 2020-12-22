public class AreaCalculator {
    private static AreaCalculator instance;

    private AreaCalculator() {
    }

    public static AreaCalculator getInstance() {
        if (instance == null) {
            instance = new AreaCalculator();
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

//    public  float findArea(Shape triangle){
//        return (float) (0.5 * triangle.base * triangle.height);
//    }
//
//    public float findArea(Shape rectangle){
//        return  (rectangle.length * rectangle.breadth);
//    }


}
