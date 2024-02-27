package Variables;

/***
 *  <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html"> <b>Java Doc: Primitive Data Types<b/></>
 *
 */
public class PrimitivesTypes {
    public static void main(String[] args) {

        //Primitive Types
        // Data type / Size / Range of values that can be stored / Default value

        byte xByte; // 1 byte / -128 to 127 / 0
        short xShort; // 2 bytes / -32768 to 32767 / 0
        int xInt; // 4 bytes / -2,147,483,648 to 2,147,483,647 / 0
        long xLong; // 8 bytes / -9,223,372,036,854,775,808 to 9223372036854750000 / 0
        float xFloat; // 4 bytes / 3.4e-038 to 3.4e+038 / 0,0f
        double xDouble; // 1.7e-308 to 1.7e+038 / 0.0d
        boolean xBoolean; // 1 bit / true or false
        char xChar; // 2 bytes / - / \u0000

        // In Java, you need to format double and float like this
        xFloat = 2500.0F;
        xDouble = 5850.55D;
        System.out.println("Float: " + xFloat);
        System.out.println("Double: " + xDouble);
    }
}
