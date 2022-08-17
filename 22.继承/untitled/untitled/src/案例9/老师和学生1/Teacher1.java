package 案例9.老师和学生1;
/*
    需求：定义老师类和学生类，然后写代码测试；最后找到老师类和学生类当中的共性内容，抽取出一个父类，用继承的方式改写代码，
            并进行测试
 */
public class Teacher1 {
    private String name;
    private int age;

    public Teacher1() {
    }

    public Teacher1(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public void teach() {
        System.out.println("用爱成就每一位学员");
    }
}
