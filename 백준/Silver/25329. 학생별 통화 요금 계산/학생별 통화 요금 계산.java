import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] timeString = st.nextToken().split(":");
            String student = st.nextToken();
            if (!map.containsKey(student)) {
                map.put(student, Integer.parseInt(timeString[0]) * 60 +
                        Integer.parseInt(timeString[1]));
                continue;
            }
            map.put(student, map.get(student)
                    + Integer.parseInt(timeString[0]) * 60 + Integer.parseInt(timeString[1]));
        }
        List<Student> list = new ArrayList<>();
        for (String s : map.keySet()) {
            Student student = new Student();
            student.name = s;
            student.fee = calculateFee(map.get(s));
            list.add(student);
        }
        list.sort((o1, o2) -> {
            if (o1.fee != o2.fee) {
                return o2.fee - o1.fee;
            }
            return o1.name.compareTo(o2.name);
        });
        for (Student student : list) {
            sb.append(student.name + " " + student.fee + "\n");
        }
        System.out.println(sb);
    }

    private static int calculateFee(Integer minute) {
        if(minute<=100){
            return 10;
        }
        minute-=100;
        return minute % 50 == 0 ? minute / 50 * 3 + 10 : (minute / 50 + 1) * 3 + 10;
    }

    private static class Student {
        String name;
        int fee;
    }
}
