package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator_SWING implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JPanel panel_2;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	
	String txt1,txt2="",txt3;
	
	int n1,n2,n3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_SWING window = new Calculator_SWING();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator_SWING() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 400);
		frame.setTitle("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(10);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 3, 0, 0));

		btnNewButton = new JButton("0");
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);

		btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(this);
		panel.add(btnNewButton_1);

		btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(this);
		panel.add(btnNewButton_2);

		btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(this);
		panel.add(btnNewButton_3);

		btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(this);
		panel.add(btnNewButton_4);

		btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(this);
		panel.add(btnNewButton_5);

		btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(this);
		panel.add(btnNewButton_6);

		btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(this);
		panel.add(btnNewButton_7);

		btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(this);
		panel.add(btnNewButton_8);

		btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(this);
		panel.add(btnNewButton_9);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));

		btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(this);
		panel_1.add(btnNewButton_12);

		btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(this);
		panel_1.add(btnNewButton_13);

		btnNewButton_14 = new JButton("/");
		panel_1.add(btnNewButton_14);

		btnNewButton_15 = new JButton("*");
		panel_1.add(btnNewButton_15);

		btnNewButton_16 = new JButton("=");
		btnNewButton_16.addActionListener(this);
		panel_1.add(btnNewButton_16);

		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);

		btnNewButton_10 = new JButton("Exit");
		btnNewButton_10.addActionListener(this);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		panel_2.add(btnNewButton_10);

		btnNewButton_11 = new JButton("Clear");
		btnNewButton_11.addActionListener(this);
		panel_2.add(btnNewButton_11);

	}

	public void actionPerformed(ActionEvent e) {

		

		
		txt1=textField.getText();
		
		switch(e.getActionCommand()) {
		
		case "1": txt1=txt1+"1";
		          textField.setText(txt1);
			break;
		case "2": txt1=txt1+"2";
		textField.setText(txt1);
			break;
		case "3": txt1=txt1+"3";
		textField.setText(txt1);
			break;
		case "4": txt1=txt1+"4";
		textField.setText(txt1);
			break;
		case "5": txt1=txt1+"5";
		textField.setText(txt1);
			break;
		case "6": txt1=txt1+"6";
		textField.setText(txt1);
			break;
		case "7": txt1=txt1+"7";
		textField.setText(txt1);
			break;
		case "8": txt1=txt1+"8";
		textField.setText(txt1);
			break;
		case "9": txt1=txt1+"9";
		textField.setText(txt1);
			break;
		case "0": txt1=txt1+"0";
		textField.setText(txt1);
			break;
		case "+": txt2=textField.getText();
		textField.setText("");
		
			break;
		case "=": txt3=textField.getText();
		n1=Integer.parseInt(txt2);
		n2=Integer.parseInt(txt3);
		n3=n1+n2;
		textField.setText(""+n3);
		
			break;
		case "Clear": 
			textField.setText("");
			break;
			
		case "Exit":
			System.exit(0);
			break;
		
			
		}
		
		
	}
	
	
}
