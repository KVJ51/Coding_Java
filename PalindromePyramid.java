import java.util.Scanner;
public class PalindromePyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,s,j;
        for(i=1;i<=n;i++){
            for(s=1;s<=n-i;s++){
                System.out.print("  ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
    
}
