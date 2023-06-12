package aufgaben_buch.chapter_08;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ostern extends JFrame {

    private JPanel contentPane;
    private JLabel lblJahr;
    private JTextField tfJahrInput;
    private JButton btnBerchnen;
    private JLabel lblInfo;
    private JLabel lblErgebniss;
    private JButton btnEnde;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ostern frame = new Ostern();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Ostern() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 164);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblJahr = new JLabel("Jahr");
        lblJahr.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblJahr.setBounds(10, 11, 46, 14);
        contentPane.add(lblJahr);

        tfJahrInput = new JTextField();
        tfJahrInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {

                    umrechnen();

                    tfJahrInput.requestFocus();
                    tfJahrInput.selectAll();
                }
            }
        });
        tfJahrInput.setBounds(10, 29, 86, 20);
        contentPane.add(tfJahrInput);
        tfJahrInput.setColumns(10);

        btnBerchnen = new JButton("Ostersonntag berechnen");
        btnBerchnen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                umrechnen();
            }
        });
        btnBerchnen.setBounds(106, 28, 219, 23);
        contentPane.add(btnBerchnen);

        lblInfo = new JLabel("Datum für Ostersonntag:");
        lblInfo.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblInfo.setBounds(10, 78, 147, 14);
        contentPane.add(lblInfo);

        lblErgebniss = new JLabel("text");
        lblErgebniss.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblErgebniss.setVisible(false);
        lblErgebniss.setBounds(167, 78, 257, 14);
        contentPane.add(lblErgebniss);

        btnEnde = new JButton("Ende");
        btnEnde.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                beenden();
            }
        });
        btnEnde.setBounds(335, 28, 89, 23);
        contentPane.add(btnEnde);
    }

    public void umrechnen() {

        int jahr = Integer.parseInt(tfJahrInput.getText());

        if(jahr > 1583) {

            int y = jahr;

            int g = y % 19;
            int c = y / 100;
            int h = (c - c / 4 - (8 * c + 13) / 25 + 19 * g + 15) % 30;
            int i = h - (h / 28) * (1 - (29 / (h + 1)) * (21 - g / 11));
            int j = (y + y / 4 + i + 2 - c + c / 4) % 7;
            int l = i - j;
            int m = 3 + (l + 40) / 44;
            int d = l + 28 - 31 * (m / 4);

            String ergebniss = (y + "." + m + "." + d);

            lblErgebniss.setVisible(true);
            lblErgebniss.setText(ergebniss);
        }else {
            lblErgebniss.setVisible(true);
            lblErgebniss.setText("Berechnung nur für Jahreszahl > 1583");
        }


    }

    public void beenden() {
        System.exit(0);
    }

}
