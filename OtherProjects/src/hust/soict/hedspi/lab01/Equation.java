package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;

public class Equation {
    public static void main(String[] args) {
        double num1, num2, nghiem;
        String strnum1, strnum2, strNotification;
        strnum1 = JOptionPane.showInputDialog(null, "Please input the first number a in equation a*x + b = 0 :", 
        "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strnum2 = JOptionPane.showInputDialog(null, "Please input the second number b int equation a*x + b = 0:", 
        "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strnum1);
        num2 = Double.parseDouble(strnum2);
        if (num1 == 0) {
            if (num2 == 0) {
                strNotification = "Infinite number of root.";
            } else {
                strNotification = "Can't find root";
            }
        } else {
            nghiem = -num2 / num1;   
            strNotification = "Found  x = " + nghiem;
        }
        JOptionPane.showMessageDialog(null,  strNotification, "Display", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}