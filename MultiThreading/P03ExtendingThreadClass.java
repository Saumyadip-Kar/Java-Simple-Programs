/**
 * P03ExtendingThreadClass
 */
public class P03ExtendingThreadClass {
    public static void main(String[] args) {
        G0G1G2 g = new G0G1G2();
        g.x=0;
    }
}
class Thread2 extends Thread{
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

    Thread2(int n,int sec, String name){
       super(name);
        index+=1;
        cur_index=index;
        this.iter=n;
        this.sleep_time=sec;
        this.name=name;
    }
}


