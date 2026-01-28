import java.util.Scanner;
public class DiamondM {
     static void diamond(int num){
        int x,i,sp,st;
        for(i=(num-1)*-1;i <= (num-1);i++){
            if(i<=0){
                x=-i;
            }else{
                x=i;

            }
            for(sp = 1;sp<=x;sp++){
                System.out.print("  ");
            }
            for(st=1;st <= (2*(num - x)-1);st++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        diamond(num); 
     sc.close();
    }
    
}
