package aufgaben_buch.chapter_08;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FahrenheitCelsiusRechner extends JFrame {

    private JLabel lblFahrenheit;
    private JPanel contentPane;
    private JFormattedTextField tfFahrenheit;
    private JLabel lblGradCelsius;
    private JTextField tfCelsius;
    private JButton btnUmrechnen;
    private JButton btnEnde;
    private JButton btnLeeren;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FahrenheitCelsiusRechner frame = new FahrenheitCelsiusRechner();
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
    public FahrenheitCelsiusRechner() {
        setBackground(new Color(192, 192, 192));
        setTitle("\r\n");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 180);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);

        lblFahrenheit = new JLabel("Grad Fahrenheit");
        lblFahrenheit.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblFahrenheit.setBackground(new Color(255, 255, 255));
        lblFahrenheit.setBounds(10, 11, 103, 14);
        contentPane.add(lblFahrenheit);

        tfFahrenheit = new JFormattedTextField();
        tfFahrenheit.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode()== KeyEvent.VK_ENTER) {


                    umrechnen();
                }
            }
        });
        tfFahrenheit.setBounds(123, 8, 103, 20);
        contentPane.add(tfFahrenheit);

        lblGradCelsius = new JLabel("Grad Celsius");
        lblGradCelsius.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblGradCelsius.setBounds(10, 51, 103, 14);
        contentPane.add(lblGradCelsius);

        tfCelsius = new JTextField();
        tfCelsius.setBounds(123, 48, 103, 20);
        contentPane.add(tfCelsius);
        tfCelsius.setColumns(10);

        btnUmrechnen = new JButton("Umrechnen");
        btnUmrechnen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                umrechnen();

            }
        });
        btnUmrechnen.setBounds(10, 107, 103, 23);
        contentPane.add(btnUmrechnen);

        btnEnde = new JButton("Ende");
        btnEnde.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnEnde.setBounds(271, 107, 103, 23);
        contentPane.add(btnEnde);

        btnLeeren = new JButton("Leeren");
        btnLeeren.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                tfCelsius.setText("");
                tfFahrenheit.setText("");

            }
        });
        btnLeeren.setBounds(123, 107, 103, 23);
        contentPane.add(btnLeeren);
    }

    public void umrechnen() {



        try {
            if(tfCelsius.getText().equals("")) {


                double fahrenheit = Double.parseDouble(tfFahrenheit.getText());

                double celsius = (fahrenheit - 32) * 5/9;

                tfCelsius.setText(String.format("%.2f", celsius));

                tfFahrenheit.requestFocus();
                tfFahrenheit.selectAll();

            }
            else if(tfFahrenheit.getText().equals("")) {

                double celsius = Double.parseDouble(tfCelsius.getText());

                double fahrenheit = (celsius * 9/5)+32;

                tfFahrenheit.setText(String.format("%.2f", fahrenheit));

                tfCelsius.requestFocus();
                tfCelsius.selectAll();

            }
        }catch(NumberFormatException q) {
            tfCelsius.setText(" Falsches Format");
        }


    }
}
