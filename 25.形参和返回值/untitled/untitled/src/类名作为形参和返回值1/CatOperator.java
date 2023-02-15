package 类名作为形参和返回值1;

public class CatOperator {
    public void useCat(Cat c) {
        c.eat();
    }

    public Cat getCat() {
        Cat c = new Cat();
        return c;
    }
}
