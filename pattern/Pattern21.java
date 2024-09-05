//Java program to print Sand-glass Alphabetic Pattern.
class Pattern21 {
    public static void main(String[] args) {
        //Reverse pyramid alphabetic pattern
        int a=65;
        for (int i=4; i>=1; i--){
            for (int k=4;k>i;k--){
                System.out.print(" ");
            }
            for (int j=0;j<=i-1;j++){
                System.out.print((char)+(j+a)+ " ");
            }
            System.out.println();
        }
        //Pyramid alphabetic pattern
        int b=65;
        for (int i=1;i<=4;i++){
            for (int k=4;k>i;k--){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                System.out.print(((char)(b+j))+" ");
            }
            System.out.println();
        }
    }
}
