import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class rfile{

	private static final String FILENAME ="C:\\Users\\BIKASH\\Documents\\SCC110\\score.txt";                             // both file.txt address 
	private static final String FILENAME2 ="C:\\Users\\BIKASH\\Documents\\SCC110\\score2.txt";
	private int store;                                                                  
	private int store2;
	private int best = 100;                                    //both levels initial best score set to 100
	private int best2 = 100;
	
	public rfile(int level) {

	   if(level==1)                                                       // when LEVEL1
	   {                                                                                             
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {                  // reads char

			String line;
			while ((line = br.readLine()) != null) {                                           // reads each line
    				System.out.println(line);
                 store = Integer.parseInt(line);                                                  // stores score
				 if(store<=best)                                                                  // if the stored score better then best then replaces best score 
				 {
					best = store; 
				 }
			}

		} 
		catch (IOException e) {
			System.out.println("ERROR");                                                    // when exception caught throws error
		}
		System.out.println(best);
	   }
	   else
		  if(level==2)                                                                           //similar to LEVEL1 but works when Level == 2
	   {
		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME2))) {

			String line2;
			while ((line2 = br.readLine()) != null) {
				System.out.println(line2);
				store2 = Integer.parseInt(line2);
				 if(store2<=best2)
				 {
					best2 = store2; 
				 }
			}
		} 
		catch (IOException e) {
			System.out.println("ERROR");
		}
	   }
	}
	
	public int best()
	{
		return(best);
	}
	
	public int best2()
	{
		return(best2);
	}

}