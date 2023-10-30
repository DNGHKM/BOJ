import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Person> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <n; i++) {
            StringTokenizer st =new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            list.add(new Person(w,h));
        }
        Iterator<Person> it = list.iterator();
        while(it.hasNext()){
            int count = 0;
            Person man = it.next();
            for (int i = 0; i <n; i++) {
                if(list.get(i).height>man.height&&list.get(i).weight>man.weight){
                    count++;
                }
            }
            man.rank = count+1;
        }

        for (Person person : list) {
            System.out.print(person.rank+" ");
        }
    }
}
class Person {
    int weight;
    int height;
    int rank;
    Person(int weight, int height){
        this.weight = weight;
        this.height = height;
    }
}