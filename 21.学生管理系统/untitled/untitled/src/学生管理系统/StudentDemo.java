package 学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

/*
    学生管理系统
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建集合，用于存储学生数据
        ArrayList<Student> array = new ArrayList<>();
        //功能循环
        while (true) {
            //菜单
            menu();
            //创建对象
            Scanner sc = new Scanner(System.in);
            //选择功能
            switch (sc.nextInt()) {
                case 1:
                    addStudent(array);
                    break;
                case 2:
                    delStudent(array);
                    break;
                case 3:
                    updateStudent(array);
                    break;
                case 4:
                    findAllStudent(array);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("输入有误，请重新输入！");
                    break;
            }
        }
    }

    //菜单
    public static void menu() {
        System.out.println("--------欢迎来到学生管理系统--------");
        System.out.print("\t1.添加学生\t");
        System.out.println("2.删除学生");
        System.out.print("\t3.修改学生\t");
        System.out.println("4.查看所有学生");
        System.out.println("5.退出");
        System.out.println("请输入你的选择：");
    }

    //添加
    public static void addStudent(ArrayList<Student> array) {
        //输入学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();
        boolean result = isUsed(array, sid);
        while (result) {
            System.out.println("学号已被使用，请重新输入：");
            sid = sc.nextLine();
            result = isUsed(array, sid);
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生住址：");
        String address = sc.nextLine();
        //创建学生对象
        Student s = new Student(sid, name, age, address);
        //添加元素到集合
        array.add(s);
        System.out.println("添加成功");
    }

    //查看所有学生
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() > 0) {
            System.out.println("学号\t\t\t\t姓名\t\t年龄\t\t居住地址");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
            }
        } else {
            System.out.println("无信息，请先添加信息再查询！");
        }
    }

    //删除
    public static void delStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除学生的学号：");
        String sid = sc.nextLine();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(sid)) {
                array.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("要删除的人不存在");
    }

    //修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改学生信息的学号：");
        String line = sc.nextLine();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(line)) {
                System.out.println("请输入新的学号：");
                String sid = sc.nextLine();
                boolean result = isUsed(array, sid);
                while (result) {
                    if (array.get(i).getSid().equals(sid)) {
                        break;
                    }
                    System.out.println("学号已被使用，请重新输入：");
                    sid = sc.nextLine();
                    result = isUsed(array, sid);
                }
                System.out.println("请输入新的姓名：");
                String name = sc.nextLine();
                System.out.println("请输入新的年龄：");
                String age = sc.nextLine();
                System.out.println("请输入新的居住地址：");
                String address = sc.nextLine();
                Student s = new Student(sid, name, age, address);
                array.set(i, s);
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("要修改的学生不存在");
    }

    //判断学号是否被使用
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(sid)) {
                return true;
            }
        }
        return false;
    }
}
