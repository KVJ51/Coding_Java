
import java.util.Scanner;
public class HollowLHourglass {
    public static void main(String[] args){
       /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,s;
        for(i=1;i<=n;i++){
            for(s=1;s<=i-1;s++){
                System.out.print(" ");
            }
            for(j=1;j<=(n-i)+1;j++){
                if(i==1 || j==1 || j==(n-i)+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
        for(i=1;i<n;i++){
            for(s=1;s<=n-i-1;s++){
                System.out.print(" ");
            }
            for(j=1;j<=i+1;j++){
                if(i==n-1||j==1||j==i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/
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
            int pat =(x+1);
            for(j=1;j<=pat;j++){
                if(i == (n-1) || i==(n-1)*-1 || j==1 || j==pat){
                   System.out.print("* "); 
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
