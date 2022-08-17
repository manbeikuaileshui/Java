package this关键字5;

public class studentDemo {
    public static void main(String[] args) {

        //创建对象
        student s = new student();

        //使用set方法给成员变量赋值
        s.setName("林青霞");
        s.setAge(30);

        //使用get方法获取成员变量的值
        System.out.println(s.getName() + "---" + s.getAge());

        //使用show方法
        s.show();
    }
}
