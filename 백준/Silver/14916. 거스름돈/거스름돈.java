import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int five = n/5;
        int two=0;
        while(five>=0) {
            if ((n - five*5) % 2 == 0) {
                two = (n - five*5) / 2;
                break;
            } else {
                five--;
                if(five<0){
                    break;
                }
                two = (n - five*5) / 2;
            }
        }
        int count = five+two;
        if(count>0){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }
    }
}