import java.util.Scanner;
public class RightPascalTri{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int row,star;
        for( row=1;row <= num; row++){
            for( star=1;star <= row;star++){
                System.out.print("* ");
            }
        System.out.println();
        }
        for( row=num-1;row>=1;row--){
            for( star =1;star<= row;star++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}

/*n   row   star
  5    1     1
       2     2
       3     3
       4     2
       5     1 
 */
