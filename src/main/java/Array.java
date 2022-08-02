import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[19];//数组不可变长
        int n = 100;
        float[] f = new float[n];
        char[] c = {'q','w','e'};
        char[] d = c;

        int[][] e = new int[2][4];
        e[1][2] = 8;
        //直接初始化赋值
        int[][] u = {
                {2,3,4,6},
                {6,7,2,5}
        };
        System.out.println(Arrays.deepToString(u));//[[2, 3, 4, 6], [6, 7, 2, 5]]

        System.out.println(Arrays.deepToString(e));//[[0, 0, 0, 0], [0, 0, 8, 0]]

        int[] g = new int[6];
        g[4] = 18;
        System.out.println(Arrays.toString(g));//[0, 0, 0, 0, 18, 0]
        Arrays.sort(g);
        System.out.println(Arrays.toString(g));//[0, 0, 0, 0, 0, 18]
        //这里面的length是属性
        for (int i = 0 ;i<g.length;i++){
            g[3] = 9;
        }
        System.out.println(Arrays.toString(g));//[0, 0, 0, 9, 0, 18]

        Arrays.fill(g,8);//[8, 8, 8, 8, 8, 8]
        System.out.println(Arrays.toString(g));



        c[0] = 'p';
        System.out.println(d[0]);//p
        System.out.println(d);//pwd
        System.out.println(c);//pwd
        System.out.println(c.hashCode());//2003749087
        System.out.println(d.hashCode());//2003749087

    }
}
