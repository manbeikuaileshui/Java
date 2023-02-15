package 常用API5.System类;
/*
    System包含几个有用的类字段和方法，它不能被实例化
    System的常用方法：
        System.exit(整数)              终止当前运行的java虚拟机，非零表示异常终止
        System.currentTimeMillis()    返回当前时间(以毫秒为单位)
 */
public class SystemDemo {
    public static void main(String[] args) {
        //System.currentTimeMillis()返回当前时间(以毫秒为单位)
        System.out.println(System.currentTimeMillis());

        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365 + 1970 + "年");

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time1) * 1.0 / 1000);

        //System.exit()终止当前运行的java虚拟机，非零表示异常终止
        System.out.println("开始");
        System.exit(0);
        System.out.println("结束");

    }
}
