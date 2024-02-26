package Loop;

public class Loop3For1 {

    public static void main(String[] args) {

        // Example 1
        System.out.println("Example 1: print 1 to 5 ↓↓↓↓↓");
        for (int i = 1; i < 6; i++) {
            System.out.println("Loop " + i);
        }
        System.out.println("----------------------------------------------");

        // Example 2
        System.out.println("Example 2: print 10 to 20, 2 by 2 ↓↓↓↓↓");
        for (int a = 2; a <= 50; a++){
            if(a % 2 == 0) { // print even number
                System.out.println(a);
            }
        }
        System.out.println("----------------------------------------------");

        // Example 3
        System.out.println("Example 3: print countdown from 10 to zero ↓↓↓↓↓");

        for (int b = 10; b >= 0; b = b - 1){
            System.out.println(b);
        }

    }
}
