package super3;

public class Zi extends Fu{
    public int age = 20;

    public void show() {
        int age = 30;
        //访问局部的变量age
        System.out.println(age);
        //访问本类的成员变量age
        System.out.println(this.age);
        //访问父类的成员变量age
        System.out.println(super.age);
    }
}
