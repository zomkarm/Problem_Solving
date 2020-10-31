import static java.lang.System.out;
import java.util.HashMap;

public class Que17 { 
	//Method 1
	//Time = O(N^2)
	public static int pairCount1(int[] arr,int k) {
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==k) count++;
			}
		}
		return count;
    }
    
    public static int pairCount2(int[] arr,int k) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int diff=k-arr[i];
            Integer x=map.get(diff);
            if(x!=null){
                count+=x;
            }
           Integer y= map.get(arr[i]);
           if(y!=null){
             map.put(arr[i],y+1);
           } 
           else{
                 map.put(arr[i],1);
           }
        }
        return count;
    }
	public static void main(String[] args) 
	{ 
		int arr[]={1,1,1,1};
		int k=2;
		out.println(pairCount2(arr,k));
	} 
}
