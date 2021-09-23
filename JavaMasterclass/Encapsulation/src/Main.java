public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println(printer.addToner(50));
        System.out.println(printer.addToner(50));
        System.out.println(printer.getPagesPrinted());
        System.out.println(printer.printPages(3));
        System.out.println(printer.printPages(4));
        System.out.println(printer.getPagesPrinted());
        Printer printer2 = new Printer (150,true);
        System.out.println(printer2.getTonerLevel());




    }

}
