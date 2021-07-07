/**
 * Creating Basic Threads by Implementing Runnable Interface
 * P02ImplementingRunnable
 */
public class P02ImplementingRunnable {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1(10,2,"Sample-Thread-1");
        Thread1 t2 = new Thread1(22, 1,"Sample-Thread-2");
        t1.t.start();
        t2.t.start();
    }
}

/**
 * 
 *Thread1
 */
class Thread1 implements Runnable{
    Thread t;
    static int index=0;
    int cur_index=0;
    int iter=0;
    int sleep_time=0;//in sec
    String name="";

    public void run(){
        System.out.println(name+index+" Started");
        try{
            for(int i=1;i<=iter;i++){
            Thread.sleep(sleep_time*1000);
            System.out.println(i*sleep_time+" Seconds Passed from "+name);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
            System.out.println(name+" Stopped");
        }
        System.out.println(name+" Stopped");
    }

    Thread1(int n,int sec, String name){
        t=new Thread(this,name);
        index+=1;
        cur_index=index;
        this.iter=n;
        this.sleep_time=sec;
        this.name=name;
    }
}