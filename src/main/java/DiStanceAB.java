import java.text.DecimalFormat;
import java.util.Scanner;

public class DiStanceAB {
    //(x1,y1),(x2,y2)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var x1 = in.nextDouble();
        var y1 = in.nextDouble();
        var x2 = in.nextDouble();
        var y2 = in.nextDouble();
        double res = Math.sqrt((Math.pow((x1-x2),2)+Math.pow((y1-y2),2)));
        //---------------String.format()既支持float有支持double
        String dis = String.format("%.4f",res); //保留4位小数，使用String.format,支持float和double类型
        System.out.println(dis);

        //------------ DecimalFormat()仅支持float类型----------------------
        float test01 = (float) 3.065; //3.07
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println(decimalFormat.format(test01));


    }
}
