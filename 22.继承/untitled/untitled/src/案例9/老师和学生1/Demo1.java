package 案例9.老师和学生1;

public class Demo1 {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        Teacher1 t1 = new Teacher1();
        t1.setName("林青霞");
        t1.setAge(30);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();
        System.out.println("----------");

        Teacher1 t2 = new Teacher1("风清扬", 28);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();
        System.out.println("----------");

        //创建学生对象进行测试
        Student1 s1 = new Student1();
        s1.setName("刘星");
        s1.setAge(18);
        System.out.println(s1.getName() + "," + s1.getAge());
        s1.study();
        System.out.println("----------");

        Student1 s2 = new Student1("夏雪", 20);
        System.out.println(s2.getName() + "," +s2.getAge());
        s2.study();
    }
}
