import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class CharCounter {
	private int[] charCounts = new int[65536];
	private String line, word;
	
	public CharCounter(String file) throws FileNotFoundException {
		File text = new File(file);
		Scanner reader =new Scanner(text);
		StringTokenizer token;
		
		while(reader.hasNext()) {
			line = reader.nextLine();
			token = new StringTokenizer(line);
			while(token.hasMoreTokens()) {
				word=token.nextToken();				
				System.out.println(word);
				
			}
		}
	}
}
