package 作业;

public class PeopleDemo {
    public static void main(String[] args) {

        Student s = new Student("张三",18);
        s.study();
        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.teach();
    }
}
