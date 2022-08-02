import java.util.Scanner;

public class Switch {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String name ;

        switch (num){
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            default:
                name = "invalid";
        }
        //输出
        //java里面可以直接输出String
        //%d（输出整数） %s（输出字符串） %f(输出double和float)
        System.out.printf("%s\n", name);
        System.out.println(name);

    }
}
