package Problem1;

import javax.swing.JOptionPane;

public class DayChecker {
    public static void main(String[] args) {
        String day = JOptionPane.showInputDialog("Enter a day:");
        day = day.toLowerCase();

        DayType type = (day.equals("saturday") || day.equals("sunday")) ? DayType.WEEKEND : DayType.WEEKDAY;

        JOptionPane.showMessageDialog(null, "Day Type: " + type);
    }
}

