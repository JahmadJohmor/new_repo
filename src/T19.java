import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class T19 {
	private static final String CMD = "C:\\Program Files\\Java\\jre1.8.0_201\\bin\\javaw.exe -Dfile.encoding=Cp1252 -classpath \"C:\\Users\\a253-18\\eclipse-workspace\\javajava\\bin\" T18";
			

	public static void main(String[] args) {
	
		try {
			
			Process process = Runtime.getRuntime().exec(CMD);
			
			
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			
			String s;
			System.out.println("Standard output: ");
			while ((s = stdInput.readLine()) != null) {
				System.out.println(s);
			}
			while ((s = stdError.readLine()) != null) {
				System.out.println(s);
			}
		}catch (Exception e) {
			e.printStackTrace(System.err);
		}

		
	}
}

