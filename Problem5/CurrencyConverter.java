package Problem5;

import javax.swing.JOptionPane;

public class CurrencyConverter {
    public static void main(String[] args) {
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount:"));
        Currency cur = Currency.valueOf(JOptionPane.showInputDialog("Enter currency (USD/EUR/JPY):").toUpperCase());
        double result = amount * cur.getRate();
        JOptionPane.showMessageDialog(null, "Amount in PHP: ₱" + String.format("%.2f", result));
    }
}
