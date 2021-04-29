import java.util.*;
import java.io.*;

class DigitalClock
{
	public static void  main(String [] args)
	{
		Clock c=new Clock();
		Thread t=new Thread();
		t.start();
		try{
			t.join();
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
class Clock implements Runnable
{
		public void run()
		{
			while(true)
			{
				Calendar c=Calendar.getInstance();
				int hh=c.get(Calendar.HOUR);
				int mm=c.get(Calendar.MINUTE);
				int ss=c.get(Calendar.SECOND);
				System.out.println("" + hh + ":" + mm + ":" +ss);
				System.out.println("dejfhcdjcfnsklfjief");
				try
				{
					Thread.sleep(1000);
					
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
		}
}