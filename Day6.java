import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis =null;
		try {
			fis = new FileInputStream("readme.txt");//to find file and to open file
			System.out.println("File Found");
			
			
			int data = fis.read();
			while(data != -1) {
				System.out.print((char)data);//it gives the ascii value of the data so we have to type cast it
				data=fis.read();
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		finally 
		{
			try {
				fis.close();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
