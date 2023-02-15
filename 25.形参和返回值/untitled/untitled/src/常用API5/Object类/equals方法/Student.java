package 常用API5.Object类.equals方法;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //this----s1
        //o----s2
        if (this == o) return true;  //比较地址是否相同
        if (o == null || getClass() != o.getClass()) return false; //判断参数是否为null、判断两个对象是否来自同一个类

        Student student = (Student) o;  //studebt----s2

        if (age != student.age) return false;  //age代表的是s1的age，比较年龄是否相同
        return name != null ? name.equals(student.name) : student.name == null;  //比较名字是否相同
    }
}
