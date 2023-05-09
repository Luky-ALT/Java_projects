public class triangle implements Shape{
    double height;
    double base;
    int a;
    int b;
    int c;

    public triangle(int a, int b, int c, double height, double base) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height=height;
        this.base= base;
    }

    @Override
    public double CalculateArea() {
        return height*base/2;
    }

    @Override
    public double CalculatePerimeter() {
        return a+b+c;
    }
}
