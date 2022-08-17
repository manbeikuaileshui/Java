package 作业;

import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入机票的原价：");
        double money = sc1.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入舱位类型：");
        String cangwei = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("请输入购票月份：");
        int month = sc3.nextInt();

        double price = zheko(money, cangwei, month);
        System.out.println("机票价格为：" + price + "元");
    }

    public static double zheko(double money, String cangwei, int month) {
        double price = 0;
        if (month >= 5 && month <= 10) {
            switch (cangwei) {
                case "头等舱":
                    price = money*0.9;
                    break;
                case "经济舱":
                    price = money*0.85;
                    break;
                default:
                    price = -1;
            }
        } else if (month >= 11 && month <= 12 || month >= 1 && month <= 4) {
            switch (cangwei) {
                case "头等舱":
                    price = money*0.7;
                    break;
                case "经济舱":
                    price = money*0.65;
                    break;
                default:
                    price = -1;
            }
        } else {
            price = -1;
        }
        return price;
    }
}
