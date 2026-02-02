import java.util.Scanner;
public class RightHalfPyNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int row=1;row <= num; row++){
            for(int star=1;star<=row;star++){
                System.out.print(star+" ");

            }
        System.out.println();
        }
    }
}
