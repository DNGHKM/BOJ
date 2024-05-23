import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String todo = br.readLine();
            int len = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            String input = br.readLine();
            input = input.replaceAll("\\[", "");
            input = input.replaceAll("]", "");
            if (!input.isEmpty()) {
                String[] split = input.split(",");
                for (int j = 0; j < split.length; j++) {
                    list.add(Integer.parseInt(split[j]));
                }
            }
            boolean left = true;
            for (int j = 0; j < todo.length(); j++) {
                char doing = todo.charAt(j);
                if (doing == 'R') {
                    left = !left;
                } else {
                    if (list.isEmpty()) {
                        bw.write("error\n");
                        break;
                    }
                    if (!left) {
                        list.remove(list.size() - 1);
                    } else {
                        list.remove(0);
                    }
                }
                if (j == todo.length() - 1) {
                    bw.write("[");
                    if (!left) {
                        for (int k = list.size() - 1; k >= 0; k--) {
                            bw.write(list.get(k) + "");
                            if (k != 0) bw.write(",");
                        }
                    }else{
                        for (int k = 0; k < list.size(); k++) {
                            bw.write(list.get(k) + "");
                            if (k != list.size()-1) bw.write(",");
                        }
                    }
                    bw.write("]" + "\n");

                }
            }
        }
        bw.flush();
    }
}
