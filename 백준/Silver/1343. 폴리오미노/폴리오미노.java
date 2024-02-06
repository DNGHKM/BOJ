import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("\\.");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<arr.length; i++) {
            int length = arr[i].length();
            if(arr[i].length()%2==1){
                System.out.println(-1);
                return;
            }else{
                while(length>0) {
                    if (length >= 4) {
                        sb.append("AAAA");
                        length -= 4;
                    }else{
                        sb.append("BB");
                        length-=2;
                    }
                }
            }
            if(arr.length>1&&i<arr.length-1) {
                sb.append(".");
            }
        }
        if(arr.length==0) {
            for (int i = str.length() - 1; i >= 0; i--) {
                if (str.charAt(i) == '.') {
                    sb.append(".");
                } else {
                    break;
                }
            }
        }
        while(sb.length()<str.length()){
            sb.append(".");
        }
        System.out.println(sb);
    }
}