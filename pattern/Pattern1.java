//Java program to print Right Triangle Star Pattern.
import java.util.Scanner;
class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row= sc.nextInt();
        for(int i=1;i<=row;i++){   // i for row
            System.out.print("*");
            for (int j=1;j<=i-1;j++){   // j for column
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}

