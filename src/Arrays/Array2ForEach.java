package Arrays;

public class Array2ForEach {
    public static void main(String[] args) {
        //EXAMPLE 1
        //3 ways to get started:
        int[] numbers = new int[3];
        int[] numbers2 = {1, 2, 3, 4, 5};
        int[] numbers3 = new int[]{5, 4, 3, 2, 1};

        System.out.println("Example 1:");
        // for with specific index
        for (int i = 0; i < numbers3.length; i++){
            System.out.println(numbers3[i]);
        }
        System.out.println();
        //EXAMPLE 2
        // another way to replace the FOR above with a local variable
        System.out.println("Example 2: another way to replace the FOR above - for (int num : numbers3)");
        for (int num : numbers3){
            System.out.println(num);
        }
    }
}