package private关键字4;
/*
    学生测试类
 */
public class studentDemo {
    public static void main(String[] args) {
        //创建对象
        student s = new student();
        //给成员变量赋值
        s.name = "林青霞";
        s.setAge(30);

        //调用方法
        s.show();
    }
}
