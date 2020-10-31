import static java.lang.System.out;
public class Que4 {
	public static void sort(int[] arr){
		int one=0,two=0,zero=0;
		for(int i:arr){
			if(i==0) zero++;
			if(i==1) one++;
			if(i==2) two++;
		}
		int ind=0;
		while((zero--)!=0) arr[ind++]=0;
		while((one--)!=0) arr[ind++]=1;
		while((two--)!=0) arr[ind++]=2;
		
	}
	public static void main (String[] args) {
		int arr[]={1,0,1,1,0,2,1,2,2,0,1,2};
		sort(arr);
		for(int i:arr) out.println(i);
	}
}

