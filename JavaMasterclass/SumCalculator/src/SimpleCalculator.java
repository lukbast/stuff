public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }//end of 1st method

    public double getSecondNumber(){
        return secondNumber;
    }// end of 2nd method

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }// end of 3rd method

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }// end of 4rd method

    public double getAdditionResult(){
        double addition = firstNumber+secondNumber;
        return addition;
    }// end of 5th method

    public double getSubtractionResult(){
        double subtraction = firstNumber-secondNumber;
        return subtraction;
    }// end of 6th method
    public double getMultiplicationResult(){
        double multiplication = firstNumber*secondNumber;
        return multiplication;
    }// end of 7th method

    public double getDivisionResult(){
        if (secondNumber==0){
            return 0;
        }
        double division = firstNumber/secondNumber;
        return division;
    }// end of 8th method



}// end of class
