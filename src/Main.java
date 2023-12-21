import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    protected Beverage beverage;
    protected BeverageFactory beverageFactory = new BeverageFactory();

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
        this.setLayout(new GridLayout(8, 1));
        buttonGroup.add(darkroast);
        buttonGroup.add(decaf);
        darkroast.setSelected(true);
        this.add(drink);
        this.add(darkroast);
        this.add(decaf);
        this.add(condiment);
        this.add(milk);
        this.add(mocha);
        this.add(order);
        this.add(total);
        order.addActionListener(this);

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
