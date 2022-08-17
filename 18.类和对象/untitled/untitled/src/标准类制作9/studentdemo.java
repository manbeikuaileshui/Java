package 标准类制作9;

public class studentdemo {
    public static void main(String[] args) {
        //无参构造方法创建对象后使用set变量名()赋值
        student s = new student();
        s.setName("林青霞");
        s.setAge(30);
        s.show();

        //使用带参构造方法直接创建带有属性值的对象
        student s1 = new student("林青霞",30);
        s1.show();
    }
}
