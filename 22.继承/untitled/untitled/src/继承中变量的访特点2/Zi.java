package 继承中变量的访特点2;
/*
    子类
 */
public class Zi extends Fu{
    //身高
    public int height = 175;

    //年龄
    public int age = 20;

    public void show() {
        int age = 30;
        System.out.println(age);
        System.out.println(height);
    }
}
