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
		cli.prompt("Enter input file name: ");
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
		int[] freqArray=count.freqArray();
		int[] sortedFreqArray = MergeSort.sort(freqArray, 0, freqArray.length-1);
		cli.display('\n'+"Sorted frequency array: ");
		cli.display(Arrays.toString(sortedFreqArray)+'\n');
		
		int index = BinarySearch.search(sortedFreqArray, key);
		
		if (index!=-1) {
			System.out.println("Search key '"+key+"' FOUND."+'\n');
			System.out.println("Search key '"+key+"' is at index "+index+".");
		}
		else {System.out.println("Search key '"+key+"' NOT FOUND.");}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchCLI app = new SearchCLI();
		app.run();
	}

}
