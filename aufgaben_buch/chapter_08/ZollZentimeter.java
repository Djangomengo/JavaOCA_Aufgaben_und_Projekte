package aufgaben_buch.chapter_08;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ZollZentimeter extends JFrame {

    private JPanel contentPane;
    private JTextField tfZoll;
    private JLabel lblZoll;
    private JButton btnUmrechnen;
    private JButton btnBeenden;
    private JLabel lblCentimeter;
    private JLabel lblCentimerterOutput;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ZollZentimeter frame = new ZollZentimeter();
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
    public ZollZentimeter() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 343, 164);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);

        tfZoll = new JTextField();
        tfZoll.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    umrechnen();
                }
            }
        });
        tfZoll.setBounds(10, 29, 86, 20);
        contentPane.add(tfZoll);
        tfZoll.setColumns(10);

        lblZoll = new JLabel("Zoll");
        lblZoll.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblZoll.setBounds(10, 11, 46, 14);
        contentPane.add(lblZoll);

        btnUmrechnen = new JButton("Umrechen");
        btnUmrechnen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                umrechnen();
            }
        });

        btnUmrechnen.setBounds(10, 76, 89, 23);
        contentPane.add(btnUmrechnen);

        btnBeenden = new JButton("Beenden");
        btnBeenden.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnBeenden.setBounds(144, 76, 89, 23);
        contentPane.add(btnBeenden);

        lblCentimeter = new JLabel("Zoll in Centimeter ");
        lblCentimeter.setVisible(false);
        lblCentimeter.setBounds(126, 11, 107, 14);
        contentPane.add(lblCentimeter);

        lblCentimerterOutput = new JLabel("New label");
        lblCentimerterOutput.setVisible(false);
        lblCentimerterOutput.setBounds(126, 32, 86, 14);
        contentPane.add(lblCentimerterOutput);
    }

    public void umrechnen() {
        double zoll = Double.parseDouble(tfZoll.getText());
        double centimeter = zoll * 2.54;

        lblCentimerterOutput.setText(String.format("%.2f", centimeter));
        lblCentimerterOutput.setVisible(true);

        lblCentimeter.setVisible(true);

        tfZoll.requestFocus();
        tfZoll.selectAll();
    }
}
