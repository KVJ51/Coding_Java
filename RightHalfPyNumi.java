import java.util.Scanner;
public class RightHalfPyNumi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int row=1;row <= num; row++){
            for(int star=1;star<=row;star++){
                System.out.print(row+" ");

            }
        System.out.println();
        }
    }
}
