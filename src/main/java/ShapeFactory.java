public class ShapeFactory {
    private static ShapeFactory factory;

    private  ShapeFactory(){
    }

    public static ShapeFactory getInstance() {
        if (factory == null) {
            factory = new ShapeFactory();
        }
        return factory;
    }

    public Shape getShape(ShapeDescriptor descriptor) {

        return switch (descriptor.shapeName) {
            case CIRCLE -> new Circle(descriptor.radius);
            case TRIANGLE -> new Triangle(descriptor.width, descriptor.height);
            case RECTANGLE -> new Rectangle(descriptor.width, descriptor.height);
        };
    }
}