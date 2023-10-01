import java.util.* ;
import java.io.*; 
public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int start=0,mid=0,end=n-1;
        while(mid<=end){
            if(arr.get(mid)==0){
                int temp=arr.get(start);
                arr.set(start, arr.get(mid));
                arr.set(mid, temp);
                start++;
                mid++;
            }
            else if(arr.get(mid)==1){
                mid++;
            }
            else{
                int temp=arr.get(end);
                arr.set(end, arr.get(mid));
                arr.set(mid, temp);
                end--;
            }
        }
    }
}
