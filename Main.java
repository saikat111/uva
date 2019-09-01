import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        
        long a,b;
        
        while(num.hasNext()){
            a=num.nextLong();
            b=num.nextLong();
            if (a>b) {
                System.out.println(a-b);
            }
            else {
                System.out.println(b-a);
            }
        }
    }

}