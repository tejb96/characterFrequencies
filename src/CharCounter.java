import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class CharCounter {
	private int[] charCounts = new int[65536];
	private String line;
	
	public CharCounter(String file) throws FileNotFoundException {
		File text = new File(file);
		Scanner reader =new Scanner(text);
		
		while(reader.hasNext()) {
			line = reader.nextLine();
			char[] arr=line.toCharArray();
			for(int i=0;i<arr.length;i++) {
				int character = arr[i];
				charCounts[character]+=1;				
			}	
		}
		
	}
	
	public void printCount() {
		for(int i=0;i<65536;i++) {
			if(charCounts[i]>0) {
				char c=(char) i;
				System.out.println(c+" - "+charCounts[i]);
			}
		}
	}
}
