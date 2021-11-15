package MVC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalcView extends JFrame{
    private JTextField number1 = new  JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField number2 = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    CalcView(){
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);

        calcPanel.add(number1);
        calcPanel.add(additionLabel);
        calcPanel.add(number2);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }
    public int getFirstNumber(){
        return Integer.parseInt(number1.getText());
    }
    public int getSecondNumber(){
        return Integer.parseInt(number2.getText());
    }
    public int getCalcSolution(){
        return Integer.parseInt(calcSolution.getText());
    }
    public void setCalcSoltuion(int soltuion){
        calcSolution.setText(Integer.toString(soltuion));
    }

    void addCalculationListener(ActionListener listenForCalcButton){
        calculateButton.addActionListener(listenForCalcButton);
    }
    void displayErrorMessage(String errorMsg){
        JOptionPane.showMessageDialog(this, errorMsg );
    }
}
