//Java program to Print Downward Triangle Star.
import java.util.Scanner;
class Pattern8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int num= sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=num;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}