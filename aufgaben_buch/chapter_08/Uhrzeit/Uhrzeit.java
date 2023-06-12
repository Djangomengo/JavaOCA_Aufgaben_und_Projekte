package aufgaben_buch.chapter_08.Uhrzeit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Uhrzeit extends JFrame {

	private JPanel contentPane;
	private JTextField tfStunden;
	private JTextField tfMinuten;
	private JLabel lblStunden;
	private JLabel lblMinuten;
	private JLabel lblUhrzeit;
	private JButton BtnUebernehmen;
	private JButton Ende;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uhrzeit frame = new Uhrzeit();
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
	public Uhrzeit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfStunden = new JTextField();
		tfStunden.setBounds(10, 46, 86, 20);
		contentPane.add(tfStunden);
		tfStunden.setColumns(10);
		
		tfMinuten = new JTextField();
		tfMinuten.setColumns(10);
		tfMinuten.setBounds(128, 46, 86, 20);
		contentPane.add(tfMinuten);
		
		lblStunden = new JLabel("Stunden");
		lblStunden.setBounds(10, 21, 46, 14);
		contentPane.add(lblStunden);
		
		lblMinuten = new JLabel("Minuten");
		lblMinuten.setBounds(128, 21, 46, 14);
		contentPane.add(lblMinuten);
		
		lblUhrzeit = new JLabel("New label");
		lblUhrzeit.setVisible(false);
		lblUhrzeit.setBounds(10, 86, 414, 14);
		contentPane.add(lblUhrzeit);
		
		BtnUebernehmen = new JButton("Übernehen");
		BtnUebernehmen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				uebernehmen();
			}
		});
		BtnUebernehmen.setBounds(250, 45, 104, 23);
		contentPane.add(BtnUebernehmen);
		
		Ende = new JButton("Ende");
		Ende.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		Ende.setBounds(320, 159, 104, 23);
		contentPane.add(Ende);
	}
	
	
	public void uebernehmen() {
		try {
			
			int stunden = Integer.parseInt(tfStunden.getText());
			int minuten = Integer.parseInt(tfMinuten.getText());
			
			if ( !(stunden >= 0 && stunden <= 23) && !(minuten >= 0 && minuten <= 59)){
				
				throw new UhrFormat("Stunden und Minuten sind nicht im gültigen bereich");
			}

			else if( !(stunden >= 0 && stunden <= 23)) {
				
				throw new StundenFormatException("Stunden sind nicht im gültigen bereich");
				
			}
			else if ( !(minuten >= 0 && minuten <= 59)) {
				throw new MinutenFormatException("Minuten sind nicht im gültigen bereich");
				
				
			}  else {
				lblUhrzeit.setText("Ihre Uhrzeit ist " + stunden +":" + minuten + " Uhr");
				lblUhrzeit.setVisible(true);
	
			}

		}catch(UhrFormat u){
			lblUhrzeit.setText(u.getMessage());
			lblUhrzeit.setVisible(true);
			
		}catch(StundenFormatException q) {
			
			lblUhrzeit.setText(q.getMessage());
			lblUhrzeit.setVisible(true);
			
		}catch (MinutenFormatException r) {
			lblUhrzeit.setText(r.getMessage());
			lblUhrzeit.setVisible(true);
		}
	}

}
