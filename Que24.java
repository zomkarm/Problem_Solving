import static java.lang.System.out;
import java.util.*;

public class Que24 {

	public static void solve(int[] arr,int k){
		int ma=Integer.MIN_VALUE;
		HashMap<Integer,Integer> mp=new HashMap<>();
		for (int c : arr) { 
            if (mp.containsKey(c)) { 
                mp.put(c, mp.get(c) + 1); 
            } 
            else { 
                mp.put(c, 1); 
            } 
        }
        for(Map.Entry entry : mp.entrySet()) { 
            if((Integer)entry.getValue()>ma) ma=(Integer)entry.getValue(); 
        }
        for(Map.Entry entry : mp.entrySet()){
			if((Integer)entry.getValue()>arr.length/k) out.println(entry.getKey() +" : "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		int arr[]={4, 5, 6, 7, 8, 4, 4 };
		int k=3;
		solve(arr,k);

		int arr2[] = { 4, 2, 2, 7 }; 
		int k1 = 3; 
		solve(arr2, k1); 		
	}
}
