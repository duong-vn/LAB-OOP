import javax.swing.JOptionPane;

public class LinearSystem{
    public static void main(String[] args) {
        String inputA11 = JOptionPane.showInputDialog(null, "Enter a11:", "Input", JOptionPane.INFORMATION_MESSAGE);
        String inputA12 = JOptionPane.showInputDialog(null, "Enter a12:", "Input", JOptionPane.INFORMATION_MESSAGE);
        String inputB1  = JOptionPane.showInputDialog(null, "Enter b1:", "Input", JOptionPane.INFORMATION_MESSAGE);
        String inputA21 = JOptionPane.showInputDialog(null, "Enter a21:", "Input", JOptionPane.INFORMATION_MESSAGE);
        String inputA22 = JOptionPane.showInputDialog(null, "Enter a22:", "Input", JOptionPane.INFORMATION_MESSAGE);
        String inputB2  = JOptionPane.showInputDialog(null, "Enter b2:", "Input", JOptionPane.INFORMATION_MESSAGE);
        
        double a11 = Double.parseDouble(inputA11);
        double a12 = Double.parseDouble(inputA12);
        double b1  = Double.parseDouble(inputB1);
        double a21 = Double.parseDouble(inputA21);
        double a22 = Double.parseDouble(inputA22);
        double b2  = Double.parseDouble(inputB2);
        
        double determinant = a11 * a22 - a12 * a21;
        double detX = b1 * a22 - a12 * b2;
        double detY = a11 * b2 - a21 * b1;
        
        String resultMessage;
        if (determinant == 0) {
            // Check if the system has infinitely many solutions or no solution
            if (detX + detY == 0) {
                resultMessage = "The system has infinitely many solutions.";
            } else {
                resultMessage = "The system has no solution.";
            }
        } else {
            double x = detX / determinant;
            double y = detY / determinant;
            resultMessage = "The solution is (x, y) = (" + x + ", " + y + ").";
        }
        
        JOptionPane.showMessageDialog(null, resultMessage, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
