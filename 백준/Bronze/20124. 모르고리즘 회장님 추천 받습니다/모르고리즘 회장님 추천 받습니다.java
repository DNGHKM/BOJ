import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int point = Integer.parseInt(st.nextToken());
            list.add(new Person(name, point));
        }
        list.sort((o1, o2) -> {
            if (o2.point == o1.point) {
                return o1.name.compareTo(o2.name);
            }
            return o2.point - o1.point;
        });
        System.out.println(list.get(0).name);
    }

    static class Person {
        String name;
        int point;

        public Person(String name, int point) {
            this.name = name;
            this.point = point;
        }
    }
}
