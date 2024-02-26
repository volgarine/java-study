package Arrays;

//Multidimensional Array is not used much because there is a solution like Collections and the closest thing is MAP

public class Array4MultiDimensionalInitialization {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.println(num + " ");
            }
        }
    }
}
