package Problem3;

import javax.swing.JOptionPane;

public class TrafficLight {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter traffic light color (Red/Yellow/Green):");
        input = input.toUpperCase();

        TrafficColor color = TrafficColor.valueOf(input);
        String action = switch (color) {
            case RED -> "STOP";
            case YELLOW -> "SLOW DOWN";
            case GREEN -> "GO";
        };
        JOptionPane.showMessageDialog(null, "Action: " + action);
    }
}
