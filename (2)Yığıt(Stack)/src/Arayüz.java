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
    private JLabel Top_pop;
    Yığıt y1=new Yığıt();//bağlı liste yığıt
    YığıtD y2=new YığıtD(5);//dizi yığıt

    public Arayüz() {
        setContentPane(mainPanel);
        setTitle("Yığıt");
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
                Top_pop.setText("pop edilen eleman :"+y1.pop().icerik);
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
                Top_pop.setText("pop edilen eleman:"+y2.pop().icerik);
                sonuç.setText(y2.çıktı());
            }
        });
        topButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Top_pop.setText("Top edilen eleman:"+y1.top().icerik);
            }
        });
        topButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Top_pop.setText("Top :"+y2.pop().icerik);
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
