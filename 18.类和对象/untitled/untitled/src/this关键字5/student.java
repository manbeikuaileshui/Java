package this关键字5;
/*
    this关键字
        1.this修饰的变量用于指代成员变量
            ①.方法的形参与成员变量名相同，不带this修饰的变量指的是形参，而不是成员变量
            ②.方法的形参与成员变量名不同，不带this修饰的变量指的是成员变量
        2.什么时候使用this呢？解决局部变量隐藏成员变量
        3.this：代表所在类的对象引用
                记住：方法被哪个对象调用，this就代表哪个对象
 */
public class student {

    //成员变量
    private String name;
    private int age;

    //set方法
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //get方法
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //show方法
    public void show() {
        System.out.println(name + "," + age);
    }
}
