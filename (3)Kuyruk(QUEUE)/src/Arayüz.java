import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Arayüz extends JFrame{
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton ekleButton;
    private JButton çevrimselEkle;
    private JButton kuyrukEkle;
    private JLabel sonuç;
    private JButton kaydırmalıSil;
    private JButton çevrimselSil;
    private JButton KuyrukSil;
    private JButton ekleButton3;
    private JButton silButton3;
    private JButton ekleButton4;
    private JButton silButton4;

    kaydırmalı kaydırmalıEklee =new kaydırmalı(10);
    çevrimsel çevrimsell=new çevrimsel(10);
    kuyruk kuyruk=new kuyruk();
    public Arayüz(){
        setContentPane(mainPanel);
        setTitle("Kuyruk");
        setSize(350, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleman yeni=new Eleman(Integer.parseInt(textField1.getText()));
                kaydırmalıEklee.ekle(yeni);
                sonuç.setText(kaydırmalıEklee.listele());
            }
        });
        kaydırmalıSil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kaydırmalıEklee.çıkar();
                sonuç.setText(kaydırmalıEklee.listele());
            }
        });

        kuyrukEkle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleman yeni=new Eleman(Integer.parseInt(textField1.getText()));
                kuyruk.ekle(yeni);
                sonuç.setText(kuyruk.listele());
            }
        });
        KuyrukSil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kuyruk.sil();
                sonuç.setText(kuyruk.listele());
            }
        });
        çevrimselEkle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleman yeni=new Eleman(Integer.parseInt(textField1.getText()));
                çevrimsell.ekle(yeni);
                sonuç.setText(çevrimsell.listele());
            }
        });
        çevrimselSil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                çevrimsell.çıkar();
                sonuç.setText(çevrimsell.listele());
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
