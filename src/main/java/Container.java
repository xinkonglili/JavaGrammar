import java.util.ArrayList;
import java.util.LinkedList;

import static java.util.Collections.sort;

/*
* LinkedList是个接口：有2个实现类
*    - ArrayList：变长数组---随机访问--改，查
*    - LinkList：双链表---增，删
*
* */
public class Container {
    public static void main(String[] args) {
        /*LinkedList<Object> list = new LinkedList<>();
        //下标从1开始的
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);//[1, 2, 3]
        //获取列表的长度
        System.out.println(list.size());//3
        //判断是否为空
        System.out.println(list.isEmpty()); //false
        //获取指定位置的元素
        System.out.println(list.get(0));//1
        //把指定位置上的元素的值更改
        list.set(1,9);
        System.out.println(list);//[1, 9, 3]*/


        ArrayList<Object> array = new ArrayList<>();
        array.add(4);
        array.add(7);
        array.add(5);
        System.out.println(array);//[4, 7, 5]
        array.remove(0);
        System.out.println(array);//[7, 5]
        array.clear();//清空
        System.out.println(array);//[]


    }
}
