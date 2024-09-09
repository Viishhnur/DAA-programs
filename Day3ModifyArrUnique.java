import java.util.Scanner;
public class Day3ModifyArrUnique {
    private static void modifyArr(int[] arr,int n){
        
        int num = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] == num){
                arr[i] = -1;
            }
            else{
                num = arr[i];
            }
        }
        
    }
    private static int countUnique(int[] arr,int n){
        
        // Now iterate again check for non - negative nums
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != -1){
                cnt++;
            }
        }
        return cnt;
    }
    
    // T.C:- O(2*N) ~ O(N)
    // S.C:- O(1)
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // close the resource
        sc.close();
        
        modifyArr(arr,n);
        System.out.print(countUnique(arr,n));
        
        
    }
}
        
    
        

        
       
