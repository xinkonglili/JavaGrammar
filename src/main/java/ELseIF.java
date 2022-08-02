import java.util.Scanner;

public class ELseIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double price= 0.0;
        if (x==1){
            price = 4.00;
        } else if (x==2) {
            price= 4.5;
        } else if (x==3) {
            price = 5.00;
        } else if (x==4) {
            price = 2.00;
        }else if (x==5){
            price = 1.50;
        }else {
            System.out.println("没有此商品");
        }
        //格式化输出
        System.out.printf("Total: R$ %.2f",price * y);

    }
}
