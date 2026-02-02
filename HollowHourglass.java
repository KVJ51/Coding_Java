
import java.util.Scanner;
public class HollowHourglass {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,x,s;
        for(i=(n-1)*-1;i<=(n-1);i++){
            if(i<0){
                x = -i;
            }else{
                x = i;
            }
            for(s=1;s<=(n-1)-x;s++){
                System.out.print(" ");
            }
            int pat =2 * (x+1) - 1;
            for(j=1;j<=pat;j++){
                if(i == (n-1) || i==(n-1)*-1 || j==1 || j==pat){
                   System.out.print("*"); 
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
