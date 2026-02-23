import java.util.Scanner;
public class armstrong_no{
    public int Armstrong(int n){
        int l = String.valueOf(n).length();
        int sum = 0;
        int temp = n;
        while(n != 0){
            int ldigit = n% 10;
            sum += Math.pow(ldigit,l); 
            n /= 10;
        }
        return sum;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        armstrong_no obj = new armstrong_no();
        int result=obj.Armstrong(n);
        System.out.println("Armstrong number is "+result);
    }
}

//