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
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class Notenbilanz extends JFrame {

    private JPanel contentPane;
    private JLabel lblAnzahlNoten;
    private JTextField tfAnzahlNoten;
    private JButton btnUbernehmeAnzahl;
    private JTextField tftNotenEingabe;
    private JLabel lblNote;
    private JButton btnUbernehmeNote;
    private JLabel lblEingegebeneNoten;
    private JLabel lblDurschnitt;
    private JLabel lblBesteNote;
    private JLabel lblSchlechtesteNote;
    private JButton btnEnde;
    private JButton btnNeuBerechnen;
    private JLabel lblEingegebeneNotenOutput;
    private JLabel lblDurschnittOutput;
    private JLabel lblBesteNoteOutput;
    private JLabel lblSchlechtesteNoteOutput;

    private int anzahlNoten;
    private int[] notenArray;
    private int zahler;
    private int sum;
    private int note;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {


        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Notenbilanz frame = new Notenbilanz();
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
    public Notenbilanz() {


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblAnzahlNoten = new JLabel("Anzahl Noten");
        lblAnzahlNoten.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblAnzahlNoten.setBounds(10, 11, 94, 14);
        contentPane.add(lblAnzahlNoten);

        tfAnzahlNoten = new JTextField();



        tfAnzahlNoten.setBounds(10, 28, 86, 20);
        contentPane.add(tfAnzahlNoten);
        tfAnzahlNoten.setColumns(10);

        btnUbernehmeAnzahl = new JButton("Überneheme\r\n");
        btnUbernehmeAnzahl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                anzahlNoten = Integer.parseInt(tfAnzahlNoten.getText());
                notenArray = new int[anzahlNoten];

                tftNotenEingabe.setVisible(true);

                lblNote.setVisible(true);
                lblNote.setText((zahler + 1) + ". Note");

                btnUbernehmeNote.setVisible(true);
            }
        });


        btnUbernehmeAnzahl.setBounds(106, 27, 101, 23);
        contentPane.add(btnUbernehmeAnzahl);

        tftNotenEingabe = new JTextField();
        tftNotenEingabe.setVisible(false);
        tftNotenEingabe.setBounds(10, 108, 86, 20);
        contentPane.add(tftNotenEingabe);
        tftNotenEingabe.setColumns(10);

        lblNote = new JLabel("New label");
        lblNote.setVisible(false);
        lblNote.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNote.setBounds(10, 89, 86, 14);
        contentPane.add(lblNote);

        btnUbernehmeNote = new JButton("Überneheme\r\n");
        btnUbernehmeNote.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                tftNotenEingabe.requestFocus();
                tftNotenEingabe.selectAll();

                note = Integer.parseInt(tftNotenEingabe.getText());

                lblEingegebeneNoten.setVisible(true);
                lblDurschnitt.setVisible(true);
                lblBesteNote.setVisible(true);
                lblSchlechtesteNote.setVisible(true);


                System.out.println("zahler vor loop: " + zahler);




                if (zahler <= notenArray.length) {
                    notenArray[zahler] = note;
                    sum += notenArray[zahler];
                    lblEingegebeneNotenOutput.setText(String.valueOf((++zahler)));
                    lblEingegebeneNotenOutput.setVisible(true);
                    lblNote.setText((zahler + 1) + ". Note");

                    Arrays.sort(notenArray);

                    //lblBesteNoteOutput.setText(String.valueOf()); Hier Weitermachen
                    lblBesteNoteOutput.setVisible(true);

                    lblSchlechtesteNoteOutput.setText(String.valueOf(notenArray[notenArray.length - 1]));
                    lblSchlechtesteNoteOutput.setVisible(true);


                }if ((zahler) == notenArray.length) {
                    lblNote.setVisible(false);
                    btnUbernehmeNote.setVisible(false);
                }

                for(int i = 0; i < notenArray.length; i++) {
                    System.out.println(notenArray[i]);
                }


                System.out.println("zahler nach loop: " + zahler);
                System.out.println("Summe':" + sum);

            }
        });
        btnUbernehmeNote.setVisible(false);
        btnUbernehmeNote.setBounds(106, 107, 101, 23);
        contentPane.add(btnUbernehmeNote);

        lblEingegebeneNoten = new JLabel("Anzahl eingegebene Noten: ");
        lblEingegebeneNoten.setVisible(false);
        lblEingegebeneNoten.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblEingegebeneNoten.setBounds(10, 139, 163, 14);
        contentPane.add(lblEingegebeneNoten);

        lblDurschnitt = new JLabel("Notendurschnitt: ");
        lblDurschnitt.setVisible(false);
        lblDurschnitt.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblDurschnitt.setBounds(10, 164, 98, 14);
        contentPane.add(lblDurschnitt);

        lblBesteNote = new JLabel("Beste Note: ");
        lblBesteNote.setVisible(false);
        lblBesteNote.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblBesteNote.setBounds(10, 189, 76, 14);
        contentPane.add(lblBesteNote);

        lblSchlechtesteNote = new JLabel("Schlechteste Note: ");
        lblSchlechtesteNote.setVisible(false);
        lblSchlechtesteNote.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblSchlechtesteNote.setBounds(10, 214, 115, 14);
        contentPane.add(lblSchlechtesteNote);

        btnEnde = new JButton("Ende");
        btnEnde.setBounds(335, 210, 89, 23);
        contentPane.add(btnEnde);

        btnNeuBerechnen = new JButton("Neu Berechnen");
        btnNeuBerechnen.setVisible(false);
        btnNeuBerechnen.setBounds(308, 27, 116, 23);
        contentPane.add(btnNeuBerechnen);

        lblEingegebeneNotenOutput = new JLabel("New label");
        lblEingegebeneNotenOutput.setVisible(false);
        lblEingegebeneNotenOutput.setBounds(181, 139, 46, 14);
        contentPane.add(lblEingegebeneNotenOutput);

        lblDurschnittOutput = new JLabel("New label");
        lblDurschnittOutput.setVisible(false);
        lblDurschnittOutput.setBounds(111, 164, 46, 14);
        contentPane.add(lblDurschnittOutput);

        lblBesteNoteOutput = new JLabel("New label");
        lblBesteNoteOutput.setVisible(false);
        lblBesteNoteOutput.setBounds(80, 189, 46, 14);
        contentPane.add(lblBesteNoteOutput);

        lblSchlechtesteNoteOutput = new JLabel("New label");
        lblSchlechtesteNoteOutput.setVisible(false);
        lblSchlechtesteNoteOutput.setBounds(124, 213, 46, 14);
        contentPane.add(lblSchlechtesteNoteOutput);
    }

}
