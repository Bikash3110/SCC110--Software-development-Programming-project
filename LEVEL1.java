import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;

public class LEVEL1 implements ActionListener
{
	private final JFrame a;	    
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private	JPanel p3 = new JPanel();                              // creating JPanels 
	private	JPanel p4 = new JPanel();
	private	JPanel p5 = new JPanel();
			
	private	JButton b1 = new JButton("SCORE :");                       // creating JButtons
	private	JButton b2 = new JButton("BEST :");
	time t = new time();
	
	private	JButton b3 = new JButton("RESTART");                                  
	private	JButton b4 = new JButton("QUIT");
	private	JButton[][] c = new JButton[13][9];
	private JButton[][] b = new JButton[13][5];
    
	private ImageIcon bank2 = new ImageIcon("bank2.jpg");
	private ImageIcon bank1 = new ImageIcon("bank1.jpg");
	private ImageIcon water1 = new ImageIcon("water1.jpg");
	private ImageIcon water2 = new ImageIcon("water2.jpg");
	private ImageIcon water3 = new ImageIcon("water3.jpg");
	private ImageIcon plank1 = new ImageIcon("plank1.jpg");                                       //initializing images to the imageIcon 
	private ImageIcon plank2 = new ImageIcon("plank2.jpg");
	private ImageIcon stump1 = new ImageIcon("stump1.jpg");
	private ImageIcon stump2 = new ImageIcon("stump2.jpg");
	private ImageIcon stump3 = new ImageIcon("stump3.jpg");
	private ImageIcon stump1m = new ImageIcon("stump1_man.jpg");
	private ImageIcon stump2m = new ImageIcon("stump2_man.jpg");
	private ImageIcon stump3m = new ImageIcon("stump3_man.jpg");
	private int count = 0;                                                    //keep track of no of plank we can carry i.e 1
	private int score = 0;	                                                  // initial score of player
	private int level = 1;                                                    // to know which LEVEL we are in 
 		
	public LEVEL1()
	{                                                                         
		int i,j;                                                               
		a = new JFrame();                                                              
		BorderLayout l = new BorderLayout();                                 // setting border layout
		p1.setLayout(l);
		
		rfile r = new rfile(level);                                           // make an instance of readfile class
		JTextField t2 = new JTextField(Integer.toString(r.best()));           // display the best time taken to complete the level in the Jpanel North
		t2.setEditable(false);
		
		GridLayout grid = new GridLayout(1,4);                                        
		p2.setLayout(grid);
		p1.add(p2,l.NORTH);
		p2.add(b1);                                                             // adding the elements in the North Jpanel
		p2.add(t.time);
		p2.add(b2);
		p2.add(t2);
		
	    GridLayout g = new GridLayout(13,9);
		
		p3.setLayout(g);                                                        
		p1.add(p3,l.CENTER);                                                         
		
		for(i=0;i<13;i++)
		{
			for(j=0;j<9;j++)
			{   
		          if(i==0)
				{                                                                // creates JButton and add ACTIONLISTENER 
					if(j==5)                                                     
					{
					  c[0][5] = new JButton(stump3);
				      c[0][5].setBorder(null);
					  c[0][5].addActionListener(this);
				      p3.add(c[0][5]);
					}
					else
					c[0][j] = new JButton(bank2);
				    c[0][j].setBorder(null);
				    p3.add(c[0][j]);
				}
				else
				 if(i==1 && j==5)
				{
					c[1][5] = new JButton(water1);                                
				    c[1][5].setBorder(null);
					c[1][5].addActionListener(this);
				    p3.add(c[1][5]);
				}
				else
				 if(i==2 && j==5)
				{
					c[2][5] = new JButton(water1);
				    c[2][5].setBorder(null);
					c[2][5].addActionListener(this);
				    p3.add(c[2][5]);
				}
				else
				 if(i==2 && j==3)
				{
					c[2][3] = new JButton(water3);
				    c[2][3].setBorder(null);
				    p3.add(c[2][3]);
				}
				else
				 if(i==3 && j==5)
				{
					c[3][5] = new JButton(water1);
				    c[3][5].setBorder(null);
					c[3][5].addActionListener(this);
				    p3.add(c[3][5]);
				}
				else
		          if(i==4 && j==5)
				{
					c[4][5] = new JButton(stump1);
				    c[4][5].setBorder(null);
					c[4][5].addActionListener(this);
				    p3.add(c[4][5]);
				}
				else
				 if(i==4 && j==4)
				{
					c[4][4] = new JButton(water1);
				    c[4][4].setBorder(null);
					c[4][4].addActionListener(this);
				    p3.add(c[4][4]);
				}
				else	
		         if(i==4 && j==3)
				{
					c[4][3] = new JButton(stump1);
				    c[4][3].setBorder(null);
					c[4][3].addActionListener(this);
				    p3.add(c[4][3]);
				}
				else
				 if(i==5 && j==3)
				{
					c[5][3] = new JButton(water1);
				    c[5][3].setBorder(null);
					c[5][3].addActionListener(this);
				    p3.add(c[5][3]);
				}
				else
				  if(i==6 && j==3)
				{
					c[6][3] = new JButton(water1);
				    c[6][3].setBorder(null);
					c[6][3].addActionListener(this);
				    p3.add(c[6][3]);
				}
				else
			     if(i==7 && j==3)
				{
					c[7][3] = new JButton(water1);
				    c[7][3].setBorder(null);
					c[7][3].addActionListener(this);
				    p3.add(c[7][3]);
				}
				else
		        if(i==8 && j==3)
				{
					c[8][3] = new JButton(stump1);
				    c[8][3].setBorder(null);
					c[8][3].addActionListener(this);
				    p3.add(c[8][3]);
				}
				else
		        if(i==8 && j==2)
				{
					c[8][2] = new JButton(plank1);
				    c[8][2].setBorder(null);
					c[8][2].addActionListener(this);
				    p3.add(c[8][2]);
				}
				else
		        if(i==8 && j==1)
				{
					c[8][1] = new JButton(stump1);
				    c[8][1].setBorder(null);
					c[8][1].addActionListener(this);
				    p3.add(c[8][1]);
				}
				else
		        if(i==9 && j==1)
				{
					c[9][1] = new JButton(plank2);
				    c[9][1].setBorder(null);
					c[9][1].addActionListener(this);
				    p3.add(c[9][1]);
				}
				else
				if(i==10 && j==1)
				{
					c[10][1] = new JButton(plank2);
				    c[10][1].setBorder(null);
					c[10][1].addActionListener(this);
				    p3.add(c[10][1]);
				}
				else
				if(i==10 && j==3)
				{
					c[10][3] = new JButton(water2);
				    c[10][3].setBorder(null);
				    p3.add(c[10][3]);
				}
				else
				if(i==11 && j==1)
				{
					c[11][1] = new JButton(plank2);
				    c[11][1].setBorder(null);
					c[11][1].addActionListener(this);
				    p3.add(c[11][1]);
				}
				else
				if(i==12)
				{
					if(j==1)
					{
				      c[12][1] = new JButton(stump2m);
				      c[12][1].setBorder(null);
					  c[12][1].addActionListener(this);
				      p3.add(c[12][1]);
					}
					else
					  c[12][j] = new JButton(bank1);
				      c[12][j].setBorder(null);
				      p3.add(c[12][j]);
				}
				else
			   	c[i][j] = new JButton(water1);                                         // creating rest non interactive JButton as water  
				c[i][j].setBorder(null);
				p3.add(c[i][j]);
			}
		}
		
		b3.addActionListener(this);
		b4.addActionListener(this);
		p1.add(p5,l.EAST);                                                             // addind JButton QUIT and RESTART to east panel  
		p4.setLayout(g);
		BorderLayout h = new BorderLayout();
		p5.setLayout(h);
		p5.add(b3,h.NORTH);
		p5.add(p4,h.CENTER);
		p5.add(b4,h.SOUTH);
		
		for(i=0;i<13;i++)
		{
			for(j=0;j<5;j++)
			{
				
			   	b[i][j] = new JButton(water1);                                            // creating JButton and adding carry plank display to East panel 
				b[i][j].setBorder(null);
				p4.add(b[i][j]);
			    
			}
		} 

		a.setContentPane(p1);
     	a.setTitle("FRAME");
		a.setSize(450,500);                                                                      
		a.setLocationRelativeTo(null);             //center jframe
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setVisible(true);
	
	}
	
	public final JFrame main()
	{
		return a;
	}
	
	public void actionPerformed(ActionEvent e)
	{
			 
             if(e.getSource() == c[11][1] || e.getSource() == c[10][1] || e.getSource() == c[9][1] )
			 {
				 if(c[11][1].getIcon() == plank2 && (c[12][1].getIcon() == stump2m || c[8][1].getIcon() == stump1m) && count == 0)
				 {
	    		   c[11][1].setIcon(water1);  
                   c[10][1].setIcon(water1);                                // pick up long plank bottom
                   c[9][1].setIcon(water1);	
                   count++;
                   b[5][2].setIcon(plank2);
				   b[6][2].setIcon(plank2);
				   b[7][2].setIcon(plank2);				   
				 }
                 else
                  if(c[11][1].getIcon() == water1 && c[6][3].getIcon() == water1 && c[2][5].getIcon() == water1 && (c[12][1].getIcon() == stump2m || c[8][1].getIcon() == stump1m))
				 {                                //put down long plank bottom
	    		   c[11][1].setIcon(plank2);  
                   c[10][1].setIcon(plank2);
                   c[9][1].setIcon(plank2);
                   count--;
                   b[5][2].setIcon(water1);
				   b[6][2].setIcon(water1);
				   b[7][2].setIcon(water1);				   
				 }				 
			 }	

             if(e.getSource() == c[8][2])
			 {
				 if(c[8][2].getIcon() == plank1 && (c[8][1].getIcon() == stump1m || c[8][3].getIcon() == stump1m) && count == 0)
				 { 
                   c[8][2].setIcon(water1);    				   // pick up small plank	bottom	  
				   count++;
				   b[6][2].setIcon(plank1);
				 }
                 else
                  if(c[8][2].getIcon() == water1 && c[4][4].getIcon() == water1 && (c[8][1].getIcon() == stump1m || c[8][3].getIcon() == stump1m))
				 {                                 //put down small plank bottom
	    		   c[8][2].setIcon(plank1);  
				   count--;
				   b[6][2].setIcon(water1);
				 }				 
			 }	               
			 
			 if(e.getSource() == c[8][1] && c[9][1].getIcon() == plank2 && c[8][3].getIcon() == stump1)
			 {
			   t.startTime();                                                                //timer starts with the 1st step of game
			   c[12][1].setIcon(stump2);  
               c[8][1].setIcon(stump1m); 			   // change image
			 }
			 
			 if(e.getSource() == c[12][1] && c[8][1].getIcon() == stump1m && c[9][1].getIcon() == plank2)
			 {
			   c[12][1].setIcon(stump2m);  
               c[8][1].setIcon(stump1); 
			 }
			 
			 if(e.getSource() == c[8][3] && c[8][1].getIcon() == stump1m && c[8][2].getIcon() == plank1)    //getIcon() meathod
			 {
			   c[8][3].setIcon(stump1m);  
               c[8][1].setIcon(stump1); 
			 }
			 
			 if(e.getSource() == c[8][1] && c[8][3].getIcon() == stump1m && c[8][2].getIcon() == plank1)    //getIcon() meathod
			 {
			   c[8][3].setIcon(stump1);  
               c[8][1].setIcon(stump1m); 
			 }
	
            if(e.getSource() == c[7][3] || e.getSource() == c[6][3] || e.getSource() == c[5][3])
			 {
				 if(c[6][3].getIcon() == plank2 && (c[8][3].getIcon() == stump1m || c[4][3].getIcon() == stump1m) && count == 0)
				 {
	    		   c[7][3].setIcon(water1);  
                   c[6][3].setIcon(water1);                                // pick up long plank middle
                   c[5][3].setIcon(water1);		  
				   count++;
				   b[5][2].setIcon(plank2);
				   b[6][2].setIcon(plank2);
				   b[7][2].setIcon(plank2);
				 }
                 else
                  if(c[6][3].getIcon() == water1 && c[10][1].getIcon() == water1 && c[2][5].getIcon() == water1 && (c[8][3].getIcon() == stump1m || c[4][3].getIcon() == stump1m))
				 {                                //put down long plank middle
	    		   c[7][3].setIcon(plank2);  
                   c[6][3].setIcon(plank2);
                   c[5][3].setIcon(plank2);		  
				   count--;
				   b[5][2].setIcon(water1);
				   b[6][2].setIcon(water1);
				   b[7][2].setIcon(water1);
				 }		
			 }
			 
			if(e.getSource() == c[3][5] || e.getSource() == c[2][5] || e.getSource() == c[1][5])
			 {
				 if(c[2][5].getIcon() == plank2 && count == 0 )
				 {
	    		   c[3][5].setIcon(water1);  
                   c[2][5].setIcon(water1);                                // pick up long plank top
                   c[1][5].setIcon(water1);		  
				   count++;
				   b[5][2].setIcon(plank2);
				   b[6][2].setIcon(plank2);
				   b[7][2].setIcon(plank2);
				 }
                 else
                  if(c[2][5].getIcon() == water1 && c[10][1].getIcon() == water1 && c[6][3].getIcon() == water1 && (c[4][5].getIcon() == stump1m || c[0][5].getIcon() == stump3m))
				 {                                 //put down long plank top
	    		   c[3][5].setIcon(plank2);  
                   c[2][5].setIcon(plank2);
                   c[1][5].setIcon(plank2);		  
				   count--;
				   b[5][2].setIcon(water1);
				   b[6][2].setIcon(water1);
				   b[7][2].setIcon(water1);
				 }			 
			 }	
			 
			  if(e.getSource() == c[4][4])
			 {
				 if(c[4][4].getIcon() == plank1 && (c[4][3].getIcon() == stump1m || c[4][5].getIcon() == stump1m) && count == 0)
				 { 
                   c[4][4].setIcon(water1);                                // pick up small plank top  
				   count++;
				   b[6][2].setIcon(plank1);
				 }
                 else
                  if(c[4][4].getIcon() == water1 && c[8][2].getIcon() == water1 && (c[4][3].getIcon() == stump1m || c[4][5].getIcon() == stump1m))
				 {                                //put down small plank top
	    		   c[4][4].setIcon(plank1); 
                   count--;				   
				   b[6][2].setIcon(water1);
				 }				 
			 }	
          
              if(e.getSource() == c[4][3] && c[6][3].getIcon() == plank2 && c[8][3].getIcon() == stump1m)
			 {
			   c[8][3].setIcon(stump1);  
               c[4][3].setIcon(stump1m); 			   // change image
			 }		

             if(e.getSource() == c[8][3] && c[6][3].getIcon() == plank2 && c[4][3].getIcon() == stump1m)
			 {
			   c[4][3].setIcon(stump1);  
               c[8][3].setIcon(stump1m); 			   // change image
			 }					

             if(e.getSource() == c[4][5] && c[4][4].getIcon() == plank1 && c[4][3].getIcon() == stump1m)
			 {
			   c[4][3].setIcon(stump1);  
               c[4][5].setIcon(stump1m); 			   // change image
			 }		

             if(e.getSource() == c[4][3] && c[4][4].getIcon() == plank1 && c[4][5].getIcon() == stump1m)
			 {
			   c[4][3].setIcon(stump1m);  
               c[4][5].setIcon(stump1); 			   // change image
			 }		

             if(e.getSource() == c[0][5] && c[2][5].getIcon() == plank2 && c[4][5].getIcon() == stump1m)
			 {
			   t.endtime();                                // Timer stops when player reaches other side
			   c[4][5].setIcon(stump1);  
               c[0][5].setIcon(stump3m); 				   // final ---. here LEVEL1 is completed 
			   score = t.getsec();
			   info i = new info(score,level);             // info class instance is made 
			   file f = new file(score,level);             // score is stored by calling file
			 }

              if(e.getSource() == b4)
			  {
				  a.dispose();                 // Closes the frame when clicked on QUIT 
			  }		  
			 
			   if(e.getSource() == b3)
			   {                                        
				   a.dispose();                         //Restart         
				   LEVEL1 l1 = new LEVEL1();
			   }
			 
			 if(c[0][5].getIcon()== stump3m)
			 {
				  a.dispose();                           //dispose JFrame when game completed 
			 }
			 
	}
}