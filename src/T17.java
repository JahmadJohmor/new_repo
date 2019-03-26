import java.io.*;

public class T17 {

	public static void main(String[] args) {
	 
		
        String fileName = "C:\\Users\\a253-18\\Desktop\\yeet.txt";

        
        String line = null;

        try {
            
            FileReader fileReader = 
                new FileReader(fileName);

            
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

          
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            
        }
		}
	}

