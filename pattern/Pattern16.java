//Java program to print Sand-glass Star Pattern.
class Pattern16 {
    public static void main(String[] args) {
        //Reversed pyramid
        for(int i=1;i<=4;i++){          //i prints row
            for(int k=1;k<i;k++){           // k prints spaces
                System.out.print(" ");
            }
            for(int j=0;j<=4-i;j++){        //j prints column
                System.out.print("* ");
            }
            System.out.println();
        }
        //Pyramid star
        for(int i=1;i<=4;i++){
            for(int k=3;k>=i;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
