package test;
import java.io.*;


public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInputStream file= new FileInputStream("C:\\projects\\doc.txt");
				FileOutputStream result = new FileOutputStream("C:\\projects\\result.txt")){
			
			String c = "Lorem ipsum";
			byte [] z = file.readAllBytes();
			byte [] str = c.getBytes();
			
			
			result.write(z, 0, z.length);
			result.write(str);
			
			System.out.println("Done!");
			try {
				file.close();
				result.close();
			}catch(Exception err) {
				err.getMessage();
				
			}
			
			
		}
		catch(Exception ex) {
			ex.getMessage();
			System.out.println("Smtn Happened!" + ex);
		}

	}

}
