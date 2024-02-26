package OOP.eBootBlocks.Domain;

public class BootBlocks {
    private String name;
    private int[] example1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int[] example2;
    private int[] exBootBlocks;
    // EXAMPLE 3: HERE IS THE BOOT BLOCK or INSTANCE EXAMPLE - before constructor
    //  1) allocated memory space for the object
    //  2) each class attribute is created and initialized with default values
    //  3) the initialization block is executed
    //  4) constructor is executed
    {
        System.out.println("Inside the BOOT BLOCK!");
        exBootBlocks = new int[100];
        for (int i = 0; i < exBootBlocks.length; i++) {
            exBootBlocks[i] = i+1;

        }
    }
    public BootBlocks(String name){
        this.name = name;
    }
    public BootBlocks() {
        //EXAMPLE 1 ======================================
        System.out.println("Example 1:");
        for (int ex1 : this.example1) {
            System.out.print(ex1 + " ");
        }
        System.out.println();
        // EXAMPLE 2 ======================================
        System.out.println();
        System.out.println("Example 2:");
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
        this.exBootBlocks = exBootBlocks;
    }
}
