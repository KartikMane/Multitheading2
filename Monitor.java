class Mydata
{
    synchronized void display(String s)
    {
            for(int i=0;i<s.length();i++)
            {
                System.out.println(s.charAt(i));
            }
    }
}

class Mythread1 extends Thread
{
    Mydata d;
    Mythread1(Mydata d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Hello World");
    }
}
class Mythread2 extends Thread
{
    Mydata d;
    Mythread2(Mydata a)
    {
        d=a;
    }
    public void run()
    {
        d.display("Hii");
    }
}
class Monitor
{
    public static void main(String[] args)
    {
        Mydata d= new Mydata();
        Mythread1 t1 = new Mythread1(d);
        Mythread2 t2 = new Mythread2(d);
        t1.start();
        t2.start();
    }
}
