//Java program to print Floyd's Triangle Pattern.
import java.util.Scanner;
class Pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num= sc.nextInt();
        int sum=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(sum +" ");
                sum++;
            }
            System.out.println();

        }
    }
}
