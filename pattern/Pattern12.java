//Java program to print Right Pascal's Triangle Pattern.
class Pattern12 {
    public static void main(String[] args) {
        //Right Triangle Star Pattern
        for(int i=1;i<=4;i++){   // i for row
            System.out.print("*");
            for (int j=1;j<=i-1;j++){   // j for column
                System.out.print(" *");
            }
            System.out.println();
        }
        //Downward Triangle Star
        for(int i=1;i<=3;i++){
            for(int j=3;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
