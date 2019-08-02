import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class AdressConverter extends JFrame {
    public AdressConverter(){
        JFrame adressFrame = new JFrame();
        adressFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        adressFrame.show();
        adressFrame.setSize(new Dimension(500,500));
        JPanel labelPanel = new JPanel();
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new FlowLayout());
        textPanel.setSize(500,100);

        JLabel streetLabel = new JLabel("Strasse");
        JLabel streetLabel2 = new JLabel("Hausnummer");
        JLabel plzLabel = new JLabel("Postleitzahl");
        JLabel ortLabel = new JLabel("Ort");

        JTextField strasse = new JTextField();
        JTextField hausnummer = new JTextField();
        JTextField plz = new JTextField();
        JTextField ort = new JTextField();

        labelPanel.add(streetLabel);
        labelPanel.add(streetLabel2);
        labelPanel.add(plzLabel);
        labelPanel.add(ortLabel);

        strasse.setSize(150,20);

        textPanel.add(strasse);
        textPanel.add(hausnummer);
        textPanel.add(plz);
        textPanel.add(ort);

        adressFrame.add(labelPanel);
        adressFrame.add(textPanel);

    }

    public void convertAdress(){
            try{
                File xmlFile = new File("Adressen.xml");

            }
            catch(Exception e){
                e.printStackTrace();
            }
    }

}

