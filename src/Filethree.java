import javax.swing.*;

public class Filethree {
    public static void main(String[] args) {
        String snum,fnum;
        Double firstNumber,secondNumber,Answer;
        fnum = JOptionPane.showInputDialog(null,"Enter the First Number");
        snum = JOptionPane.showInputDialog(null,"Enter the Second Number");
        firstNumber = Double.parseDouble(fnum);
        secondNumber = Double.parseDouble(snum);
        Answer = firstNumber+secondNumber;
        JOptionPane.showMessageDialog(null,Answer);
    }
}
