package 导包2.cn.itacst;
/*
    使用不同包下的类时，使用的时候要写类的全路径，写起来太麻烦了
    为了简化带包的操作，Java就提供了导包的功能
    导包格式：inport 包名.java文件名;
       范例：inport cn.itacst.Theacher

 */
public class Teacher {
    public void teach() {
        System.out.println("用爱成就每一位学员");
    }
}
