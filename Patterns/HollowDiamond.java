
import java.util.Scanner;
public class HollowDiamond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,s,x;
        for(i=(n-1)*-1;i<=(n-1);i++){
            if(i<0){
                x = -i;
            }else{
                x = i;
            }
            for(s=1;s<=x;s++){
                System.out.print(" ");
            }
            for(j=1;j<=2*(n-x)-1;j++){
                if(j==1 || j==2*(n-x)-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
