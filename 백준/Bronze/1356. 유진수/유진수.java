import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int point = 1;
        while(point<input.length()) {
            String left = input.substring(0, point);
            String right = input.substring(point);
            if (foo(left) == foo(right)) {
                System.out.println("YES");
                return;
            }
            point++;
        }
            System.out.println("NO");
        }

    private static int foo(String s) {
        int result = 1;
        for (int i = 0; i <s.length(); i++) {
            result*=s.charAt(i)-'0';
        }
        return  result;
    }
}