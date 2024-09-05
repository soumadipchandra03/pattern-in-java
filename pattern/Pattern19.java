//Java program to print Reversed Pyramid Alphabetic Pattern.
import java.util.Scanner;
class Pattern19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num= sc.nextInt();
        int a=65;
        for (int i=num; i>=1; i--){
            for (int k=num;k>i;k--){
                System.out.print(" ");
            }
            for (int j=0;j<=i-1;j++){
                System.out.print((char)+(j+a)+ " ");
            }
            System.out.println();
        }
    }
}
