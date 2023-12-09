package oop_practice;

public class Person {
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public String getAge() {
        return age;
    }

    private String age;

    public Person(){}
    public Person(String fullName, String age){
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println(this.fullName + " идет дальше...");
    }

    public void talk(){
        System.out.println(this.fullName + " начинает говорить:");
    }
}
