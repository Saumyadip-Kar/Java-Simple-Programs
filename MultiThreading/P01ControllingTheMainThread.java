/**
 * P01
 */
public class P01ControllingTheMainThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);//Thread[threadName,priority,threadGroup]
        System.out.println(t.getName()+"Thread Sleeping for 2s");
        try{
            Thread.sleep(1000);//This static way is prefered
            t.sleep(1000);//Not prefered
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(t.getName()+"Thread resumed");
    }
}