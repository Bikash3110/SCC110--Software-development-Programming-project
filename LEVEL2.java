import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;

public class LEVEL2 implements ActionListener
{
	private  JFrame a = new JFrame();	    
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private	JPanel p3 = new JPanel();
	private	JPanel p4 = new JPanel();
	private	JPanel p5 = new JPanel();
		
	private	JButton b1 = new JButton("SCORE :");
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
	private ImageIcon plank1 = new ImageIcon("plank1.jpg");
	private ImageIcon plank2 = new ImageIcon("plank2.jpg");
	private ImageIcon stump1 = new ImageIcon("stump1.jpg");
	private ImageIcon stump2 = new ImageIcon("stump2.jpg");
	private ImageIcon stump3 = new ImageIcon("stump3.jpg");
	private ImageIcon stump1m = new ImageIcon("stump1_man.jpg");
	private ImageIcon stump2m = new ImageIcon("stump2_man.jpg");
	private ImageIcon stump3m = new ImageIcon("stump3_man.jpg");
	private int count = 1;
	private int splank = 1;
	private int lplank = 0;
	private int score = 0;
	private int level = 2;
		
	public LEVEL2()
	{
		int i,j;
		BorderLayout l = new BorderLayout();                                           // setting BorderLayout
		p1.setLayout(l);
		
		rfile r = new rfile(level);                                                    // calling read file 
	    JTextField t2 = new JTextField(Integer.toString(r.best2()));                   // getting the best score from the file.txt that stores the score value
		t2.setEditable(false);
		
		GridLayout grid = new GridLayout(1,4);
		p2.setLayout(grid);
		p1.add(p2,l.NORTH);
		p2.add(b1);                                                                    // adding elements in North panels
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
				{
					if(j==4)
					{
					  c[0][4] = new JButton(stump3);                                   // Creates JButton and add ActionListener to the interactive JButton of LEVEL2
				      c[0][4].setBorder(null);
					  c[0][4].addActionListener(this);
				      p3.add(c[0][4]);                                                   
					}
					else
					c[0][j] = new JButton(bank2);
				    c[0][j].setBorder(null);
				    p3.add(c[0][j]);
				}
				else
				  if(i==1 && j==4)
				{
					c[1][4] = new JButton(water1);
				    c[1][4].setBorder(null);
					c[1][4].addActionListener(this);
				    p3.add(c[1][4]);
				}
				else
                  if(i==1 && j==5)
				{
					c[1][5] = new JButton(water3);
				    c[1][5].setBorder(null);
				    p3.add(c[1][5]);
				}
				else					
				  if(i==2 && j==4)
				{
					c[2][4] = new JButton(stump1);
				    c[2][4].setBorder(null);
					c[2][4].addActionListener(this);
				    p3.add(c[2][4]);
				}
				else
				if(i==2 && j==6)
				{
					c[2][6] = new JButton(stump1);
				    c[2][6].setBorder(null);
					c[2][6].addActionListener(this);
				    p3.add(c[2][6]);
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
					c[2][3] = new JButton(water1);
				    c[2][3].setBorder(null);
					c[2][3].addActionListener(this);
				    p3.add(c[2][3]);
				}
				else
		        if(i==2 && j==2)
				{
					c[2][2] = new JButton(stump1);
				    c[2][2].setBorder(null);
					c[2][2].addActionListener(this);
				    p3.add(c[2][2]);
				}
				else
				if(i==3 && j==2)
				{
					c[3][2] = new JButton(water1);
				    c[3][2].setBorder(null);
					c[3][2].addActionListener(this);
				    p3.add(c[3][2]);
				}
				else
				if(i==4 && j==2)
				{
					c[4][2] = new JButton(water1);
				    c[4][2].setBorder(null);
					c[4][2].addActionListener(this);
				    p3.add(c[4][2]);
				}
				else
				if(i==5 && j==2)
				{
					c[5][2] = new JButton(water1);
				    c[5][2].setBorder(null);
					c[5][2].addActionListener(this);
				    p3.add(c[5][2]);
				}
				else
				if(i==3 && j==2)
				{
					c[3][2] = new JButton(water1);
				    c[3][2].setBorder(null);
					c[3][2].addActionListener(this);
				    p3.add(c[3][2]);
				}
				else
				if(i==4 && j==6)
				{
					c[4][6] = new JButton(water1);
				    c[4][6].setBorder(null);
					c[4][6].addActionListener(this);
				    p3.add(c[4][6]);
				}
				else
				if(i==5 && j==6)
				{
					c[5][6] = new JButton(water1);
				    c[5][6].setBorder(null);
					c[5][6].addActionListener(this);
				    p3.add(c[5][6]);
				}
				else
		        if(i==3 && j==6)
				{
					c[3][6] = new JButton(water1);
				    c[3][6].setBorder(null);
					c[3][6].addActionListener(this);
				    p3.add(c[3][6]);
				}
				else
			    if(i==6 && j==1)
				{
					c[6][1] = new JButton(water1);
				    c[6][1].setBorder(null);
					c[6][1].addActionListener(this);
				    p3.add(c[6][1]);
				}
				else
		        if(i==6 && j==0)
				{
					c[6][0] = new JButton(stump1);
				    c[6][0].setBorder(null);
					c[6][0].addActionListener(this);
				    p3.add(c[6][0]);
				}
				else
				if(i==6 && j==2)
				{
					c[6][2] = new JButton(stump1);
				    c[6][2].setBorder(null);
					c[6][2].addActionListener(this);
				    p3.add(c[6][2]);
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
				 if(i==6 && j==4)
				{
					c[6][4] = new JButton(water1);
				    c[6][4].setBorder(null);
					c[6][4].addActionListener(this);
				    p3.add(c[6][4]);
				}
				else
				 if(i==6 && j==5)
				{
					c[6][5] = new JButton(water1);
				    c[6][5].setBorder(null);
					c[6][5].addActionListener(this);
				    p3.add(c[6][5]);
				}
				else
				 if(i==6 && j==6)
				{
					c[6][6] = new JButton(stump1);
				    c[6][6].setBorder(null);
					c[6][6].addActionListener(this);
				    p3.add(c[6][6]);
				}
				else
				if(i==7 && j==0)
				{
					c[7][0] = new JButton(water1);
				    c[7][0].setBorder(null);
					c[7][0].addActionListener(this);
				    p3.add(c[7][0]);
				}
				else
				if(i==8 && j==0)
				{
					c[8][0] = new JButton(water1);
				    c[8][0].setBorder(null);
					c[8][0].addActionListener(this);
				    p3.add(c[8][0]);
				}
				else
				if(i==9 && j==0)
				{
					c[9][0] = new JButton(water1);
				    c[9][0].setBorder(null);
					c[9][0].addActionListener(this);
				    p3.add(c[9][0]);
				}
				else
		        if(i==10 && j==0)
				{
					c[10][0] = new JButton(stump1);
				    c[10][0].setBorder(null);
					c[10][0].addActionListener(this);
				    p3.add(c[10][0]);
				}
				else
				if(i==10 && j==1)
				{
					c[10][1] = new JButton(water1);
				    c[10][1].setBorder(null);
					c[10][1].addActionListener(this);
				    p3.add(c[10][1]);
				}
				else
				if(i==10 && j==2)
				{
					c[10][2] = new JButton(water1);
				    c[10][2].setBorder(null);
					c[10][2].addActionListener(this);
				    p3.add(c[10][2]);
				}
				else
				if(i==10 && j==3)
				{
					c[10][3] = new JButton(water1);
				    c[10][3].setBorder(null);
					c[10][3].addActionListener(this);
				    p3.add(c[10][3]);
				}
				else
				if(i==10 && j==4)
				{
					c[10][4] = new JButton(stump1);
				    c[10][4].setBorder(null);
					c[10][4].addActionListener(this);
				    p3.add(c[10][4]);
				}
				else
				if(i==8 && j==4)
				{
					c[8][4] = new JButton(water2);
				    c[8][4].setBorder(null);
				    p3.add(c[8][4]);
				}
				else	
			    if(i==11 && j==0)
				{
					c[11][0] = new JButton(water1);
				    c[11][0].setBorder(null);
					c[11][0].addActionListener(this);
				    p3.add(c[11][0]);
				}
				else
				if(i==11 && j==4)
				{
					c[11][4] = new JButton(plank2);
				    c[11][4].setBorder(null);
					c[11][4].addActionListener(this);
				    p3.add(c[11][4]);
				}
				else
				if(i==12)
				{
					if(j==4)
					{
				      c[12][4] = new JButton(stump2m);
				      c[12][4].setBorder(null);
					  c[12][4].addActionListener(this);
				      p3.add(c[12][4]);
					}
					else
					if(j==0)
					{
				      c[12][0] = new JButton(stump2);
				      c[12][0].setBorder(null);
					  c[12][0].addActionListener(this);
				      p3.add(c[12][0]);
					}
					else
					  c[12][j] = new JButton(bank1);
				      c[12][j].setBorder(null);
				      p3.add(c[12][j]);
				}
				else
			   	c[i][j] = new JButton(water1);
				c[i][j].setBorder(null);
				p3.add(c[i][j]);
			}
		}
		
		b3.addActionListener(this);
		b4.addActionListener(this);
		p1.add(p5,l.EAST);
		p4.setLayout(g);
		BorderLayout h = new BorderLayout();                                       //Adding elements to the JFRAME NORTH, EAST, CENTER Panels
		p5.setLayout(h);
		p5.add(b3,h.NORTH);
		p5.add(p4,h.CENTER);
		p5.add(b4,h.SOUTH);
		
		for(i=0;i<13;i++)
		{
			for(j=0;j<5;j++)
			{
				
			   	b[i][j] = new JButton(water1);
				b[i][j].setBorder(null);                                          // creating JButton for the display of carry plank in the panel
				p4.add(b[i][j]);
			    
			}
		} 

         b[6][1].setIcon(plank1);                                                  // player carrys 1 long plank in the start of LEVEL2
	     b[6][2].setIcon(plank1);
	     b[6][3].setIcon(plank1);	
		 
		a.setContentPane(p1);
     	a.setTitle("FRAME");                                
		a.setSize(450,500);
		a.setLocationRelativeTo(null);                                            // JFrame appears in center of screen
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
			 
             if(e.getSource() == c[10][3] || e.getSource() == c[10][2] || e.getSource() == c[10][1] )
			 {
				 if(c[10][1].getIcon() == plank1 && (c[10][4].getIcon() == stump1m || c[10][0].getIcon() == stump1m) && count == 0 && lplank == 1)
				 {
	    		   c[10][3].setIcon(water1);  
                   c[10][2].setIcon(water1);                                // pick up long plank bottom
                   c[10][1].setIcon(water1);	
                   count++;
				   lplank--;
                   b[6][1].setIcon(plank1);
				   b[6][2].setIcon(plank1);
				   b[6][3].setIcon(plank1);	
                   b[5][2].setIcon(water1);				   
				   b[4][2].setIcon(water1);
				 }
                 else
                  if(c[10][1].getIcon() == water1 && count == 1 && lplank == 0 && (c[10][4].getIcon() == stump1m || c[10][0].getIcon() == stump1m))
				 {                                                         //put down long plank bottom
	    		   c[10][3].setIcon(plank1);  
                   c[10][2].setIcon(plank1);
                   c[10][1].setIcon(plank1);
                   count--;
				   lplank++;
                   b[5][2].setIcon(water1);
				   b[6][2].setIcon(water1);
				   b[4][2].setIcon(water1);	
                   b[6][3].setIcon(water1);
				   b[6][1].setIcon(water1);				   
				 }				 
			 }	

             if(e.getSource() == c[11][4])
			 {
				 if(c[11][4].getIcon() == plank2 && (c[12][4].getIcon() == stump2m || c[10][4].getIcon() == stump1m) && count == 0 && splank == 1)
				 {
                   c[11][4].setIcon(water1);    				   // pick up small plank	bottom	  
				   count++;
				   splank--;
				   b[6][2].setIcon(plank2);
				 }
                 else
                  if(c[11][4].getIcon() == water1 && count == 1 && splank == 0 &&(c[12][4].getIcon() == stump2m || c[10][4].getIcon() == stump1m))
				 {                                 //put down small plank bottom
	    		   c[11][4].setIcon(plank2);  
				   count--;
				   splank++;
				    b[5][2].setIcon(water1);
				   b[6][2].setIcon(water1);
				   b[4][2].setIcon(water1);	
                   b[6][3].setIcon(water1);
				   b[6][1].setIcon(water1);
				 }				 
			 }	               
			 
			 if(e.getSource() == c[10][4] && c[11][4].getIcon() == plank2 && c[12][4].getIcon() == stump2m)
			 {
				 t.startTime();                                                               // timer starts with the first move of game i.e from here
			   c[12][4].setIcon(stump2);  
               c[10][4].setIcon(stump1m); 			   // change image
			 }
			 
			 if(e.getSource() == c[12][4] && c[10][4].getIcon() == stump1m && c[11][4].getIcon() == plank2)
			 {
			   c[12][4].setIcon(stump2m);  
               c[10][4].setIcon(stump1); 
			 }
			 
			 if(e.getSource() == c[10][0] && c[10][3].getIcon() == plank1 && c[10][4].getIcon() == stump1m)
			 {
			   c[10][4].setIcon(stump1);  
               c[10][0].setIcon(stump1m); 			   // change image
			 }
			 
			 if(e.getSource() == c[10][4] && c[10][0].getIcon() == stump1m && c[10][3].getIcon() == plank1)
			 {
			   c[10][4].setIcon(stump1m);  
               c[10][0].setIcon(stump1); 
			 }
			 
			  if(e.getSource() == c[12][0] && c[11][0].getIcon() == plank2 && c[10][0].getIcon() == stump1m)
			 {
			   c[12][0].setIcon(stump2m);  
               c[10][0].setIcon(stump1); 			   // change image
			 }
			 
			 if(e.getSource() == c[10][0] && c[12][0].getIcon() == stump2m && c[11][0].getIcon() == plank2)
			 {
			   c[12][0].setIcon(stump2);  
               c[10][0].setIcon(stump1m); 
			 }
			 
			 if(e.getSource() == c[11][0])
			 {
				 if(c[11][0].getIcon() == plank2 && (c[10][0].getIcon() == stump1m || c[12][0].getIcon() == stump2m) && count == 0 && splank ==1)
				 {
                   c[11][0].setIcon(water1);    				   // pick up small plank	bottom	  
				   count++;
				   splank--;
				   b[6][2].setIcon(plank2);
				 }
                 else
                  if(c[11][0].getIcon() == water1 && count == 1 && splank == 0 && (c[12][0].getIcon() == stump2m || c[10][0].getIcon() == stump1m))
				 {                                 //put down small plank bottom
	    		   c[11][0].setIcon(plank2);  
				   count--;
				   splank++;
				   b[5][2].setIcon(water1);
				   b[6][2].setIcon(water1);
				   b[4][2].setIcon(water1);	
                   b[6][3].setIcon(water1);
				   b[6][1].setIcon(water1);
				 }				 
			 }
			 
			 if(e.getSource() == c[6][0] && c[7][0].getIcon() == plank2 && c[10][0].getIcon() == stump1m)
			 {
			   c[10][0].setIcon(stump1);  
               c[6][0].setIcon(stump1m); 			   // change image
			 }
			 
			 if(e.getSource() == c[10][0] && c[6][0].getIcon() == stump1m && c[7][0].getIcon() == plank2)
			 {
			  c[10][0].setIcon(stump1m);  
               c[6][0].setIcon(stump1); 
			 }
			 
			  if(e.getSource() == c[9][0] || e.getSource() == c[8][0] || e.getSource() == c[7][0] )
			 {
				 if(c[7][0].getIcon() == plank2 && (c[10][0].getIcon() == stump1m || c[6][0].getIcon() == stump1m) && count == 0 && lplank ==1)
				 {
	    		   c[9][0].setIcon(water1);  
                   c[8][0].setIcon(water1);                                // pick up long plank bottom
                   c[7][0].setIcon(water1);	
                   count++;
				   lplank--;
                   b[5][2].setIcon(plank2);
				   b[6][2].setIcon(plank2);
				   b[4][2].setIcon(plank2);
                   b[6][3].setIcon(water1);
				   b[6][1].setIcon(water1);			   
				 }
                 else
                  if(c[7][0].getIcon() == water1 && count == 1 && lplank == 0 &&(c[6][0].getIcon() == stump1m || c[10][0].getIcon() == stump1m))
				 {                                 //put down long plank bottom
	    		   c[7][0].setIcon(plank2);  
                   c[8][0].setIcon(plank2);
                   c[9][0].setIcon(plank2);
                   count--;
				   lplank++;
                   b[5][2].setIcon(water1);
				   b[6][2].setIcon(water1);
				   b[4][2].setIcon(water1);	
                   b[6][3].setIcon(water1);
				   b[6][1].setIcon(water1);					   
				 }				 
			 }	
			 
			  if(e.getSource() == c[6][2] && c[6][1].getIcon() == plank1 && c[6][0].getIcon() == stump1m)
			 {
			   c[6][0].setIcon(stump1);  
               c[6][2].setIcon(stump1m); 			   // change image
			 }
			 
			 if(e.getSource() == c[6][0] && c[6][2].getIcon() == stump1m && c[6][1].getIcon() == plank1)
			 {
			  c[6][0].setIcon(stump1m);  
              c[6][2].setIcon(stump1); 
			 }

             if(e.getSource() == c[6][1])
			 {
				 if(c[6][1].getIcon() == plank1 && (c[6][0].getIcon() == stump1m || c[6][2].getIcon() == stump1m) && count == 0 && splank ==1 )
				 {
                   c[6][1].setIcon(water1);    				   // pick up small plan mid	  
				   count++;
				   splank--;
				   b[6][2].setIcon(plank1);
				 }
                 else
                  if(c[6][1].getIcon() == water1 && count == 1 && splank==0 &&(c[6][0].getIcon() == stump1m || c[6][2].getIcon() == stump1m))
				 {                                //put down small plank mid
	    		   c[6][1].setIcon(plank1);  
				   count--;
				   splank++;
				    b[5][2].setIcon(water1);
				   b[6][2].setIcon(water1);
				   b[4][2].setIcon(water1);	
                   b[6][3].setIcon(water1);
				   b[6][1].setIcon(water1);
				 }				 
			 }
            
			
			if(e.getSource() == c[2][2] && c[3][2].getIcon() == plank2 && c[6][2].getIcon() == stump1m)
			 {
			   c[6][2].setIcon(stump1);  
               c[2][2].setIcon(stump1m); 			   // change image
			 }
			 
			 if(e.getSource() == c[6][2] && c[2][2].getIcon() == stump1m && c[3][2].getIcon() == plank2)
			 {
			   c[6][2].setIcon(stump1m);  
               c[2][2].setIcon(stump1); 
			 }
			 
			  if(e.getSource() == c[5][2] || e.getSource() == c[4][2] || e.getSource() == c[3][2] )
			 {
				 if(c[3][2].getIcon() == plank2 && (c[6][2].getIcon() == stump1m || c[2][2].getIcon() == stump1m) && count == 0 && lplank == 1 )
				 {
	    		   c[3][2].setIcon(water1);  
                   c[4][2].setIcon(water1);                                // pick up long plank bottom
                   c[5][2].setIcon(water1);	
                   count++;
				   lplank--;
                   b[5][2].setIcon(plank2);
				   b[6][2].setIcon(plank2);
				   b[4][2].setIcon(plank2);
                   b[6][3].setIcon(water1);
				   b[6][1].setIcon(water1);			   
				 }
                 else
                  if(c[3][2].getIcon() == water1 && count == 1 && lplank ==0 && (c[6][2].getIcon() == stump1m || c[2][2].getIcon() == stump1m))
				 {                                 //put down long plank bottom
	    		   c[3][2].setIcon(plank2);  
                   c[4][2].setIcon(plank2);
                   c[5][2].setIcon(plank2);
                   count--;
				   lplank++;
                   b[5][2].setIcon(water1);
				   b[6][2].setIcon(water1);
				   b[4][2].setIcon(water1);	
                   b[6][3].setIcon(water1);
				   b[6][1].setIcon(water1);					   
				 }				 
			 }	
			
			 if(e.getSource() == c[2][4] && c[2][3].getIcon() == plank1 && c[2][2].getIcon() == stump1m)
			 {
			   c[2][2].setIcon(stump1);  
               c[2][4].setIcon(stump1m); 			   // change image
			 }
			 
			 if(e.getSource() == c[2][2] && c[2][4].getIcon() == stump1m && c[2][3].getIcon() == plank1)
			 {
			  c[2][2].setIcon(stump1m);  
              c[2][4].setIcon(stump1); 
			 }

             if(e.getSource() == c[2][3])
			 {
				 if(c[2][3].getIcon() == plank1 && splank == 1 && (c[2][2].getIcon() == stump1m || c[2][4].getIcon() == stump1m) && count == 0)
				 { 
                   c[2][3].setIcon(water1);    				   // pick up small plan mid upper  
				   count++;
				   splank--;
				   b[6][2].setIcon(plank1);
				 }
                 else
                  if(c[2][3].getIcon() == water1 && count == 1 && splank==0 && (c[2][2].getIcon() == stump1m || c[2][4].getIcon() == stump1m))
				 {                                //put down small plank mid upper
	    		   c[2][3].setIcon(plank1);  
				   count--;
				   splank++;
				   b[5][2].setIcon(water1);
				   b[6][2].setIcon(water1);
				   b[4][2].setIcon(water1);	
                   b[6][3].setIcon(water1);
				   b[6][1].setIcon(water1);
				 }				 
			 }
			
			  if(e.getSource() == c[2][6] && c[2][5].getIcon() == plank1 && c[2][4].getIcon() == stump1m)
			 {
			   c[2][4].setIcon(stump1);  
               c[2][6].setIcon(stump1m); 			   // change image
			 }
			 
			 if(e.getSource() == c[2][4] && c[2][6].getIcon() == stump1m && c[2][5].getIcon() == plank1)
			 {
			  c[2][4].setIcon(stump1m);  
              c[2][6].setIcon(stump1); 
			 }

             if(e.getSource() == c[2][5])
			 {
				 if(c[2][5].getIcon() == plank1 && (c[2][4].getIcon() == stump1m || c[2][6].getIcon() == stump1m) && count == 0 && splank ==1)
				 {
                   c[2][5].setIcon(water1);    				   // pick up small plan mid upper  
				   count++;
				   splank--;
				   b[6][2].setIcon(plank1);
				 }
                 else
                  if(c[2][5].getIcon() == water1 && count == 1 && splank == 0 && (c[2][6].getIcon() == stump1m || c[2][4].getIcon() == stump1m))
				 {                                //put down small plank mid upper
	    		   c[2][5].setIcon(plank1);  
				   count--;
				   splank++;
				    b[5][2].setIcon(water1);
				   b[6][2].setIcon(water1);
				   b[4][2].setIcon(water1);	
                   b[6][3].setIcon(water1);
				   b[6][1].setIcon(water1);
				 }				 
			 }
			
			if(e.getSource() == c[6][6] && c[6][3].getIcon() == plank1 && c[6][2].getIcon() == stump1m)
			 {
			   c[6][2].setIcon(stump1);  
               c[6][6].setIcon(stump1m); 			   // change image
			 }
			 
			 if(e.getSource() == c[6][2] && c[6][6].getIcon() == stump1m && c[6][3].getIcon() == plank1)
			 {
			   c[6][2].setIcon(stump1m);  
               c[6][6].setIcon(stump1); 
			 }
			 
			  if(e.getSource() == c[6][3] || e.getSource() == c[6][4] || e.getSource() == c[6][5] )
			 {
				 if(c[6][3].getIcon() == plank1 && (c[6][2].getIcon() == stump1m || c[6][6].getIcon() == stump1m) && count == 0 && lplank == 1)
				 {
	    		   c[6][3].setIcon(water1);  
                   c[6][4].setIcon(water1);                                // pick up long plank
                   c[6][5].setIcon(water1);	
                   count++;
				   lplank--;
                   b[5][2].setIcon(water1);
				   b[6][2].setIcon(plank1);
				   b[4][2].setIcon(water1);
                   b[6][3].setIcon(plank1);
				   b[6][1].setIcon(plank1);			   
				 }
                 else
                  if(c[6][3].getIcon() == water1 && count == 1 && lplank == 0 && (c[6][2].getIcon() == stump1m || c[6][6].getIcon() == stump1m))
				 {                                //put down long plank
	    		   c[6][3].setIcon(plank1);  
                   c[6][4].setIcon(plank1);
                   c[6][5].setIcon(plank1);
                   count--;
				   lplank++;
                   b[5][2].setIcon(water1);
				   b[6][2].setIcon(water1);
				   b[4][2].setIcon(water1);	
                   b[6][3].setIcon(water1);
				   b[6][1].setIcon(water1);					   
				 }				 
			 }	
			
			if(e.getSource() == c[2][6] && c[3][6].getIcon() == plank2 && c[6][6].getIcon() == stump1m)
			 {
			   c[6][6].setIcon(stump1);  
               c[2][6].setIcon(stump1m); 			   // change image
			 }
			 
			 if(e.getSource() == c[6][6] && c[2][6].getIcon() == stump1m && c[3][6].getIcon() == plank2)
			 {
			   c[6][6].setIcon(stump1m);  
               c[2][6].setIcon(stump1); 
			 }
			 
			  if(e.getSource() == c[3][6] || e.getSource() == c[4][6] || e.getSource() == c[5][6] )
			 {
				 if(c[3][6].getIcon() == plank2 && (c[6][6].getIcon() == stump1m || c[2][6].getIcon() == stump1m) && count == 0 && lplank == 1)
				 {
	    		   c[3][6].setIcon(water1);  
                   c[4][6].setIcon(water1);                                // pick up long plank bottom mid
                   c[5][6].setIcon(water1);	
                   count++;
				   lplank--;
                   b[5][2].setIcon(plank2);
				   b[6][2].setIcon(plank2);
				   b[4][2].setIcon(plank2);
                   b[6][3].setIcon(water1);
				   b[6][1].setIcon(water1);			   
				 }
                 else
                  if(c[3][6].getIcon() == water1 && lplank==0 && count == 1 && (c[6][6].getIcon() == stump1m || c[2][6].getIcon() == stump1m))
				 {                                //put down long plank bottom mid
	    		   c[3][6].setIcon(plank2);  
                   c[4][6].setIcon(plank2);
                   c[5][6].setIcon(plank2);
                   count--;
				   lplank++;
                   b[5][2].setIcon(water1);
				   b[6][2].setIcon(water1);
				   b[4][2].setIcon(water1);	
                   b[6][3].setIcon(water1);
				   b[6][1].setIcon(water1);					   
				 }				 
			 }	
  			 
			  if(e.getSource() == c[1][4])
			 {
				 if(c[1][4].getIcon() == plank2 && (c[2][4].getIcon() == stump1m || c[0][4].getIcon() == stump3m) && count == 0 && splank == 1 )
				 { 
                   c[1][4].setIcon(water1);    				   // pick up small plan upper  
				   count++;
				   splank--;
				   b[6][2].setIcon(plank2);
				 }
                 else
                  if(c[1][4].getIcon() == water1 && count == 1 && splank == 0 && (c[0][4].getIcon() == stump3m || c[2][4].getIcon() == stump1m))
				 {                                //put down small plank upper
	    		   c[1][4].setIcon(plank2);  
				   count--;
				   splank++;
				   b[5][2].setIcon(water1);
				   b[6][2].setIcon(water1);
				   b[4][2].setIcon(water1);	
                   b[6][3].setIcon(water1);
				   b[6][1].setIcon(water1);
				 }				 
			 }
			 
             if(e.getSource() == c[0][4] && c[1][4].getIcon() == plank2 && c[2][4].getIcon() == stump1m)
			 {
				t.endtime();                                                        // timer stops when player reaches other side
			   c[2][4].setIcon(stump1);  
               c[0][4].setIcon(stump3m); 			   // final 
			   score = t.getsec();                     // storing time passed in seconds as score  
			   info i = new info(score,level);         //  info class instance
			   file f = new file(score,level);         //   score stored in file by calling instance of file class    
			 }

              if(e.getSource() == b4)
			  {
				  a.dispose();                 // Closes the frame when clicked on QUIT 
			  }		  
			 
			   if(e.getSource() == b3)
			   {
				   a.dispose();                       // RESTART LEVEL2 
				   LEVEL2 l2 = new LEVEL2();
			   }
			 
	}
	
}