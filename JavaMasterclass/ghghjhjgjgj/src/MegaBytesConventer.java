public class MegaBytesConventer {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0 ){
            System.out.println("Invalid Value");
        } else {
            int ZZ = kiloBytes % 1024;
            int YY = (kiloBytes - ZZ) / 1024;

            System.out.println(kiloBytes + " KB = " + YY + " MB and " + ZZ + " KB");
        }

    }
}
