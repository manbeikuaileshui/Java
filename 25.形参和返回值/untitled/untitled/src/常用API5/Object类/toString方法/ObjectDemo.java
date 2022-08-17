package 常用API5.Object类.toString方法;

/*
    Object是类层次结构的根，每个类都可以将Object作为超类。所有类都直接或间接的继承自该类
    构造方法：public Object()
    为什么说子类的构造方法默认访问的是父类的无参构造方法？
        因为他们的顶级父类只有无参构造方法

    看方法的原码，选中方法，按下Ctrl+B

 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(30);
        System.out.println(s);
        /*
        public void println(Object x) {
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }

        public static String valueOf(Object obj) {
            return (obj == null) ? "null" : obj.toString();
        }

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */
        System.out.println(s.toString()); //默认继承Object父类，父类中存在toString方法
    }
}
