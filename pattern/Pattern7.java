//Java Program to Print Alphabetic or character Pattern
class Pattern7 {
    public static void main(String[] args) {
        int num=4;
        int a=65;   //ASCII value of A is 65
        for(int i=1;i<=4;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)(a) + " ");  //convet into character by using char()
            }
            a++;
            System.out.println();
        }

    }
}