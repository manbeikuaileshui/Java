package 常用API5.Math类;
/*
    Math没有构造方法，如何使用类中的成员呢？
        看类的成员是否都是静态的，如果是，通过类名就可以直接调用
    Math类的常用方法
        Math.abs(整数）          返回参数的绝对值
        Math.ceil(小数)         返回大于或等于参数的最小double值，等于一个整数
        Math.floor(小数)        返回小于或等于参数的最大double值，等于一个整数
        Math.round(小数)        按照四舍五入返回最接近参数的int
        Math.Max(整数,整数)      返回两个int值中的较大值
        Math.Min(整数,整数)      返回两个int值中的较小值
        Math.pow(小数,小数)      返回a的b次幂的值
        Math.random()          返回值为double的正直，范围在[0.0,1.0)
 */
public class MathDemo {
    public static void main(String[] args) {
        //返回参数的绝对值
        System.out.println(Math.abs(-88));  //88
        System.out.println("----------");

        //返回大于或等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.34));  //13.0
        System.out.println("----------");

        //返回小于或等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(12.34));  //12.0
        System.out.println("----------");

        //按照四舍五入返回最接近参数的int
        System.out.println(Math.round(11.35));  //11
        System.out.println(Math.round(11.55));  //12
        System.out.println("----------");

        //返回两个int值中的较大值
        System.out.println(Math.max(5,8));  //8
        System.out.println("----------");

        //返回两个int值中的较小值
        System.out.println(Math.min(5,8));  //5
        System.out.println("----------");

        //返回a的b次幂的值
        System.out.println(Math.pow(2.0,3.0));  //8.0
        System.out.println("----------");

        //返回值为double的正直，[0.0,1.0)
        System.out.println(Math.random());  //0.019205725830604425
    }
}
