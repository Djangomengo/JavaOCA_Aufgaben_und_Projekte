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

public class AlteZaehlweise extends JFrame {

    private JPanel contentPane;
    private JLabel lblStueckzahl;
    private JTextField tfStueckzahl;
    private JLabel lblGrosAmount;
    private JLabel lblSchockAmount;
    private JLabel lblDutzendAmount;
    private JLabel lblStueckAmount;
    private JLabel lblGros;
    private JLabel lblSchock;
    private JLabel lblDutzend;
    private JLabel lblStueck;
    private JButton btnUmrechnen;
    private JButton btnBeenden;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AlteZaehlweise frame = new AlteZaehlweise();
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
    public AlteZaehlweise() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 223, 240);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);

        lblStueckzahl = new JLabel("Geben sie eine Stückzahl an");
        lblStueckzahl.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblStueckzahl.setBounds(10, 11, 164, 14);
        contentPane.add(lblStueckzahl);

        tfStueckzahl = new JTextField();
        tfStueckzahl.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    umrechnen();
                }
            }
        });
        tfStueckzahl.setBounds(10, 28, 86, 20);
        contentPane.add(tfStueckzahl);
        tfStueckzahl.setColumns(10);

        lblGrosAmount = new JLabel("0");
        lblGrosAmount.setVisible(false);
        lblGrosAmount.setBounds(10, 59, 40, 14);
        contentPane.add(lblGrosAmount);

        lblSchockAmount = new JLabel("0");
        lblSchockAmount.setVisible(false);
        lblSchockAmount.setBounds(10, 84, 40, 14);
        contentPane.add(lblSchockAmount);

        lblDutzendAmount = new JLabel("0");
        lblDutzendAmount.setVisible(false);
        lblDutzendAmount.setBounds(10, 109, 40, 14);
        contentPane.add(lblDutzendAmount);

        lblStueckAmount = new JLabel("0");
        lblStueckAmount.setVisible(false);
        lblStueckAmount.setBounds(10, 134, 40, 14);
        contentPane.add(lblStueckAmount);

        lblGros = new JLabel("Gros");
        lblGros.setBounds(60, 59, 46, 14);
        contentPane.add(lblGros);

        lblSchock = new JLabel("Schock");
        lblSchock.setBounds(60, 84, 46, 14);
        contentPane.add(lblSchock);

        lblDutzend = new JLabel("Dutzend");
        lblDutzend.setBounds(60, 109, 46, 14);
        contentPane.add(lblDutzend);

        lblStueck = new JLabel("Stück");
        lblStueck.setBounds(60, 134, 46, 14);
        contentPane.add(lblStueck);

        btnUmrechnen = new JButton("Umrechnen");
        btnUmrechnen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                umrechnen();
            }
        });
        btnUmrechnen.setBounds(10, 171, 89, 23);
        contentPane.add(btnUmrechnen);

        btnBeenden = new JButton("Beenden");
        btnBeenden.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                beenden();
            }
        });
        btnBeenden.setBounds(109, 171, 89, 23);
        contentPane.add(btnBeenden);
    }

    public void umrechnen() {
        double stuckzahl = Double.parseDouble(tfStueckzahl.getText());

        double dutzend = stuckzahl / 12;
        double schock = dutzend / 5;
        double gros = dutzend / 12;

        lblGrosAmount.setText(String.format("%.2f",gros));
        lblGrosAmount.setVisible(true);
        lblSchockAmount.setText(String.format("%.2f",schock));
        lblSchockAmount.setVisible(true);
        lblDutzendAmount.setText(String.format("%.2f",dutzend));
        lblDutzendAmount.setVisible(true);
        lblStueckAmount.setText(String.format("%.2f",stuckzahl));
        lblStueckAmount.setVisible(true);

        tfStueckzahl.requestFocus();
        tfStueckzahl.selectAll();
    }

    public void beenden() {
        System.exit(0);
    }

}
