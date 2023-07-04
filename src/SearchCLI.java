import java.io.IOException;
/**
 * 
 * @author Tej
 */
public class SearchCLI {
	
	private InteractiveCLI cli;
	
	public SearchCLI() {
		cli = new InteractiveCLI();
	}
	
	public void run() {		
		cli.prompt("Enter input file name: ");
		String filename = cli.getKeyboardString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
