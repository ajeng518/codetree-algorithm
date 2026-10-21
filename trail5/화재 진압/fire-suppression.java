import java.util.*;
public class Main {
    static int n,m;
    public static int[] fires;
    public static int[] stations;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        fires = new int[n+1];
        stations = new int[m+1];
        
        for (int i = 1; i <= n; i++)
            fires[i] = sc.nextInt();
        Arrays.sort(fires);

        for (int i = 1; i <= m; i++)
            stations[i] = sc.nextInt();
        Arrays.sort(stations);

        int j=1;
        int time=0;
        int max=0;

        for(int i=1; i<=n; i++){
            while(j+1 <= m && dist(i, j) > dist(i,j+1)){
                j++;
            }

            max=Math.max(max, dist(i,j));
        }

        System.out.println(max);
    }

    private static int dist(int x, int y){
        return Math.abs(fires[x]-stations[y]);
    }
}