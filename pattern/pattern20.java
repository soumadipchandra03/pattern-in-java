//Java program to print Right Pascal's Alphabetic Triangle.
class pattern20 {
    public static void main(String[] args) {
        //Right Alphabetic Triangle Pattern
        int a=65;   //ASCII value of A is 65
        for(int i=1;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)(j+a) + " ");  //convet into character by using char()
            }
            System.out.println();
        }
        //Downward alphabetic pattern
        int b=65;   //ASCII value of A is 65
        for(int i=3;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)(j+b) + " ");  //convet into character by using char()
            }
            System.out.println();
        }
    }
}
