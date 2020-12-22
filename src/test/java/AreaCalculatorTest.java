import org.junit.Assert;
import org.junit.Test;

public class AreaCalculatorTest {
    @Test
    public void givenRadius_ShouldCalculate_TheAreaOfCircle() {
        AreaCalculator areaCalculator = AreaCalculator.getInstance();
        ShapeDescriptor descriptor = new ShapeDescriptor();
        descriptor.shapeName = ShapeDescriptor.ShapeType.CIRCLE;
        descriptor.radius = 3;
        Shape shape = ShapeFactory.getInstance().getShape(descriptor);
        float area = areaCalculator.findArea(shape);
        Assert.assertEquals(28.27, area,0.04);
    }

    @Test
    public void givenBaseAndHeight_ShouldReturn_TheAreaOfTriangle() {
        AreaCalculator areaCalculator = AreaCalculator.getInstance();
        ShapeDescriptor descriptor = new ShapeDescriptor();
        descriptor.shapeName = ShapeDescriptor.ShapeType.TRIANGLE;
        descriptor.width = 3;
        descriptor.height = 4;
        Shape shape = ShapeFactory.getInstance().getShape(descriptor);
        float area = areaCalculator.findArea(shape);
        Assert.assertEquals(6, area,0.0);
    }

    @Test
    public void givenLengthAndBreadth_ShouldReturn_TheAreaOfRectangle() {
        AreaCalculator areaCalculator = AreaCalculator.getInstance();
        ShapeDescriptor descriptor = new ShapeDescriptor();
        descriptor.shapeName = ShapeDescriptor.ShapeType.RECTANGLE;
        descriptor.width = 2;
        descriptor.height = 4;
        Shape shape = ShapeFactory.getInstance().getShape(descriptor);
        float area = areaCalculator.findArea(shape);
        Assert.assertEquals(8, area, 0.0);
    }


}