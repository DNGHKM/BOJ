import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char[][] arr = new char[s.length() / n][n];
        int col = 0;
        int row = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[col][row] = c;
            if (col % 2 == 0) {
                row++;
            } else {
                row--;
            }
            if (row == n) {
                col++;
                row = n - 1;
            } else if (row == -1) {
                col++;
                row = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);
    }
}
