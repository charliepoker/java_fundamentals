package chapter6;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = setWidth(width);

    }

    public double getLength(){
        return  length;
    }

    public double setLength(double length){
      return  this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public double setWidth(double width){
       return this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
