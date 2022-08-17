package 数组介绍;
/*
数组的定义格式：

   格式一：数据类型[] 变量名      (推荐使用)
      例：int[] arr
         定义了一个int类型的数组，数组名是arr

   格式二：数据类型 变量名[]
      例：int arr[]
         定义了一个int类型的变量，变量名是arr数组

数组的初始化

   动态初始化：初始化时只指定数组的长度，由系统为数组分配初始值
       格式：数据类型[] 变量名 = new 数据类型[数组长度];
        例：int[] arr = new int[3];

   静态初始化：初始化时指定每个数组元素的初始值，由系统决定数组的长度
       格式：数据类型[] 变量名 = new 数据类型[]{数据1,数据2,...};
        例：int[] arr = new int[]{100,200,300};
   简化格式：数据类型[] 变量名 = {数据1,数据2,...};
       例：int[] arr = {100,200,300};
 */

public class shuzu {
 public static void main(String[] args) {

  //动态初始化
  int[] arr = new int[3];

  //静态初始化(推荐使用)
  int[] arr1 = {1,2,3};

  /*
     左边：
         int：说明数组中的元素类型是int类型
         []:说明这是一个数组
         arr：这是数组的名称
     右边：
         new：为数组申请内存空间
         int：说明数组中的元素类型是int类型
         []：说明这是一个数组
         3：数组长度，其实就是数组中的元素个数
  */

  //输出数组名
  System.out.println(arr);
  System.out.println(arr1);

  //输出数组元素
  System.out.println(arr[1]);
  System.out.println(arr1[1]);

  //修改数组元素
  arr[1] = 100;
  arr1[1] = 10;
  System.out.println(arr[1]);
  System.out.println(arr1[1]);
 }
}
