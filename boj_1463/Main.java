import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int[] dp = new int[N+5];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i < N+1; i++) {
            int tmp = 987654321;
            if(i%3 == 0){
                tmp = Math.min(tmp, dp[i / 3]+1);
            }
            if (i%2 == 0){
                tmp = Math.min(tmp, dp[i / 2]+1);
            }
            tmp = Math.min(tmp, dp[i - 1] + 1);
            dp[i] = tmp;
        }

        System.out.println(dp[N]);

    }
}
