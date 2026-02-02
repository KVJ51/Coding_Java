import java.util.Scanner;
public class RightPascalNumTri{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int row,star;
        for( row=1;row <= num; row++){
            for( star=1;star <= row;star++){
                System.out.print(star+" ");
            }
        System.out.println();
        }
        for( row=num-1;row>=1;row--){
            for( star =1;star<= row;star++){
                System.out.print(star+" ");
            }
        System.out.println();
        }
    }
}