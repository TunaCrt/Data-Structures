import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Arayüz extends JFrame {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton button1;
    private JButton çizdirButton;
    private JButton dijkstraButton;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button2;
    private JTextField textField4;
    int dugumSayısı;
    Eleman []komsulukListesi;


    public void paint(Graphics g){
        g.fillOval(50,350,20,20);
        g.drawString("V0",40,340);
        g.fillOval(230,270,20,20);
        g.drawString("V1",230,260);
        g.fillOval(300,150,20,20);
        g.drawString("V1",290,140);
        g.fillOval(370,270,20,20);
        g.drawString("V1",360,260);
        g.fillOval(550,350,20,20);
        g.drawString("V1",540,340);

        g.drawRect(70,70,50,50);
        g.drawString("Dijkstra",75,100);

        g.fillOval(230,400,20,20);
        g.drawString("V1",220,390);
        g.fillOval(300,550,20,20);
        g.drawString("V1",290,540);
        g.fillOval(370,400,20,20);
        g.drawString("V1",360,390);
        g.drawString(""
                ,10,100);
        /*
            5 7
            0 1 4
            0 2 8
            1 3 5
            1 2 2
            2 3 5
            2 4 9
            3 4 4

            şeklinde düğüm sayısını ve düğümlerin ağırlıklarını yazarsak konsola çalışıyor
         */



        for (int i=0;i<dugumSayısı;i++){

        }


    }
    public Arayüz(){
        setContentPane(mainPanel);
        setTitle("Odev4");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dugumSayısı=Integer.parseInt(textField1.getText());
                komsulukListesi=new Eleman[dugumSayısı];

                repaint();
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
