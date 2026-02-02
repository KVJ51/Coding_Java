import java.util.Scanner;

public class HollowTri {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,s;
        for(i=1;i<=n;i++){
            for(s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++){
                if(i==n || j==1 || j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
