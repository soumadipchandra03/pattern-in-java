//Java program to print Diamond Shape Pattern.
class Pattern11 {
    public static void main(String[] args) {
        //Pyramid Star Pattern
        for(int i=1;i<=4;i++){          // i for row
            for(int k=3;k>=i;k--){      //k for space print
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){      // j for column
                System.out.print("* ");
            }
            System.out.println();
        }
        //Reversed Pyramid Star
        for(int i=1;i<=3;i++){          //i prints row
            for(int k=1;k<=i;k++){           // k prints spaces
                System.out.print(" ");
            }
            for(int j=0;j<=3-i;j++){        //j prints column
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
