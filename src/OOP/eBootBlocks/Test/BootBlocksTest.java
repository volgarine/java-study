package OOP.eBootBlocks.Test;

import OOP.eBootBlocks.Domain.BootBlocks;

public class BootBlocksTest {
    public static void main(String[] args) {
        BootBlocks bootBlocks = new BootBlocks();
        System.out.println("Example Boot Blocks: ");
        for (int bootBlock : bootBlocks.getExBootBlocks()) {
            System.out.printf(bootBlock + " ");
        }



    }
}
