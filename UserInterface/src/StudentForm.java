import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class StudentForm extends JFrame {

	private JPanel eng;
	private JTextField nametxt;
	private JTextField engtxt;
	private JTextField acctxt;
	private JTextField konktxt;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentForm frame = new StudentForm();
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
	public StudentForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 438);
		eng = new JPanel();
		eng.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(eng);
		eng.setLayout(null);
		
		JLabel name = new JLabel("Name:");
		name.setBounds(91, 21, 42, 14);
		eng.add(name);
		
		nametxt = new JTextField();
		nametxt.setBounds(184, 18, 86, 20);
		eng.add(nametxt);
		nametxt.setColumns(10);
		
		JLabel english = new JLabel("English:");
		english.setBounds(91, 58, 46, 14);
		eng.add(english);
		
		engtxt = new JTextField();
		engtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char n=e.getKeyChar();
				if(Character.isAlphabetic(n) || (Character.isWhitespace(n)))
				{
					JOptionPane.showMessageDialog(null,"incorrect");
					e.consume();
				}
			}
		});
		engtxt.setBounds(184, 55, 86, 20);
		eng.add(engtxt);
		engtxt.setColumns(10);
		
		JLabel accounts = new JLabel("Accounts:");
		accounts.setAlignmentX(Component.CENTER_ALIGNMENT);
		accounts.setBounds(91, 99, 70, 14);
		eng.add(accounts);
		
		acctxt = new JTextField();
		acctxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char n=e.getKeyChar();
			    if(Character.isAlphabetic(n) || (Character.isWhitespace(n)))
			    {
			    	JOptionPane.showMessageDialog(null,"incorrect");
			    	e.consume();
			    }
			}
		});
		acctxt.setBounds(184, 96, 86, 20);
		eng.add(acctxt);
		acctxt.setColumns(10);
		
		JLabel konkani = new JLabel("Konkani:");
		konkani.setBounds(91, 140, 46, 14);
		eng.add(konkani);
		
		konktxt = new JTextField();
		konktxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char n=e.getKeyChar();
				if(Character.isAlphabetic(n) || (Character.isWhitespace(n)))
				{
					JOptionPane.showMessageDialog(null, "incorrect");
					e.consume();
				}
				
			}
		});
		konktxt.setBounds(184, 137, 86, 20);
		eng.add(konktxt);
		konktxt.setColumns(10);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int s1=Integer.parseInt(engtxt.getText());
			int s2=Integer.parseInt(acctxt.getText());
			int s3=Integer.parseInt(konktxt.getText());
			int total=s1+s2+s3;
			float avg=total/3;
			double percentage=(total*100)/300;
			//Object d = c.getSelectedItem();
			String d =c.getSeclectedItem();
		JOptionPane.showMessageDialog(null,"Name:"+nametxt.getText()+"\nEnglish:"+engtxt.getText()+"\nAccounts:"+acctxt.getText()+"\nKonkani:"+konktxt.getText()+"\nAverage:"+avg+"\nPercentage:"+percentage+d);
			}
		});
		submit.setBounds(292, 365, 89, 23);
		eng.add(submit);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			nametxt.setText(" ");	
			engtxt.setText(" ");
			acctxt.setText(" ");
			konktxt.setText(" ");
			}
		});
		btnNewButton.setBounds(396, 365, 89, 23);
		eng.add(btnNewButton);
		
		JLabel stream = new JLabel("Stream");
		stream.setBounds(91, 188, 46, 14);
		eng.add(stream);
		
		JComboBox c = new JComboBox();
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		c.setModel(new DefaultComboBoxModel(new String[] {"BCA", "BBA", "BA"}));
		c.setBounds(184, 184, 58, 31);
		eng.add(c);
	}
}
