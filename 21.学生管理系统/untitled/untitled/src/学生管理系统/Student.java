package 学生管理系统;
/*
    学生类
    Alt+Insert:根据自己的需要选择
 */
public class Student {
    //成员变量
    private String sid; //学号
    private String name; //名字
    private String age; //年龄
    private String address; //住址

    //构造方法
    public Student() {}
    public Student(String sid, String name, String age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //set方法
    public String getSid() {
        return sid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
