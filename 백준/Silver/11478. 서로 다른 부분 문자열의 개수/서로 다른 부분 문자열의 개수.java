import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i <=input.length(); i++) {
            for (int j = i; j <=input.length(); j++) {
                String str = input.substring(i,j);
                hs.add(str);
            }
        }
        System.out.println(hs.size()-1);
    }
}