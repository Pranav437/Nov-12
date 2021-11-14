package Learning;

public class Rectangle1 {
    public static void main(String[] args) {
Rectangle rectangle = new RectangleArea();

        RectangleArea r = new RectangleArea();
        r.width = 12;
        r.height = 9;
        r.display();
        r.Area();
    }
}

class Rectangle {
    int width;
    int height;

    public void display() {
        System.out.println(width + " " + height);
    }
}

class RectangleArea extends Rectangle {
    public void input() {
        display();
    }

    public void Area() {
        System.out.println(width * height);

    }
}