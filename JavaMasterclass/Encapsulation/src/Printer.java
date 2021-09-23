public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel>-1 && tonerLevel<101)
        { this.tonerLevel=tonerLevel;
        } else this.tonerLevel=-1;
        this.duplex=duplex;
        this.pagesPrinted=0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount<0 || tonerAmount>100 || (this.tonerLevel+tonerAmount)>100){
            return -1;
        } else {
            this.tonerLevel=this.tonerLevel+tonerAmount;
            return this.tonerLevel;}
    }

    public int printPages(int pagesToPrint){
        int pages=0;
        if(this.duplex){
            pages = (pagesToPrint/2)+pagesToPrint%2;
            this.pagesPrinted=this.pagesPrinted+pages;
            return pages;
        } else {
            this.pagesPrinted=this.pagesPrinted+pagesToPrint;
            return pagesToPrint;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
