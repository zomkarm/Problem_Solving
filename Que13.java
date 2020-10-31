import static java.lang.System.out;
import java.util.Collections;
import java.util.ArrayList;

public class Que13 { 
	public static int[][] merge(int[][] arr){
		int len=0;
		ArrayList<Integer> li=new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				li.add(arr[i][j]);
			}
		}
		Collections.sort(li);
		for(int i=1;i<li.size();i++){
			if(li.get(i)<=li.get(i-1)){
				li.remove(li.get(i-1));
				li.remove(li.get(i-1));
				i-=2;
			}
		}
		int tmp=0;
		int arr2[][]=new int[li.size()/2][2];
		
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
				arr2[i][j]=li.get(tmp++);
			}
		}
		return arr2;
		
	} 
	/*
	vector<vector<int>> merge(vector<vector<int>>& a) {
         vector<vector<int>> ans; 
        // no intervals are given then return empty ans
        if(a.size()==0)
            return ans;
        // this is important step
        sort(a.begin(),a.end());
        
        //initialize start and end into s and e
        int s=a[0][0],e=a[0][1];  
        
        //update end only if interval starts before end of current iterval
        for(int i=1;i<a.size();i++)
        {
            //choose greedily maximum ending
            if(a[i][0]<=e)
                e=max(a[i][1],e);
            else
            {
                ans.push_back({s,e});
                
                //update s and e with current interval
                s=a[i][0];
                e=a[i][1];
            }
        }
        
        //this adds last interval 
        ans.push_back({s,e});
        return ans;
    }*/
	public static void main(String[] args) 
	{ 
		int arr[][]={{1,4},{0,4}};
		int a[][]=merge(arr);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				out.print(a[i][j]+" ");
			}
			out.println();
		}
	} 
} 
