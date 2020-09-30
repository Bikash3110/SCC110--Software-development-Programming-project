import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class time
{
	private int second = 0;
	Timer timer = new Timer();                            //Timer instance made  
	JLabel time = new JLabel("In Seconds") ;                         
	 
	public JLabel gettime()
	{  
       return(time);                                            // method return JLabel time value
	}	
	
	public int getsec()
	{
		return(second);                                       //method returns seconds passed value 
	}
	
	public void startTime()                                   // method  starts time 
	{
		timer.scheduleAtFixedRate(new TimerTask(){
			public void run()                                   //overriding Timertask() according to requirment 
		{
			second++;
			time.setText(Integer.toString(second));
			
		}
		},1000,1000);
	}
	
	public void endtime()
	{
		timer.cancel();                                     // method ends time
	}
	
}