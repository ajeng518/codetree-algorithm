import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        
        String a =" "+br.readLine();
        String b =" "+br.readLine();
        int n = a.length()-1;
        int m = b.length()-1;

        String[][] dp = new String[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]="";
            }
        }

        if(a.charAt(1) == b.charAt(1)){
            dp[1][1]+=a.charAt(1);
        }

        for(int i=2; i<=n; i++){
            if(a.charAt(i) == b.charAt(1)){
                dp[i][1]+=a.charAt(i);
            }else dp[i][1]=dp[i-1][1];
        }

        for(int j=2; j<=m; j++){
            if(a.charAt(1) == b.charAt(j)){
                dp[1][j]+=a.charAt(1);
            }else dp[1][j]=dp[1][j-1];
        }

        for(int i=2; i<=n; i++){
            for(int j=2; j<=m; j++){
                if(a.charAt(i) == b.charAt(j)){
                    dp[i][j]=dp[i-1][j-1];
                    dp[i][j]+=a.charAt(i);
                }else{
                    int left =dp[i-1][j].length();
                    int right = dp[i][j-1].length();

                    if(left <= right){
                        dp[i][j]=dp[i-1][j];
                        dp[i][j]+=a.charAt(i);
                    }else{
                        dp[i][j]=dp[i][j-1];
                        dp[i][j]+=a.charAt(i);
                    }
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}