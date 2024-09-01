import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        boolean find = false;
        for (int i = 0; i < 5; i++) {
            if (sc.nextLine().contains("FBI")) {
                sb.append(i + 1 + " ");
                find = true;
            }
        }
        if(!find){
            System.out.println("HE GOT AWAY!");
        }
        System.out.println(sb);
    }
}