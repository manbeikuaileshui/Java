package 方法;

import java.util.jar.JarOutputStream;

/*
方法(method)：是将具有独立功能的代码块组织成为一个整体，使其具有特殊功能的代码集

方法的通用格式：
    public static 返回值类型 方法名(参数) {
        方法体;
        return 数据;
    }
    public static：修饰符
    返回值类型：方法操作完毕之后返回的数据的数据类型
             如果方法操作完毕，没有数据返回，这里写void，而且方法体中一般不写return
    方法名：调用方法时候使用的标识
    参数：由数据类型和变量名组成，多个参数之间用逗号隔开
    方法体：完成功能的代码块
    return：如果方法操作完毕，有数据返回，用于把数据返回给是调用者
*/
public class fangfa {
    public static void main(String[] args) {
        //调用方法
        boolean number = isEvenNumber(5);
        System.out.println(number);
    }
    //需求：定义一个方法，该方法接收一个参数，判断该数据是否是偶数，并返回真假值
    public static boolean isEvenNumber(int number) {
        if(number%2 == 0) {
            return true;
        } else {
           return false;
        }
    }
}
