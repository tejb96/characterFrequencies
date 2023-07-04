import java.util.Scanner;
/**
 * Enables reading from stdin using a Scanner and
 * writing to stdout using print/println
 * 
 * @author Tej
 */
public class InteractiveCLI {
	
	private Scanner reader;
	
	public InteractiveCLI() {
		reader=new Scanner(System.in);
	}
	
	/**
	 * Reads a line from stdin.
	 * 
	 * @return line as String from stdin
	 */
	public String getKeyboardString() {
		if(reader.hasNextLine()) {return reader.nextLine();}
		else {return "";}
	}
	
	/**
	 * Print string s as a prompt without a newline.
	 * @param s
	 */
	public void prompt(String s){ 
		System.out.print(s);
	}
	
	
	/**
	 * Print string s as a message with newline.
	 * @param s
	 */
	public void display(String s){ 
		System.out.println(s);
	}

}
