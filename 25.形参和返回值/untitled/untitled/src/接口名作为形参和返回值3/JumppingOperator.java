package 接口名作为形参和返回值3;

public class JumppingOperator {
    public void useJumpping(Jumpping j) {
        j.jump();
    }

    public Jumpping getJumpping() {
        Jumpping j = new Cat();
        return j;
    }
}
