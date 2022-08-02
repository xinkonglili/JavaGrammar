import java.io.*;

//这种输出的效率比较高，输出较大规模的时候使用，sout的输出效率低
public class Sout {
  /*  public static void main(String[] args) throws IOException {
        BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(System.out));//读出
        buff.write("hello world");
        buff.flush();//必须要手动刷新缓冲区
    }*/



  /* //保留2位小数
    public static void main(String[] args) {
        //这里的输出是printf/不是println
        System.out.printf("%.2f\n", 123.5376);//123.54
        System.out.printf("%04d\n",12);//补足4位，如果不足4位，用0来填充
        System.out.printf("%.4f\n", 27767.78890890D);//27767.7889
        System.out.printf("%.4f\n", 27767.78890890f);//27767.7891
    }*/

    public static void main(String[] args) throws IOException {
        //readline() 方法用于从文件读取整行，包括 "\n" 字符。返回指定大小的字节数，包括 "\n" 字符,readLine(指定读取的字符串个数)
        //如果不指定buffer大小，则readLine()使用的buffer有8192个字符。在达到buffer大小之前，只有遇到"/r"、"/n"、"/r/n"才会返回。\
        //readLine()是阻塞式函数，如果没有数据就会一直阻塞在那里，所以会想到把输出的语句放到while循环中来读
        /*
        *
                BufferedReader input = new BufferedReader(new  InputStreamReader(m_conn.openInputStream()));
                String message = "";
                String line = null;
                while((line = m_input.readLine()) != null) {
                    message += line;
                    System.out.println(message);
                }
          */

      /*  BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));//读入
        int x = Integer.parseInt(bu.readLine());//可以把字符串转成整数，Scanner中直接读入整数有个nextInt()函数
        System.out.println(x);//127687      127687
*/

        /*一行读取2个，空格分开
        in:56378 576837
        out:56378 576837
        BufferedReader bu = new BufferedReader((new InputStreamReader(System.in)));
        String[] strs = bu.readLine().split(" ");
        int x = Integer.parseInt(strs[0]);
        int y = Integer.parseInt(strs[1]);
        System.out.println(x+ " " +y);
        */

       /* 一行读取多个，空格分开
        4578 658 53789
        4578 658 53789
        BufferedReader bu = new BufferedReader((new InputStreamReader(System.in)));
        String[] strs = bu.readLine().split(" ");
        for (String str : strs) {
            System.out.print(Integer.parseInt(str)+" ");
        }*/






    }
}
