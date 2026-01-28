import java.util.Scanner;
public class SquareHollow {
  /*  public static void sqholl(int num){
        int i,st;
   for(i=1;i<=num;i++){
            for(st=1;st<=num;st++){
                if(i==1||i==num||st==1||st==num){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sqholl(num);
     sc.close();
    }
    */
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i =0;i<=n;i++){
            for(j=0;j<=n;j++){
                if(j==0|| j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
