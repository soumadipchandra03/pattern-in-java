//Java program to print Reversed Pyramid Star.
import java.util.Scanner;
class Pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num= sc.nextInt();
        for(int i=1;i<=num;i++){          //i prints row
            for(int k=1;k<i;k++){           // k prints spaces
                System.out.print(" ");
            }
                for(int j=0;j<=num-i;j++){        //j prints column
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
