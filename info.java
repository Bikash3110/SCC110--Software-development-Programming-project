import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class info implements ActionListener
{
private JFrame a = new JFrame(); 
private JPanel p = new JPanel();                                                                         
private JPanel p2 = new JPanel();
private JButton NEXT = new JButton("NEXT LEVEL");                                                  //creating NEXT LEVEL JButton which takes to next level
private JButton QUIT = new JButton("QUIT");
time lol = new time();                                                                             // time class instance made 
	
public info(int score,int level)                    //constructor
{
BorderLayout lay = new BorderLayout();
p.setLayout(lay);

GridLayout g = new GridLayout(2,1);
p2.setLayout(g);

if(level ==2)
{                                                                                                                    
JTextField t3 = new JTextField("CONGRATS!!! YOU HAVE COMPLETED LAST LEVEL----> LEVEL:"+level);                   //JFRAME DISPLAYED WITH SCORE for LEVEL2
JTextField t4 = new JTextField( "YOUR SCORE: " + score);
p2.add(t3);
p2.add(t4);
p.add(p2,lay.CENTER);
}
else
{
JTextField t = new JTextField("CONGRATS!!! YOU HAVE COMPLETED LEVEL:"+level);
JTextField t2 = new JTextField( "YOUR SCORE: " + score);                                                          //JFRAME DISPLAYED WITH SCORE for LEVEL1
p2.add(t);
p2.add(t2);
p.add(p2,lay.CENTER);
}
NEXT.addActionListener(this);
QUIT.addActionListener(this);
p.add(NEXT,lay.NORTH);
p.add(QUIT,lay.SOUTH);

a.setLocationRelativeTo(null); //center
a.setContentPane(p); // Use panel on Window
a.setTitle("LEVEL INFO"); // Change window title
a.setSize(400,150); // Change window size
a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
a.setVisible(true); // Make it visible
}

public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == QUIT)
		{                                                                        // Action performed when JButtons clicked
			a.dispose();
		}
		
		if(e.getSource() == NEXT)
		{
			a.dispose();
		   LEVEL2 l2 = new LEVEL2();
		}
		
	}

}