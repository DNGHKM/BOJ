import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> dance = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            String man1 = st.nextToken();
            String man2 = st.nextToken();
            if(input.contains("ChongChong")){
                dance.add(man1);
                dance.add(man2);
            }
            if(dance.contains(man1)||dance.contains(man2)){
                dance.add(man1);
                dance.add(man2);
            }
        }
        System.out.println(dance.size());
    }
}