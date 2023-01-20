import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Arayüz extends JFrame {
    private JTextField textField1;
    private JButton basaEkleButton;
    private JButton sonaEkleButton;
    private JButton bastanSilButton;
    private JButton sondanSilButton;
    private JButton tersÇevirButton;
    private JPanel mainPanel;
    private JLabel sonuç;
    private JButton basaEkleButton1;
    private JButton sonaEkleButton1;
    private JButton bastanSilButton1;
    private JButton sondanSilButton1;
    private JButton maxButton1;
    private JButton maxButton;
    private JButton tersÇevirButton1;
    private JLabel sonuç2;
    TekYonluBagliListe t1=new TekYonluBagliListe();
    public Arayüz() {
        setContentPane(mainPanel);
        setTitle("Odev4");
        setSize(350, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        basaEkleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleman yeni=new Eleman(Integer.parseInt(textField1.getText()));
                t1.basaEkle(yeni);
                sonuç.setText(t1.cikti());
            }
        });
        sonaEkleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleman yeni=new Eleman(Integer.parseInt(textField1.getText()));
                t1.sonaEkle(yeni);
                sonuç.setText(t1.cikti());
            }
        });
        bastanSilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.bastanSil();
                sonuç.setText(t1.cikti());
            }
        });
        sondanSilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.sondanSil();
                sonuç.setText(t1.cikti());
            }
        });

        maxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sonuç2.setText(String.valueOf(t1.max()));
            }
        });
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Arayüz arayüz=new Arayüz();
            }
        });
    }
}
