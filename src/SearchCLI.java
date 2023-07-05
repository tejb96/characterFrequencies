import java.io.IOException;
/**
 * 
 * @author Tej
 */
public class SearchCLI {
	private CharCounter count;
	private InteractiveCLI cli;
	
	public SearchCLI() {
		cli = new InteractiveCLI();
	}
	
	public void run() {		
		cli.prompt("Enter input file name: ");
		String filename = cli.getKeyboardString();
		
		try {
			count = new CharCounter(filename);
		}catch(IOException e) {
			cli.display(e.getMessage() + " - please try again.");
			return;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchCLI app = new SearchCLI();
		app.run();
	}

}
