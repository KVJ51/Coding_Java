import java.util.Scanner;
public class GCD {
    public int HCF(int n1, int n2){
        int gcd = 1;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        GCD obj = new GCD();
        int result = obj.HCF(n1,n2);
        System.out.println("GCD of "+n1+" and "+n2+" is "+result);

    }
}
