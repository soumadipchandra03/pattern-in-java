//Java program to print Right down Mirror Star Pattern.
import java.util.Scanner;
class Pattern22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num= sc.nextInt();
        for (int i=1; i<=num; i++){
            for (int k=1; k<i; k++){
                System.out.print(" ");
            }
            for (int j=num; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
