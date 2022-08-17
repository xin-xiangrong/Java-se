abstract class Shape {
    //抽象方法
    public abstract void draw();
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个矩形！");
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆！");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个三角形！");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("画一朵❀！");
    }
}


public class Test {
    //向上转型实现多态
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Rect rect = new Rect();
        drawMap(rect);
        drawMap(new Cycle());
        drawMap(new Triangle());
        drawMap(new Flower());
    }
}