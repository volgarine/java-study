package Arrays;

public class Array3MultiDimensional {
    /**
     * A multidimensional array is an array of arrays.
     * Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.
     * To create a two-dimensional array, add each array within its own set of curly braces:
     * int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
     */

    public static void main(String[] args) {
        // months: 1, 2, 3, 4, 5
        //days: 30, 28, 31, 30, 30

       //EXAMPLE 1
        System.out.println("Example 1 - Simple");
        int[][] days = new int[3][3]; //
        days[0][0] = 23;
        days[0][1] = 12;
        days[0][2] = 26;

        days[1][0] = 28;
        days[1][1] = 02;
        days[1][2] = 22;

        days[2][0] = 1;
        days[2][1] = 2;
        days[2][2] = 3;

        for (int i = 0; i < days.length; i++){
            for (int j = 0; j < days[0].length; j++){
                System.out.println(days[i][j]);
            }
        }
        System.out.println("-------------------------------------");
        //EXAMPLE 1
        System.out.println("Example 2 - The Best");

        for (int [] arrayBase: days){
            for (int number: arrayBase){
                System.out.println(number);
            }
        }


    }
}
