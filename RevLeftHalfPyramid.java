import java.util.Scanner;
public class RevLeftHalfPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++){
            for(k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
