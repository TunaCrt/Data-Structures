import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Arayüz extends JFrame {
    private JTextField textField1;
    private JButton pushButton;
    private JButton popButton;
    private JButton topButton;
    private JLabel sonuç;
    private JPanel mainPanel;
    private JButton pushButton1;
    private JButton popButton1;
    private JButton topButton1;
    Yığıt y1=new Yığıt();
    YığıtD y2=new YığıtD(5);

    public Arayüz() {
        setContentPane(mainPanel);
        setTitle("Odev4");
        setSize(350, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleman yeni=new Eleman(Integer.parseInt(textField1.getText()));
                y1.push(yeni);
                sonuç.setText(y1.çıktı());
            }
        });
        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y1.pop();
                sonuç.setText(y1.çıktı());
            }
        });
        pushButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleman yeni=new Eleman(Integer.parseInt(textField1.getText()));
                y2.push(yeni);
                sonuç.setText(y2.çıktı());
            }
        });
        popButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y2.pop();
                sonuç.setText(y2.çıktı());
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
