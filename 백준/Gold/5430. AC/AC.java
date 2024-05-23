import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String todo = br.readLine();
            int len = Integer.parseInt(br.readLine());
            int[] arr = new int[len];
            String input = br.readLine();
            input = input.replaceAll("\\[", "");
            input = input.replaceAll("]", "");
            if (!input.isEmpty()) {
                String[] split = input.split(",");
                for (int j = 0; j < split.length; j++) {
                    arr[j] = Integer.parseInt(split[j]);
                }
            }
            boolean left = true;
            int leftIdx = 0;
            int rightIdx = arr.length - 1;
            int arrayLen = rightIdx-leftIdx+1;
            for (int j = 0; j < todo.length(); j++) {
                char doing = todo.charAt(j);
                if (doing == 'R') {
                    left = !left;
                } else {
                    if (arrayLen<=0) {
                        bw.write("error\n");
                        break;
                    }
                    if (!left) {
                        rightIdx--;
                    } else {
                        leftIdx++;
                    }
                    arrayLen--;
                }
                if (j == todo.length() - 1) {
                    bw.write("[");
                    if (!left) {
                        for (int k = rightIdx; k >= leftIdx; k--) {
                            bw.write(arr[k] + "");
                            if (k != leftIdx) bw.write(",");
                        }
                    } else {
                        for (int k = leftIdx; k < rightIdx+1; k++) {
                            bw.write(arr[k] + "");
                            if (k != rightIdx) bw.write(",");
                        }
                    }
                    bw.write("]" + "\n");
                }
            }
        }
        bw.flush();
    }
}
