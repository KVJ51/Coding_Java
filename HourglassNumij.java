import java.util.Scanner;
public class HourglassNumij {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i,j;
        for(i=1;i<=n;i++){
            for( j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(i=1;i<n;i++){
            for(j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(j=n-i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
