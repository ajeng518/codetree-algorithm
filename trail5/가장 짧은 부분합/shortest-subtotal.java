import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int sum = 0;
        int j=0;
        int min=n+2;

        for(int i=1; i<=n; i++){
            while(j+1 <= n && sum  < s){
                sum += arr[j+1];
                j++;
            }

            if(sum < s) break;
            
            min = Math.min(min, j-i+1);

            sum-=arr[i];
        }

        if(min==n+2) System.out.println(-1);
        else System.out.println(min);
    }
}