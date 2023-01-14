import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Arayüz extends JFrame{
    private JTextField textField1;
    private JButton ekleButton;
    private JButton silButton;
    private JButton asgariButton;
    private JButton azamiButton;
    private JButton araButton;
    private JLabel sonuç;
    private JPanel mainPanel;
    private JLabel s2;
    İkiliAğaç i̇kiliAğaç=new İkiliAğaç();

    public Arayüz(){
        setContentPane(mainPanel);
        setTitle("Odev4");
        setSize(350, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eleman yeni=new Eleman(Integer.parseInt(textField1.getText()));
                i̇kiliAğaç.ekle(yeni);
            }
        });
        silButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i̇kiliAğaç.sil(Integer.parseInt(textField1.getText()));
            }
        });
        asgariButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // s2.setText("asgari:"+i̇kiliAğaç.asgari());

            }
        });
        azamiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //  s2.setText("azami:"+i̇kiliAğaç.azami());
            }
        });
        araButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i̇kiliAğaç.ara(Integer.parseInt(textField1.getText()));

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
