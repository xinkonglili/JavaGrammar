import java.util.*;
public class StackPractice extends Stack {
    public static void main(String[] args) {
        StackPractice stk = new StackPractice();
        stk.push(1);
        stk.push(4);
        stk.push(8);
        System.out.println(stk);//[1, 4, 8]
       /* int a = (int) stk.get(0);
        System.out.println(a);//1
        System.out.println(stk.get(1));
        System.out.println(stk.get(1).getClass().toString());//class java.lang.Integer*/

        stk.pop();//弹栈,并且返回栈顶元素
        System.out.println(stk);//[1, 4]

        System.out.println(stk.peek());//4  只返回栈顶元素

        System.out.println(stk);//[1, 4]
        System.out.println(stk.size());//2

        System.out.println(stk.empty());//false

        stk.clear();
        System.out.println(stk);//[]




    }

}
