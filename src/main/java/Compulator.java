import java.util.Scanner;
/*
* 读取四个整数 A,B,C,D，并计算 (A×B−C×D) 的值。

输入格式
输入共四行，第一行包含整数 A，第二行包含整数 B，第三行包含整数 C，第四行包含整数 D。

输出格式
输出格式为 DIFERENCA = X，其中 X 为 (A×B−C×D) 的结果。

数据范围
−10000≤A,B,C,D≤10000*/
public class Compulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var A = in.nextInt();
        var B = in.nextInt();
        var C= in.nextInt();
        var D = in.nextInt();
        System.out.println("DIFERENCA = "+ (A*B-C*D));

    }
}
