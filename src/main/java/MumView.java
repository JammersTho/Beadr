package main.java;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Created by JammersBlah on 03/06/2017.
 */
public class MumView extends JFrame
{

    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);
    private JTextArea userList = new JTextArea();


    MumView()
    {
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        calcPanel.add(userList);

        this.add(calcPanel);
    }

    public int getFirstNumber()
    {
        return(Integer.parseInt(firstNumber.getText()));
    }

    public int getSecondNumber()
    {
        return(Integer.parseInt(secondNumber.getText()));
    }

    public int getCalcSolution()
    {
        return(Integer.parseInt(calcSolution.getText()));
    }

    public void setCalcSolution(int solution)
    {
        calcSolution.setText(Integer.toString(solution));
    }

    void addCalculationListener(ActionListener listenerForCalcButton)
    {
        calculateButton.addActionListener(listenerForCalcButton);
    }

    public void setUsers(ArrayList<String> users)
    {
        for (String user : users)
        userList.append(user);
    }

    void displayErrorMessage(String errorMessage)
    {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}