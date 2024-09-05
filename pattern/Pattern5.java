//Java program to print Left Triangle using Numbers Pattern.
import java.util.Scanner;
class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num= sc.nextInt();
        for (int i=1; i<=num;num--){
            for(int j=1;j<=num;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
