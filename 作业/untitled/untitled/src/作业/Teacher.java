package 作业;

public class Teacher extends People {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("老师教书");
    }
}
