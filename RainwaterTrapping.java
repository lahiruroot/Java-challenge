package stack;

public class RainwaterTrapping {

	public static void main(String[] args) {
		int arr[] = {3,0,0,2,0,4};
		int len = arr.length;
		
		int mxl[] = new int[len];
		mxl[0] = arr[0];
		
		for(int i = 1; i < len; i++ ) {
			mxl[i] = Math.max(arr[i],mxl[i-1]);
		}
		
		int mxr[] = new int[len];
		mxr[len-1] = arr[len-1];
		for(int i = len-2; i >= 0; i--) {
			mxr[i] = Math.max(mxr[i+1], arr[i]);
		}
		
		int water[] = new int[len];
		for(int i = 0; i < len; i++) {
			water[i] = Math.min(mxr[i],mxl[i])-arr[i];
		}
		
		int sum = 0; 
		for(int i = 0; i < len; i++ ) {
			sum+=water[i];
		}
		System.out.println(sum);
	}

}
