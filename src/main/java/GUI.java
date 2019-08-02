import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    public GUI() {
        JFrame frame = new JFrame();
        frame.show();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JPanel panel = new JPanel();
        JToolBar toolBar = new JToolBar();
        JButton button1 = new JButton("Weiter zur Adresseingabe");
        button1.setPreferredSize(new Dimension(200,200));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AdressConverter ad = new AdressConverter();
                ad.convertAdress();
            }
        });

        frame.add(panel);

        panel.setLayout(new FlowLayout());
        toolBar.setSize(new Dimension(frame.getWidth(), 50));
        button1.setPreferredSize(new Dimension(50,20));

        addNavigationButton(toolBar);
        panel.add(toolBar);
        panel.add(button1);
    }

    private void addNavigationButton(JToolBar toolBar){
        JButton button = new JButton("Einstellungen");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AdressConverter ad = new AdressConverter();
                ad.convertAdress();
            }
        });

        toolBar.add(button);

    }

    public static void main (String [] args){
        GUI gui = new GUI();
    }
}
