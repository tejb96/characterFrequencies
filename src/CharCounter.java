import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class CharCounter {
	private int[] charCounts = new int[65536];
	private String line;
	private int numberOfChars=0;
	
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
		reader.close();
	}
	
	public void printCount() {
		System.out.println('\n'+"List of all characters in the text:");
		for(int i=0;i<65536;i++) {
			if(charCounts[i]>0) {
				char c=(char) i;
				if(c==' ') {
					System.out.println("space"+" - "+charCounts[i]);
					numberOfChars++;
				}
				else {
					System.out.println(c+" - "+charCounts[i]);
					numberOfChars++;
				}
			}
		}
	}
	
	public int[] freqArray() {
		int j=0;
		int[] freqArr = new int[numberOfChars];
		for(int i=0;i<65536;i++) {
			if(charCounts[i]>0) {
				freqArr[j]=charCounts[i];
				j++;
			}
		}
		return freqArr;
	}
}
