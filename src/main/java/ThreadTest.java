public class ThreadTest extends Thread{

    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程");
        }
    }


    public static void main(String[] args) {
        ThreadTest th = new ThreadTest();
        /*
        子线程和主线程一起执行
        *   我是主线程
            我是主线程
            我是主线程
            我在学习多线程
            我是主线程
            我是主线程
            * */
        th.start();  //线程开启不一定立即执行，由cpu调度执行

        /*
        * 如果是th.run()---就是先执行子线程，然后再执行主线程*/

        for (int i = 0; i < 1000; i++) {
            System.out.println("我是主线程");
        }
    }
}
