package 案例3;
/*
    学生测试类
 */
public class studentDemo {
    public static void main(String[] args) {
        //创建对象
        student s = new student();

        //使用成员变量
        System.out.println(s.name + "," + s.age);
        s.name = "张三";
        s.age = 18;
        System.out.println(s.name + "," + s.age);

        //使用成员方法
        s.study();
        s.doHomework();
    }
}
