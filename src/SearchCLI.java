import java.io.IOException;
import java.util.Arrays;
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
		System.out.println("Enter input file name: ");
		String filename = cli.getKeyboardString();
		
		try {
			count = new CharCounter(filename);
		}catch(IOException e) {
			cli.display(e.getMessage() + " - please try again.");
			return;
		}
		cli.prompt("Enter search key: ");
		int key = cli.getKeyboardInteger();
		
		count.printCount();
		int[] arr=count.freqArray();
		int[] newArr = MergeSort.sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(newArr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchCLI app = new SearchCLI();
		app.run();
	}

}
