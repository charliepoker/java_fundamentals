package chapter9;

public class Square extends Rectangle{

//    Overiding a calculate perimeter method inherited from the Rectangle class
    @Override
    public  double calculatePerimeter(){
        return  sides * length;
    }

    public void print(String what){
        System.out.println("I am a square");
    }
}
