//Java program to print Left Pascal's Triangle Pattern.
class Pattern23 {
    public static void main(String[] args) {
       //Left star pyramid
        for(int i=1; i<=4;i++){  //i for row
            for(int k=3;k>=i;k--){ //k for space
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){  //j for column
                System.out.print("*");
            }
            System.out.println();
        }
        //Right down Mirror Star Pattern
        for (int i=1; i<=3; i++){
            for (int k=0; k<i; k++){
                System.out.print(" ");
            }
            for (int j=3; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
