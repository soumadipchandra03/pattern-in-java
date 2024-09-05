//Java program to print Pyramid Alphabetic Pattern.
class Pattern18 {
    public static void main(String[] args) {
        int a=65;
        for (int i=1;i<=4;i++){
            for (int k=4;k>i;k--){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                System.out.print(((char)(a+j))+" ");
            }
            System.out.println();
        }
    }
}
