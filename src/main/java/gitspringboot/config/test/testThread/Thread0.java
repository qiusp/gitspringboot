package gitspringboot.config.test.testThread;

/**
 * 1、run和start是什么关系
 * 2、join:一个线程还可以等待另一个线程直到其运行结束。例如，main线程在启动t线程后，可以通过t.join()等待t线程结束后再继续运行：
 * join(long)的重载方法也可以指定一个等待时间，超过等待时间后就不再继续等待。
 * 3、线程状态：
 * New：新创建的线程，尚未执行；
 * Runnable：运行中的线程，正在执行run()方法的Java代码；
 * Blocked：运行中的线程，因为某些操作被阻塞而挂起；
 * Waiting：运行中的线程，因为某些操作在等待中；
 * Timed Waiting：运行中的线程，因为执行sleep()方法正在计时等待；
 * Terminated：线程已终止，因为run()方法执行完毕。
 * 
 */
public class Thread0 {
    public static void startThread() throws InterruptedException {
//        启动1
//        Thread t1 = new Thread(new MyRunnable());
//        t1.start();

//        Thread t2 = new MyThread();
//        t2.start();

//        Thread t3 = new Thread(()->{
//           System.out.println("start new thread! t3");
//        });
//        t3.start();

        System.out.println("main start...");
        Thread t4 = new Thread(){
            public void run(){
                System.out.println("start new thread! t4");
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e){}
                System.out.println("Thread End");
            }
        };
        System.out.println("main run...");

        t4.start();
        t4.join();
        try {
            Thread.sleep(20);
        }catch (InterruptedException e){}
        System.out.println("main end...");

    }



    class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("start new MyRunnable t1");
        }
    }

    class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("start new thread! t2");
        }
    }
}
