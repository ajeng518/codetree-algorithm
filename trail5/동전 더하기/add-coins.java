import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        // Please write your code here.

        int sum=0;
        int cnt=0;

        for(int i=n-1; i>=0 ;i--){
            while(sum+coins[i]<=k){
                sum+=coins[i];
                cnt++;
            }

            
        }

        System.out.println(cnt);
    }
}