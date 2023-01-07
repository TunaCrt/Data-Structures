import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Arayüz extends JFrame{
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton ekleButton;
    private JButton ekleButton1;
    private JButton ekleButton2;
    private JLabel sonuç;
    private JButton silButton;
    private JButton silButton1;
    private JButton silButton2;
    private JButton ekleButton3;
    private JButton silButton3;
    private JButton ekleButton4;
    private JButton silButton4;
    kaydırmalıKuyruk kaydırmalıKuyruk=new kaydırmalıKuyruk(10);
    çevrimselKuyruk çevrimselKuyruk=new çevrimselKuyruk(10);
    bağlıListeKuyruk bağlıListeKuyruk=new bağlıListeKuyruk();
    kaydırmalı kaydırmalı=new kaydırmalı(10);
    çevrimsel çevrimsel=new çevrimsel(10);
    public Arayüz(){
        setContentPane(mainPanel);
        setTitle("Odev4");
        setSize(350, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            kaydırmalıKuyruk.ekle(Integer.parseInt(textField1.getText()));
            sonuç.setText(kaydırmalıKuyruk.listele());
            }
        });
        silButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kaydırmalıKuyruk.çikar();
                sonuç.setText(kaydırmalıKuyruk.listele());
            }
        });
        ekleButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleman yeni=new Eleman(Integer.parseInt(textField1.getText()));
                çevrimselKuyruk.ekle(yeni);
                sonuç.setText(çevrimselKuyruk.listele());
            }
        });
        ekleButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleman2 yeni=new Eleman2(Integer.parseInt(textField1.getText()));
                bağlıListeKuyruk.ekle(yeni);
                sonuç.setText(bağlıListeKuyruk.listele());
            }
        });
        silButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bağlıListeKuyruk.kuyruktanSil();
                sonuç.setText(bağlıListeKuyruk.listele());
            }
        });
        ekleButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleman yeni=new Eleman(Integer.parseInt(textField1.getText()));
                çevrimselKuyruk.ekle(yeni);
                sonuç.setText(çevrimselKuyruk.listele());
            }
        });
        silButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                çevrimselKuyruk.kuyrukSil();
                sonuç.setText(çevrimselKuyruk.listele());
            }
        });
        ekleButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleman yeni=new Eleman(Integer.parseInt(textField1.getText()));
                kaydırmalı.ekle(yeni);
                sonuç.setText(kaydırmalı.listele());
            }
        });
        silButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kaydırmalı.çıkar();
                sonuç.setText(kaydırmalı.listele());
            }
        });
        ekleButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleman yeni=new Eleman(Integer.parseInt(textField1.getText()));
                çevrimsel.ekle(yeni);
                sonuç.setText(çevrimsel.listele());
            }
        });
        silButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                çevrimsel.çıkar();
                sonuç.setText(çevrimsel.listele());
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
