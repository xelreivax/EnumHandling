package Problem2;

import javax.swing.JOptionPane;

public class RestaurantOrder {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Menu:\n1 - BURGER\n2 - FRIES\n3 - DRINK\nEnter option number:");
        int choice = Integer.parseInt(input);
        MenuItem item = switch (choice) {
            case 1 -> MenuItem.BURGER;
            case 2 -> MenuItem.FRIES;
            case 3 -> MenuItem.DRINK;
            default -> null;
        };
        if (item == null) JOptionPane.showMessageDialog(null, "Invalid Choice");
        else JOptionPane.showMessageDialog(null, "You ordered: " + item + "\nPrice: ₱" + item.getPrice());
    }
}