import java.util.Scanner;
public class BowPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i,s,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(s=1;s<=(n-i)*2;s++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            for(s=1;s<=2*i-2;s++){
                System.out.print(" ");
            }
            for(j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
