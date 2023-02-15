package 接口7.运动员和教练6;
/*
    需求：我们现在有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练。为了出国交流，跟乒乓球相关的人员都需要
         学习英语。请用所学知识分析，这个案例中有哪些具体类，哪些抽象类，哪些接口，并用代码实现。
 */
public class PersonDemo {
    public static void main(String[] args) {
        //创建乒乓球运动员对象
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("王浩");
        ppp.setAge(30);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.study();
        ppp.eat();
        ppp.speak();
        System.out.println("----------");

        ppp = new PingPangPlayer("王海",31);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.study();
        ppp.eat();
        ppp.speak();
        System.out.println("----------");

        //创建篮球运动员对象
        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(35);
        System.out.println(bp.getName() + "," + bp.getAge());
        bp.study();
        bp.eat();
        System.out.println("----------");

        bp = new BasketballPlayer("易建联",30);
        System.out.println(bp.getName() + "," + bp.getAge());
        bp.study();
        bp.eat();
        System.out.println("----------");

        //创建乒乓球教练对象
        PingPangCoach ppc = new PingPangCoach();
        ppc.setName("无名");
        ppc.setAge(55);
        System.out.println(ppc.getName() + "," + ppc.getAge());
        ppc.teach();
        ppc.eat();
        ppc.speak();
        System.out.println("----------");

        ppc = new PingPangCoach("有名", 45);
        System.out.println(ppc.getName() + "," + ppc.getAge());
        ppc.teach();
        ppc.eat();
        ppc.speak();
        System.out.println("----------");

        //创建篮球教练对象
        BasketballCoach bc = new BasketballCoach();
        bc.setName("科尔");
        bc.setAge(55);
        System.out.println(bc.getName() + "," + bc.getAge());
        bc.teach();
        bc.eat();
        System.out.println("----------");

        bc = new BasketballCoach("杜峰", 45);
        System.out.println(bc.getName() + "," + bc.getAge());
        bc.teach();
        bc.eat();
    }
}
