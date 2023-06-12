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
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Einkauf extends JFrame {

    private JPanel contentPane;
    private JLabel lblstuckzahl;
    private JLabel lblStckpreis;
    private JLabel lblRabatt;
    private JTextField tfStuckzahl;
    private JTextField tfStuckpreis;
    private JTextField tfRabatt;
    private JButton btnBerechnen;
    private JButton btnBeenden;
    private JLabel lblNeuerPreis;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Einkauf frame = new Einkauf();
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
    public Einkauf() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 341, 231);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblstuckzahl = new JLabel("Stückzahl");
        lblstuckzahl.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblstuckzahl.setBounds(10, 11, 60, 14);
        contentPane.add(lblstuckzahl);

        lblStckpreis = new JLabel("Stückpreis");
        lblStckpreis.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblStckpreis.setBounds(111, 11, 60, 14);
        contentPane.add(lblStckpreis);

        lblRabatt = new JLabel("Rabatt(%)");
        lblRabatt.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblRabatt.setBounds(214, 11, 69, 14);
        contentPane.add(lblRabatt);

        tfStuckzahl = new JTextField();
        tfStuckzahl.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    tfStuckpreis.requestFocus();
                    tfStuckpreis.selectAll();
                }
            }
        });
        tfStuckzahl.setBounds(10, 36, 86, 20);
        contentPane.add(tfStuckzahl);
        tfStuckzahl.setColumns(10);

        tfStuckpreis = new JTextField();
        tfStuckpreis.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    tfRabatt.requestFocus();
                    tfRabatt.selectAll();
                }
            }
        });

        tfStuckpreis.setColumns(10);
        tfStuckpreis.setBounds(111, 36, 86, 20);
        contentPane.add(tfStuckpreis);

        tfRabatt = new JTextField();
        tfRabatt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {

                    umrechnen();

                    tfStuckzahl.requestFocus();
                    tfStuckzahl.selectAll();
                }
            }
        });
        tfRabatt.setColumns(10);
        tfRabatt.setBounds(214, 36, 86, 20);
        contentPane.add(tfRabatt);

        btnBerechnen = new JButton("Berechnen");
        btnBerechnen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                umrechnen();
            }
        });
        btnBerechnen.setBounds(10, 104, 89, 23);
        contentPane.add(btnBerechnen);

        btnBeenden = new JButton("Beenden");
        btnBeenden.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                beenden();
            }
        });
        btnBeenden.setBounds(214, 104, 89, 23);
        contentPane.add(btnBeenden);

        lblNeuerPreis = new JLabel("New label");
        lblNeuerPreis.setVisible(false);
        lblNeuerPreis.setBounds(10, 67, 290, 26);
        contentPane.add(lblNeuerPreis);
    }

    public void umrechnen() {


        if(tfStuckzahl.getText().isBlank() && tfStuckpreis.getText().isBlank() && tfRabatt.getText().isBlank()) {
            lblNeuerPreis.setText("Fehler! Die Eingaben sind unvollständig!");
            lblNeuerPreis.setVisible(true);

        }else {
            if (!tfStuckzahl.getText().equals("")) {
                if(!tfStuckpreis.getText().equals("")) {
                    if(!tfRabatt.getText().equals("")) {
                        double stuckzahl = Double.parseDouble(tfStuckzahl.getText());
                        double stuckpreis = Double.parseDouble(tfStuckpreis.getText());
                        double rabatt = Double.parseDouble(tfRabatt.getText()) / 100 ;

                        double gesPreis = stuckzahl * stuckpreis;

                        double neuerPreis = gesPreis - gesPreis * rabatt;

                        lblNeuerPreis.setText(String.format("Der Neue Preis: %.2f", neuerPreis));

                        lblNeuerPreis.setVisible(true);
                    }else {

                        lblNeuerPreis.setText("Fehler! Rabatt Feld ist leer!");
                        lblNeuerPreis.setVisible(true);

                    }
                } else {

                    lblNeuerPreis.setText("Fehler! Stückpreis Feld ist leer!");
                    lblNeuerPreis.setVisible(true);
                }
            }else {

                lblNeuerPreis.setText("Fehler! Stück Feld ist leer!");
                lblNeuerPreis.setVisible(true);
            }
        }
    }
    public void beenden() {
        System.exit(0);
    }
}
