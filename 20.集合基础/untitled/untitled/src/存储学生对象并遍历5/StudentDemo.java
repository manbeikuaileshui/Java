package 存储学生对象并遍历5;

import java.util.ArrayList;
import java.util.Scanner;

/*
    需求：创建一个存储对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
        学生的姓名和年龄来自于键盘录入
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //调用方法给集合添加元素
        for (int i = 0; i < 3; i++) {
            addStudent(array);
        }

        //遍历集合元素
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        //创建学生对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        Student s = new Student(name, age);
        //给集合添加元素
        array.add(s);
    }
}
