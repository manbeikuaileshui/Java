package 作业;

public class Student extends People {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println("好好学习，天天向上");
    }
}
