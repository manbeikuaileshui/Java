package 百钱白鸡;

/*
    需求：
        鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
        百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
    分析：
        假设鸡翁x只，鸡母y只，鸡雏z只，则有
        x + y + z = 100;
        5*x + y*3 + z/3 = 100;
        每类鸡最多买多少？则有
        0 <= x <= 20
        0 <= y <= 33
        0 <= z <= 100
 */
public class maiji {
    public static void main(String[] args) {
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                int z = 100 - x - y;
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
                    System.out.println("鸡翁" + x + "只," + "鸡母" + y + "只," + "鸡雏" + z + "只");
                }
            }
        }
    }
}
