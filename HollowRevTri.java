
import java.util.Scanner;
public class HollowRevTri {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i,j,s;
        for(i=1;i<=n;i++){
            for(s=1;s<=i-1;s++){
                System.out.print(" ");
            }
            for(j=1;j<=(n-i)*2+1;j++){
                if(i==1 || j==1 || j==(n-i)*2+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
