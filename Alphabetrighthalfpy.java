import java.util.Scanner;
public class Alphabetrighthalfpy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int col =0 ;
        char ch =(char)(col + 5);
        for(int row=1;row<=ch;row++){
            for(col = 1;col<=row;col++){
                System.out.print(col +" ");
            }
            System.out.println();
        }

    }

}