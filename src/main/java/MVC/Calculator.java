package MVC;

public class Calculator {
    public static void main(String[] args) {
        CalcView theView = new CalcView();
        CalcModel theModel = new CalcModel();
        new CalcControl(theView, theModel);

        theView.setVisible(true);
    }
}