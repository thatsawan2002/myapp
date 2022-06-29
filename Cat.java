package myapp;

public class Cat {
    private String name;
    private String age;

    public String getName() {return name;}
    public String getAge() {return age;}

    public Cat(String name, String age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args){
        System.out.println("แมวน่ารัก");
    }
}
