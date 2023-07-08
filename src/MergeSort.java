
public class MergeSort {
	private static void merge(int[] a, int f, int m, int l) {
		int nl = m - f +1;
		int nr =l-m;
		int L[]=new int[nl];
		int R[]=new int[nr];
		for(int i=0;i<nl;i++) {L[i]=a[f+i];} 
		for(int j=0;j<nr;j++) {R[j]=a[m+1+j];}
		int i=0,j=0;
		int k=f;
		while(i<nl&&j<nr) {
			if(L[i]<=R[j]) {
				a[k]=L[i];
				i++;
			}
			else {
				a[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<nl) {
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<nr) {
			a[k]=R[j];
			j++;
			k++;
		}
	}
	
	public static int[] sort(int[] a, int first, int last) {
		if(first<last) {
			int mid = (first + last)/2;
			sort(a, first, mid);
			sort(a, mid+1, last);
			merge(a, first, mid, last);
		}
		return a;
	}
	
	
	
}
