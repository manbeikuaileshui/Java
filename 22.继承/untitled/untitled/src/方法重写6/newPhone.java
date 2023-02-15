package 方法重写6;
/*
    新手机
 */
public class newPhone extends Phone {
    @Override
    public void call(String name) {
        System.out.println("开启视频功能");
        super.call(name);
    }
}
