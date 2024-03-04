import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int cal = 0;
        while(true){
            String input = sc.next();
            if(input.equals("=")){
                break;
            }
            switch (input){
                case "+" : cal = 0;
                    break;
                case "-" : cal = 1;
                    break;
                case "*" : cal = 2;
                    break;
                case "/" : cal = 3;
                    break;
                default:
                    int num = Integer.parseInt(input);
                    switch (cal){
                        case 0 : ans+=num;
                            break;
                        case 1 : ans-=num;
                            break;
                        case 2 : ans*=num;
                            break;
                        case 3 : ans/=num;
                            break;
                }
            }
        }
        System.out.print(ans);
    }
}