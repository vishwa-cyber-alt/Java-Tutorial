import javax.swing.*;

public class AdditionCalculator extends JFrame {
  private JTextField num1Field, num2Field, cField;
  private JButton addButton;

  public AdditionCalculator() {
    setTitle("Addition Calculator");
    setSize(300, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    JPanel panel = new JPanel();

    num1Field = new JTextField(10);
    num2Field = new JTextField(10);
    cField = new JTextField(10);
    addButton = new JButton("Add");

    addButton.addActionListener(e -> {
      try {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double c = Double.parseDouble(cField.getText());
        double result;
        if (c == 1) {
          result = num1 + num2;
        } else {
          result = num1 - num2;
        }

        JOptionPane.showMessageDialog(null, "Result: " + result,
            "Addition Result", JOptionPane.INFORMATION_MESSAGE);
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null,
            "Invalid input! Please enter valid numbers.", "Error",
            JOptionPane.ERROR_MESSAGE);
      }
    });

    panel.add(new JLabel("Number 1:"));
    panel.add(num1Field);
    panel.add(new JLabel("\n Number 2:"));
    panel.add(num2Field);
    panel.add(new JLabel("\n select:"));
    panel.add(cField);
    panel.add(addButton);

    add(panel);
    setVisible(true);
  }

  public static void main(String[] args) {
    new AdditionCalculator();
  }
}
