package structural.decorator;


public class Main {
    public static void main(String[] args) {
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Shape blueRectangle = new BlueShapeDecorator(new Rectangle());
        redCircle.draw();
        redRectangle.draw();
        blueRectangle.draw();
    }
}
