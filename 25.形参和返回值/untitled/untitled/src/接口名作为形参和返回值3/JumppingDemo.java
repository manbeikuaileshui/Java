package 接口名作为形参和返回值3;
/*
    1.方法的形参是接口名，其实需要的是该接口的实现类对象
    2.方法的返回值是接口名，其实返回的是该接口的实现类对象
 */
public class JumppingDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.useJumpping(j);

        Jumpping j1 = jo.getJumpping();
        j1.jump();
    }
}
