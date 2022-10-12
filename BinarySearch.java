import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" sorted array elements");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to be searched");
		int no = sc.nextInt();
		int low=0,high=n-1,mid=0;
		boolean found = false;
		while(low<=high) {
			mid = (low+high)/2;
			if(arr[mid]==no) {
				System.out.println(no+" found at "+(mid+1)+" position");
				found = true;
				break;
			}
			if(arr[mid]<no) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if(!found) {
			System.out.println(no+" not present in array");
		}
		sc.close();
	}

}
