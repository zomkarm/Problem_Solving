import static java.lang.System.out;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Collections;
public class Que3 {
	public static int kthmax(int arr[],int k){
		Arrays.sort(arr);
		return arr[arr.length-k];
	}

	public static int kthmin(int arr[],int k){
		Arrays.sort(arr);
		return arr[k-1];
	}
	public static int kthminUsingMinHeap(int arr[],int k){
		PriorityQueue<Integer> pr=new PriorityQueue<>(Collections.reverseOrder());
		for(int i:arr){
			pr.add(i);
			if(pr.size()==k+1){
				pr.poll();
			}
		}
		return pr.peek();
	}
	public static int kthmaxUsingMinHeap(int arr[],int k){
		PriorityQueue<Integer> pr=new PriorityQueue<>();
		for(int i:arr){
			pr.add(i);
			if(pr.size()==k+1){
				pr.poll();
			}
		}
		return pr.peek();
	}

	public static void main (String[] args) {
		int arr[]={6,3,1,2,7,5,4};
		out.println(kthmaxUsingMinHeap(arr,3));
	}
}

