import java.util.Scanner;
public class ReverseRightHalfPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       /// for(int row=num;row >= 1; row--){
        ///    for(int star=1;star<=row;star++){
        //        System.out.print("* ");

        //    }
       // System.out.println();
       /// }
       for(int i=1;i<=num;i++){
        for(int j=1;j<=num-i+1;j++){
            System.out.print("* ");
        }
        System.out.println();
       }
    }
}
