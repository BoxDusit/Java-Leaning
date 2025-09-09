abstract class Shape  {
    public Shape(){
    }
    public double getArea(){
        return 0.0;
    }

}

class Circle extends Shape{
    private double redius;
    public Circle(double redius){
        this.redius=redius;
    }

    @Override
    public double getArea() {
        double PI = 3.1412;
        return PI*redius*redius;
    }
}

class Square extends Shape{
    private double length;
    public Square(double length){
        this.length=length;
    }

    @Override
    public double getArea() {
        return length*length;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double getArea(){
        return length*width;
    }
}





