import java.util.Scanner;
class count_digit{

    public int no_of_digit(int n){
        int count = 0;
        while(n>0){
            count += 1;
            n /= 10;

        }
        return count;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        count_digit obj = new count_digit();
        int digit = obj.no_of_digit(n);
        System.out.println(digit);


    }
}