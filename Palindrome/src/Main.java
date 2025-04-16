import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number");
        int num = sc.nextInt();
        int num_tep = num;
        if(num < 0)
            System.out.println("Wrong");
        else if (num > 0 && num < 10) {
            System.out.println("Wrong");
        }
        int result = 0;
        while(num_tep != 0){
            int i = num_tep % 10;
            num_tep  = num_tep / 10;
            result = result * 10 + i;
        }
        System.out.println(result);
        System.out.println(num == result);
    }
}