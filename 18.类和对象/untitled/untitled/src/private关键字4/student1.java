package private关键字4;

/*
    学生类
 */
public class student1 {

    //成员变量
    private String name;
    private int age;

    //get方法
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //set方法
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }
}
