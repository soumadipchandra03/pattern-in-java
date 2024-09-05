//Java Program to Print Right Alphabetic Triangle Pattern
class Pattern6 {
    public static void main(String[] args) {
        int num=4;
        int a=65;   //ASCII value of A is 65
        for(int i=1;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)(j+a) + " ");  //convet into character by using char()
            }
            System.out.println();
        }

    }
}