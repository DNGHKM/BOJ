import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> value = new HashMap<>();
        value.put("black",0);
        value.put("brown",1);
        value.put("red",2);
        value.put("orange",3);
        value.put("yellow",4);
        value.put("green",5);
        value.put("blue",6);
        value.put("violet",7);
        value.put("grey",8);
        value.put("white",9);
        long result = (long) ((value.get(br.readLine())*10+value.get(br.readLine()))*Math.pow(10,value.get(br.readLine())));
        System.out.println(result);
    }
}