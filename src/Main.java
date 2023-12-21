import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    protected Beverage beverage;
    protected BeverageFactory beverageFactory = new BeverageFactory();

    JPanel panel = new JPanel();
    JLabel drink = new JLabel("Kaffesort:");
    JLabel condiment = new JLabel("Tillval:");
    JCheckBox milk = new JCheckBox("Mjölk");
    JCheckBox mocha = new JCheckBox("Mocha");
    JRadioButton darkroast = new JRadioButton("Mörkrost");
    JRadioButton decaf = new JRadioButton("Koffeinfritt kaffe");
    ButtonGroup buttonGroup = new ButtonGroup();
    JButton order = new JButton("Beställ");
    JLabel total = new JLabel();

    public Main() {
        panel.setBorder(new EmptyBorder(0, 5, 0, 5));
        panel.setLayout(new GridLayout(8, 1));
        buttonGroup.add(darkroast);
        buttonGroup.add(decaf);
        darkroast.setSelected(true);

        panel.add(drink);
        panel.add(darkroast);
        panel.add(decaf);
        panel.add(condiment);
        panel.add(milk);
        panel.add(mocha);
        panel.add(order);
        panel.add(total);

        order.addActionListener(this);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (darkroast.isSelected()) {
            if (milk.isSelected() && mocha.isSelected())
                beverage = beverageFactory.getBeverage("darkroast+milk+mocha");
            else if (milk.isSelected())
                beverage = beverageFactory.getBeverage("darkroast+milk");
            else if (mocha.isSelected())
                beverage = beverageFactory.getBeverage("darkroast+mocha");
            else
                beverage = beverageFactory.getBeverage("darkroast");
        }
        if (decaf.isSelected()) {
            if (milk.isSelected() && mocha.isSelected())
                beverage = beverageFactory.getBeverage("decaf+milk+mocha");
            else if (milk.isSelected())
                beverage = beverageFactory.getBeverage("decaf+milk");
            else if (mocha.isSelected())
                beverage = beverageFactory.getBeverage("decaf+mocha");
            else
                beverage = beverageFactory.getBeverage("decaf");
        }
        total.setText("En " + beverage.getDescription() + " som kostar " + beverage.cost() + " kr");
        this.pack();
    }

}
