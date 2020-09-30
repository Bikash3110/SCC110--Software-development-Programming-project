import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class file{
	
	private static final String FILENAME ="C:\\Users\\BIKASH\\Documents\\SCC110\\score.txt";                     //file.txt address
	private static final String FILENAME2 ="C:\\Users\\BIKASH\\Documents\\SCC110\\score2.txt";
	
	public file(int score,int level)
	{
		
		if(level ==1)                                //when level == 1
		{
		try(FileWriter fw = new FileWriter(FILENAME,true)) // to append in a existing file
		{ 
		  try(BufferedWriter bw = new BufferedWriter(fw)){          // writes text to char output string 
		  String content = Integer.toString(score);                 // stores the score
		  String newline = "\n";                                    // new line char
		  bw.write(content);                                         // writes the mentioned string 
		  bw.write(newline);
		  }
		}
		catch(IOException e)
		{
			System.out.println("ERROR");                                         // if exception then throws error
		}
		}
		else
		if(level ==2)                                                               // similar to LEVEL1 but occurs when level == 2
		{
		try(FileWriter fw = new FileWriter(FILENAME2,true)) //append
		{
		  try(BufferedWriter bw = new BufferedWriter(fw)){
		  String content2 = Integer.toString(score);
		  String newline = "\n";
		  bw.write(content2);
		   bw.write(newline);
		  }
		}
		catch(IOException e)
		{
			System.out.println("ERROR");
		}
		}
	}
}