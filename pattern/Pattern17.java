//Java program to print K Shape Alphabetic Pattern.
class Pattern17 {
    public static void main(String[] args) {
        //Downward alphabetic
        int a=65;   //ASCII value of A is 65
        for(int i=4;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)(j+a) + " ");  //convet into character by using char()
            }
            System.out.println();
        }
        //Right alphabetic
        int b=65;   //ASCII value of A is 65
        for(int i=1;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)(j+b) + " ");  //convet into character by using char()
            }
            System.out.println();
        }
    }
}
