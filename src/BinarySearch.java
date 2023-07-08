
public class BinarySearch {
	public static int search(int[] arr,int key) {
		int low=0,mid,high=arr.length-1;
		while(low<=high) {
			mid = (low+high)/2;
			if(key<arr[mid]) {high=mid-1;}
			else if(arr[mid]<key) {low=mid+1;}
			else {return mid;}
		}
		return -1;
	}

}
