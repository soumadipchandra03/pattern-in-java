//Java program to print Descending Order Number Pattern.
import java.util.Scanner;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num= sc.nextInt();
        int sum=num;
        for (int i=0; i<num;i++){
            for (int j=0;j<=i;j++){
                System.out.print((sum-j)+" ");
            }
            System.out.println();

        }
    }
}
