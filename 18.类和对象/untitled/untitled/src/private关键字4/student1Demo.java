package private关键字4;
/*
    学生测试类
 */
public class student1Demo {
    public static void main(String[] args) {

        //创建对象
        student1 s1 = new student1();

        //使用set方法给成员变量赋值
        s1.setName("林青霞");
        s1.setAge(30);

        //使用get方法获取成员变量的值
        System.out.println(s1.getName() + "---" + s1.getAge());

        //使用show方法
        s1.show();
    }
}
