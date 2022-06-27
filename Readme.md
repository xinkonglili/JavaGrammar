### 1、next() 与 nextLine() 区别
  - next():

    - 1、一定要读取到有效字符后才可以结束输入。

    - 2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。

    - 3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
    
    - 4、 next() 不能得到带有空格的字符串。
  - nextLine()：

    - 1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
    - 2、可以获得空白。
### 2、hasxxx() 和 nextXXX()
```
// 判断输入的是否是整数
if (scan.hasNextInt()) {
// 接收整数
i = scan.nextInt();
System.out.println("整数数据：" + i);
} else {
// 输入错误的信息
System.out.println("输入的不是整数！");
}
```
### 3、Scanner类
java.util.Scanner 是 Java5 的新特征，可以通过 Scanner 类来获取用户的输入
,语法如下：
```Scanner s = new Scanner(System.in);```