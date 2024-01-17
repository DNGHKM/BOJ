import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0&&b==0){
                System.out.println(sb);
                return;
            }
            int length = (int) Math.max(Math.log10(a)+1,Math.log10(b)+1);
            int count = 0;
            for (int i = 0; i < length; i++) {
                if(count==0){
                    if(a%10+b%10>9){
                        count++;
                    }
                }else{
                    if(a%10+b%10>8){
                        count++;
                    }
                }
                a/=10;
                b/=10;
            }
            sb.append(count+"\n");
        }
    }
}