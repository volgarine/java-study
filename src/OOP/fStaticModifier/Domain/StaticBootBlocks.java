package OOP.fStaticModifier.Domain;

public class StaticBootBlocks {
    private String name;
    private int[] example1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int[] example2;
    private static int[] exBootBlocks;
    // EXAMPLE 3: HERE IS THE BOOT BLOCK or INSTANCE EXAMPLE - before constructor
    //  1) allocated memory space for the object
    //  2) each class attribute is created and initialized with default values
    //  3) the initialization block is executed
    //  4) constructor is executed
    static {
        System.out.println();
        System.out.println("Inside the BOOT BLOCK!");
        exBootBlocks = new int[100];
        for (int i = 0; i < exBootBlocks.length; i++) {
            exBootBlocks[i] = i+1;

        }
    }
    public StaticBootBlocks(String name){
        this.name = name;
    }
    public StaticBootBlocks() {
        //EXAMPLE 1:  private int[] example1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println();
        System.out.println("Example 1:  private int[] example1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};");
        for (int ex1 : this.example1) {
            System.out.print(ex1 + " ");
        }
        System.out.println();
        // EXAMPLE 2: private int[] example2;
        System.out.println();
        System.out.println("Example 2: private int[] example2;");
        example2 = new int[100];
        for (int i = 0; i < example2.length; i++) {
            example2[i] = i + 1;
        }
            for (int ex2 : this.example2) {
                System.out.print(ex2 + " ");
            }
        System.out.println();
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getExample1() {
        return example1;
    }

    public void setExample1(int[] example1) {
        this.example1 = example1;
    }

    public int[] getExample2() {
        return example2;
    }

    public void setExample2(int[] example2) {
        this.example2 = example2;
    }

    public int[] getExBootBlocks() {
        return exBootBlocks;
    }

    public void setExBootBlocks(int[] exBootBlocks) {
        StaticBootBlocks.exBootBlocks = exBootBlocks;
    }
}
