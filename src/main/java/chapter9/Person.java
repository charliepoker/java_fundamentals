package chapter9;

public class Person {

    public Person(){
        System.out.println("This is the default Constructor!!!");
    }

    public Person(String name){
        System.out.println("This is another constructor that takes in the parameter name");
    }

    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
