public class ByteShortIntLong {
    public static void main(String[] args){

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue );
        System.out.println("Integer Maximum Value = " + myMaxIntValue );

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Maximum Value = " + myMaxByteValue );
        System.out.println("Byte Minimum Value = " + myMinByteValue );

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Maximum Value = " + myMaxShortValue );
        System.out.println("Short Minimum Value = " + myMinShortValue );

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Maximum Value = " + myMaxLongValue );
        System.out.println("Long Minimum Value = " + myMinLongValue );

        byte b = 100;
        short s = 10000;
        int i =  100000;
        long l  = 50000 * 10 + b + s + i;

        System.out.println(l);

        float f = (float) 5.25;

        float p = 200f;
        double k = p * 0.453592237;
        System.out.println(k);

        








    }
}
