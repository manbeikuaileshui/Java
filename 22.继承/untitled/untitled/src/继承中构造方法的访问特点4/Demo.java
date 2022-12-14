package 继承中构造方法的访问特点4;
/*
    子类中所有的构造方法默认都会访问父类中无参的构造方法
    为什么呢？
        1.因为子类会继承父类中的数据，可能还会使用父类的数据。所以，子类初始化之前，一定要先完成父类数据的初始化
        2.每一个子类构造方法的第一条语句默认都是：super()

    如果父类中没有无参构造方法，只有带参构造方法，该怎么办？
        1.通过使用super关键字去显示的调用父类的带参构造方法
        2.在父类中自己提供一个无参构造方法 (推荐使用)
 */
public class Demo {
    public static void main(String[] args) {
        //创建对象
        Zi z = new Zi();

        Zi z1 = new Zi(20);
    }
}
