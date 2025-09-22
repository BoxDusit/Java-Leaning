public class Calculator {
    private double number1;
    private double number2;

    public Calculator(double number1,double number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public double addNumber(){
        return number1 + number2;
    }

    public  double subNumber(){
        return number1-number2;
    }


    public double mutipliCateNUmber(){
        return number1*number2;
    }

    public double Division(){
        if (number1 == 0) {
            throw new ArithmeticException("ไม่สามารถหารด้วยศูนย์ได้");
        }
        return number1 /number2;
    }

}
