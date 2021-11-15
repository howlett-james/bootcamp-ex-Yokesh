package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcControl {
    private CalcView theView;
    private CalcModel theModel;

    public CalcControl(CalcView theView,CalcModel theModel){
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalcListener());
    }
    class CalcListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int number1, number2 = 0;
            try {
                number1 = theView.getFirstNumber();
                number2 = theView.getSecondNumber();

                theModel.addTwoNumbers(number1,number2);

                theView.setCalcSoltuion(theModel.getCalculationValue());
            }catch (NumberFormatException exception){
                theView.displayErrorMessage("You Need to Enter 2 Integers !");
            }
        }
    }
}
