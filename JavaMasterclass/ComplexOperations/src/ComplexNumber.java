public class ComplexNumber {

    private double real;
    private double imaginary;


    public ComplexNumber(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;

    }

    public double getReal(){
        return real;

    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double addReal, double addImaginary){
        this.real= this.real+addReal;
        this.imaginary= this.imaginary+addImaginary;
    }

    public void subtract(double subtractReal, double subtractImaginary){
        this.real= this.real-subtractReal;
        this.imaginary=this.imaginary-subtractImaginary;
    }

    public void subtract(ComplexNumber complexNumber){
       subtract(complexNumber.real,complexNumber.imaginary);
    }

    public void add(ComplexNumber complexNumber){
        add(complexNumber.real,complexNumber.imaginary);
    }


}
