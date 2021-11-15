package MVC;

public class CalcModel {
    private int calculationValue;
    public void addTwoNumbers(int num1, int num2){
        calculationValue = num1+num2;
    }
    public int getCalculationValue(){
        return calculationValue;
    }
}
