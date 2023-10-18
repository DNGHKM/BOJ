import java.io.*;
import java.util.HashMap;

public class Main {//10808번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i <26; i++) {
            map.put((char)(97+i),0);
        }
        for (int i = 0; i <input.length(); i++) {
            char index = input.charAt(i);
            if(map.get(index)==0){
                map.put(input.charAt(i),1);
            } else {
                int tmp=map.get(index);
                tmp++;
                map.put(input.charAt(i),tmp);
            }
        }
        for (int i = 0; i <map.size(); i++) {
            bw.write(map.get((char)(97+i))+" ");
        }
        bw.flush();
    }
}