
import javax.swing.JOptionPane;

public class Calculator{
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification= "The result: ";
        String type;
        strNum1 =  JOptionPane.showInputDialog(null,
            "Please input the first number:","Input the first number",
            JOptionPane.INFORMATION_MESSAGE);
        // strNotification += strNum1 + " and ";
    
        strNum2 = JOptionPane.showInputDialog(null,
                    "Please input the second number: ", "Input the second number",
                    JOptionPane.INFORMATION_MESSAGE);
        // strNotification += strNum2;
        type = JOptionPane.showInputDialog(null,
                "Please enter type of calculate:\nEnter \'+\' to calculate sum.\nEnter \'-\' to calculate different. \nEnter \'*\' to calculate product.\nEnter \'/\' to calculate quotient.",
                "Select type of calculate",JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
            switch (type){
                   case "+": 
                   num1 += num2;
                   break;
                   case "-": 
                   num1 -= num2;
                   break;
                   case "*": 
                   num1 *= num2;
                   break;
                   case "/": 
                   num1 /= num2;
                   break;

            }


            
        if (num2 == 0 ){
            strNotification+= "khong the chia cho 0";
        }else{
        strNotification+=num1 ;
        }

        JOptionPane.showMessageDialog(null,strNotification,
                    "Result", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

    }
    
}