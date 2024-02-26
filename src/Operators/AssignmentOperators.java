package Operators;

public class AssignmentOperators {

    public static void main(String[] args) {
        // = | += | -= | *= | /= | %= | &= | |= | ^= | >>= | <<=

        //Increment (++)
        int inc1 = 20;
        int inc2 = 20;
        System.out.println("increment after 20++ = " + inc1++);
        System.out.println("increment before ++20 = " + ++inc2);

        //Decrement (--)
        int dec1 = 10;
        int dec2 = 10;
        System.out.println("Var dec1 = " + dec1 + " | Var dec2 = " + dec2);
        System.out.println("decrement after 10-- = " + dec1--);
        System.out.println("decrement before --10 = " + --dec2);

        // reduce the code
        System.out.println();
        System.out.println("Reduce the code");
        int reduceCode = 50;
        System.out.println(reduceCode+"+=2 --> " + (reduceCode += 2));
        System.out.println(reduceCode+"-=2 --> " + (reduceCode -= 2));
        System.out.println(reduceCode+"*=2 --> " + (reduceCode *= 2));
        System.out.println(reduceCode+"/=2 --> " + (reduceCode /= 2));
        System.out.println(reduceCode+"%=2 --> " + (reduceCode %= 2));
        System.out.println(reduceCode+"&=2 --> " + (reduceCode &= 2));
        System.out.println(reduceCode+"|=2 --> " + (reduceCode |= 2));
        System.out.println(reduceCode+"^=2 --> " + (reduceCode ^= 2));
        System.out.println(reduceCode+">>=2 --> " + (reduceCode >>= 2));
        System.out.println(reduceCode+"<<=2 --> " + (reduceCode <<= 2));


    }


}
