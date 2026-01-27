import java.util.Scanner;
public class RightHalfPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int row=1;row <= num; row++){
            for(int star=1;star<=row;star++){
                System.out.print("* ");

            }
        System.out.println();
        }
    }
}
/*I used Scanner to take input from the user.
The outer for loop controls the number of rows (from 1 to num).
The inner for loop controls how many values are printed in each row.
After printing all values in one row, println() moves to the next line.

Instead of saying “prints the number of stars”, say:

“prints the number of elements in each row”*/