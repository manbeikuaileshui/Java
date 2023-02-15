package 接口7.运动员和教练6;
/*
    定义具体乒乓球教练类
 */
public class PingPangCoach extends Coach implements SpeaKenglish {
    @Override
    public void teach() {
        System.out.println("乒乓球教练教如何发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃小白菜，喝大米粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }

    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }
}
