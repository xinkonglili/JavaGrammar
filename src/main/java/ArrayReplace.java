import java.util.*;

public class ArrayReplace {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int[] x = new int[19];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
            if (x[i]<=0) x[i] =1;
        }

        for (int i = 0; i < x.length; i++) {
            System.out.printf("X[%d] = %d\n",i,x[i]);
        }*/

        Integer[] a = {2,1,5,3,4};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //逆序
        Arrays.sort(a,(x,y)->y-x);//接受2个参数(数字),并返回他们的差值
        System.out.println(Arrays.toString(a));//[5, 4, 3, 2, 1]


        Arrays.sort(a, Collections.reverseOrder());//[5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(a));


    }
}
