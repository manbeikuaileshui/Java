package 内部类4.成员内部类2;

public class Outer {

    private int num = 10;

    /*public class Inner {
        public void show() {
            System.out.println(num);
        }
    }  一般不这样写，改写如下： */

    private class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    public void method() {
        Inner i = new Inner();
        i.show();
    }
}
