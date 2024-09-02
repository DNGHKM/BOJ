import java.io.*;
import java.time.LocalDate;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            if(day ==0) break;
            LocalDate date = LocalDate.of(year, month, day);
            LocalDate end = LocalDate.of(year, 1, 1);
            sb.append(date.getDayOfYear() - end.getDayOfYear() + 1+"\n");
        }
        System.out.println(sb);
    }
}