import java.io.FileInputStream;  
import java.io.FileNotFoundException;
import java.io.IOException;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fstream = new FileInputStream("Users/KarmaSherpa/Desktop/assignment1.txt"); 
		 
	       
	        String line;
	        SparseVector x1, x2;
	        String path = "project1.txt";
	    
	                input = new FileReader(path);
	                inFile = new BufferedReader(input);
	                while((line = inFile.readLine())!=null){
	                    x1 = new SparseVector(line);
	                    x2 = new SparseVector();

	                    //reads first line
	                    String[] numbers = line.split(" ");
	                    x1.addFromString(numbers);

	                    line = inFile.readLine();

	                    //reads second line
	                    numbers = line.split(" ");
	                    x2.addFromString(numbers);

	                    //reads third line
	                    line = inFile.readLine();

	                    x1.operation(line, x2);
	                }

	            } catch(Exception e){
	                System.out.println(e);
	            }

		
	}

}
