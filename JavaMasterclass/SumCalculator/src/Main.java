public class Main {

    public static void main(String[] args) {

        SimpleCalculator  calculator = new SimpleCalculator();
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(0);
        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getSubtractionResult());
        System.out.println(calculator.getMultiplicationResult());
        System.out.println(calculator.getDivisionResult());
    }


}

