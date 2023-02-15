package 构造方法的注意事项8;

public class studentdemo {
    public static void main(String[] args) {
        //创建对象
        student s1 = new student();
        s1.show();

        //public student(String name)
        student s2 = new student("林青霞");
        s2.show();

        //public student(int age)
        student s3 = new student(30);
        s3.show();

        //public student(String name, int age)
        student s4 =new student("林青霞", 30);
        s4.show();
    }
}
