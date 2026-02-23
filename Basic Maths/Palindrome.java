import java.util.Scanner;
public class Palindrome {
    public int pali(int temp){
        int rev = 0;
        while(temp != 0){
            int digit = temp% 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        return rev;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        Palindrome obj = new Palindrome();
        int digit = obj.pali(n);

        if(digit == n){
            System.out.println("Palindrome");

        }else{
            System.out.println("Not palindrome");
        }


    }
}
