import java.util.Scanner;
public class BowNum {
    public static void p1(int num){
        int i,j,k;//
        for(i=1 ;i <=num;i++){
            for(j=1; j<= i ;j++){
                System.out.print(j+" ");
            }
        System.out.println();

        }
        for(i=1;i<=num;i++){
            for(k=1;k<=num-1;k++){
                System.out.print(" ");
            }
            
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        p1(num);
        sc.close();
    }
}
