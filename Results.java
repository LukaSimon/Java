package de.lukasimon.results;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Your_results {

	private JFrame frmYour_project;
	private JTextField txtFirstname;
	private JTextField txtLastname;
	private JTextField txtAge;
	private JTextField txtExample;
	private JTextField txtExample_1;
	private JTextField txtExample_2;
	private JTextField txtExample_3;
	private JTextField txtExample_9;
	private JTextField txtExample_6;
	private JTextField txtExample_5;
	private JTextField txtExample_4;
	private JTextField txtExample_10;
	private JTextField txtSemi;
	private JTextField txtExample_7;
	private JTable table;
	
	private JFrame frame1;

	double Total, averages;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Your_results window = new Your_results();
					window.frmYour_project.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Your_results() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmYour_project = new JFrame();
		frmYour_project.setTitle("Your_project");
		frmYour_project.setBounds(100, 100, 1400, 794);
		frmYour_project.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmYour_project.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 8), "Enter results", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 10, 688, 357);
		frmYour_project.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblFirstname = new JLabel("Firstname");
		lblFirstname.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblFirstname.setBounds(24, 34, 144, 26);
		panel.add(lblFirstname);  
		
		txtFirstname = new JTextField();
		txtFirstname.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtFirstname.setBounds(178, 34, 156, 26);
		panel.add(txtFirstname);
		txtFirstname.setColumns(10);
		
		JLabel lblLastname = new JLabel("Lastname");
		lblLastname.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblLastname.setBounds(24, 70, 144, 26);
		panel.add(lblLastname);
		
		txtLastname = new JTextField();
		txtLastname.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtLastname.setColumns(10);
		txtLastname.setBounds(178, 70, 156, 26);
		panel.add(txtLastname);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAge.setBounds(24, 106, 144, 26);
		panel.add(lblAge);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtAge.setColumns(10);
		txtAge.setBounds(178, 106, 156, 26);
		panel.add(txtAge);
		
		JLabel lblExample = new JLabel("Example");
		lblExample.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblExample.setBounds(355, 34, 120, 26);
		panel.add(lblExample);
		
		txtExample = new JTextField();
		txtExample.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtExample.setColumns(10);
		txtExample.setBounds(509, 34, 156, 26);
		panel.add(txtExample);
		
		JLabel lblExample_1 = new JLabel("Example_1");
		lblExample_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblExample_1.setBounds(355, 70, 120, 26);
		panel.add(lblExample_1);
		
		txtExample_1 = new JTextField();
		txtExample_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtExample_1.setColumns(10);
		txtExample_1.setBounds(509, 70, 156, 26);
		panel.add(txtExample_1);
		
		JLabel lblExample_2 = new JLabel("Example_2");
		lblExample_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblExample_2.setBounds(355, 106, 120, 26);
		panel.add(lblExample_2);
		
		txtExample_2 = new JTextField();
		txtExample_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtExample_2.setColumns(10);
		txtExample_2.setBounds(509, 106, 156, 26);
		panel.add(txtExample_2);
		
		JLabel lblExample_3 = new JLabel("Example_3");
		lblExample_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblExample_3.setBounds(355, 142, 144, 26);
		panel.add(lblExample_3);
		
		txtExample_3 = new JTextField();
		txtExample_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtExample_3.setColumns(10);
		txtExample_3.setBounds(509, 142, 156, 26);
		panel.add(txtExample_3);
		
		JLabel lblExample_9 = new JLabel("Example_9");
		lblExample_9.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblExample_9.setBounds(355, 286, 120, 26);
		panel.add(lblExample_9);
		
		txtExample_9 = new JTextField();
		txtExample_9.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtExample_9.setColumns(10);
		txtExample_9.setBounds(509, 286, 156, 26);
		panel.add(txtExample_9);
		
		JLabel lblExample_6 = new JLabel("Example_6");
		lblExample_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblExample_6.setBounds(355, 250, 144, 26);
		panel.add(lblExample_6);
		
		txtExample_6 = new JTextField();
		txtExample_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtExample_6.setColumns(10);
		txtExample_6.setBounds(509, 250, 156, 26);
		panel.add(txtExample_6);
		
		txtExample_5 = new JTextField();
		txtExample_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtExample_5.setColumns(10);
		txtExample_5.setBounds(509, 214, 156, 26);
		panel.add(txtExample_5);
		
		JLabel lblExample_5 = new JLabel("Example_5");
		lblExample_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblExample_5.setBounds(355, 214, 120, 26);
		panel.add(lblExample_5);
		
		JLabel lblExample_4 = new JLabel("Example_4");
		lblExample_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblExample_4.setBounds(355, 178, 120, 26);
		panel.add(lblExample_4);
		
		txtExample_4 = new JTextField();
		txtExample_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtExample_4.setColumns(10);
		txtExample_4.setBounds(509, 178, 156, 26);
		panel.add(txtExample_4);
		
		JLabel lblExample_10 = new JLabel("Example_10");
		lblExample_10.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblExample_10.setBounds(24, 286, 120, 26);
		panel.add(lblExample_10);
		
		txtExample_10 = new JTextField();
		txtExample_10.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtExample_10.setColumns(10);
		txtExample_10.setBounds(178, 286, 156, 26);
		panel.add(txtExample_10);
		
		txtSemi = new JTextField();
		txtSemi.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtSemi.setColumns(10);
		txtSemi.setBounds(178, 250, 156, 26);
		panel.add(txtSemi);
		
		txtExample_7 = new JTextField();
		txtExample_7.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtExample_7.setColumns(10);
		txtExample_7.setBounds(178, 214, 156, 26);
		panel.add(txtExample_7);
		
		JLabel lblAverage = new JLabel("Example_8");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblAverage.setBounds(24, 250, 156, 26);
		panel.add(lblAverage);
		
		JLabel lblExample_7 = new JLabel("Example_7");
		lblExample_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblExample_7.setBounds(24, 214, 144, 26);
		panel.add(lblExample_7);
		
		JLabel lblSelect = new JLabel("Select");
		lblSelect.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblSelect.setBounds(24, 142, 170, 26);
		panel.add(lblSelect);
		
		JComboBox boxSelect = new JComboBox();
		boxSelect.setFont(new Font("Tahoma", Font.BOLD, 16));
		boxSelect.setModel(new DefaultComboBoxModel(new String[] {"\"Choose\"", "5.", "6.", "7.", "8.", "9.", "10.", "11.", "12.", "13."}));
		boxSelect.setBounds(178, 142, 156, 26);
		panel.add(boxSelect);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 193, 311, 11);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 8), "Results", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(720, 10, 656, 357);
		frmYour_project.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea txtConveyed = new JTextArea();
		txtConveyed.setBounds(23, 21, 611, 314);
		panel_1.add(txtConveyed);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		table.setBorder(new LineBorder(new Color(64, 64, 64), 2));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Firstname", "Lastname", "Age", "Select", "Example", "Example_1", "Example_2", "Example_3", "Example_4", "Example_5", "Example_6", "Example_7", "Example_8", "Example_9", "Total", "Average", "Example_10"},
			},
			new String[] {
				"Firstname", "Firstname", "Age", "Select", "Example", "Example_1", "Example_2", "Example_3", "Example_4", "Example_5", "Geschichne", "Example_7", "Example_8", "Example_9", "Total", "Average", "Example_10"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(48);
		table.getColumnModel().getColumn(11).setPreferredWidth(46);
		table.getColumnModel().getColumn(13).setPreferredWidth(43);
		table.getColumnModel().getColumn(14).setPreferredWidth(68);
		table.setBounds(10, 377, 1366, 176);
		frmYour_project.getContentPane().add(table);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 573, 1366, 2);
		frmYour_project.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {

						txtFirstname.getText(), txtLastname.getText(), txtAge.getText(), boxSelect.getSelectedItem(), txtExample.getText(), txtExample_1.getText(), 
						txtExample_2.getText(), txtExample_3.getText(), txtExample_4.getText(), txtExample_5.getText(), txtExample_6.getText(), txtExample_7.getText(), txtSemi.getText(),
						txtExample_9.getText(),
						
						Total = Double.parseDouble(String.valueOf(txtExample_4.getText())) + Double.parseDouble(String.valueOf(txtExample_5.getText())) + Double.parseDouble(String.valueOf(txtExample_6.getText()))
						+ Double.parseDouble(String.valueOf(txtExample_9.getText())) + Double.parseDouble(String.valueOf(txtExample_3.getText())) + Double.parseDouble(String.valueOf(txtExample_2.getText())) 
						+ Double.parseDouble(String.valueOf(txtExample_1.getText())) + Double.parseDouble(String.valueOf(txtExample.getText())) + Double.parseDouble(String.valueOf(txtExample_7.getText()))
						+ Double.parseDouble(String.valueOf(txtSemi.getText())), 
												
						averages = Total / 10, txtExample_10.getText()

				});
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(10, 603, 234, 79);
		frmYour_project.getContentPane().add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 1) {

						JOptionPane.showMessageDialog(null, "No data ", "Registration",
								JOptionPane.OK_OPTION);

					} else {

						JOptionPane.showMessageDialog(null, "Choose a collum", "Registration",
								JOptionPane.OK_OPTION);

					}
				} else {

					model.removeRow(table.getSelectedRow());

				}
				
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDelete.setBounds(303, 603, 234, 79);
		frmYour_project.getContentPane().add(btnDelete);
		
		JButton btnTranscript = new JButton("Convey");
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtConveyed.append("Results\n"
						+ "=================================================="
						+ "\nExample:\t\t\t" + txtExample.getText()
						+ "\nExample_1:\t\t\t" + txtExample_1.getText()
						+ "\nExample_2:\t\t\t" + txtExample_2.getText()
						+ "\nExample_3:\t\t\t" + txtExample_3.getText()
						+ "\nExample_4:\t\t\t" + txtExample_4.getText()
						+ "\nExample_5:\t\t\t" + txtExample_5.getText()
						+ "\nExample_6:\t\t\t" + txtExample_6.getText()
						+ "\nExample_7:\t\t\t" + txtExample_7.getText()
						+ "\nExample_8:\t\t\t" + txtSemi.getText()
						+ "\nExample_9:\t\t\t" + txtExample_9.getText()
						+ "\n=================================================="
						+ "\nExample_10\t\t\t" + txtExample_10.getText()
						+ "\nTotal:\t\t\t" + Total
						+ "\nAverage:\t\t\t" + averages + "\n"
						
						);
				
			}
		});
		btnTranscript.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnTranscript.setBounds(595, 603, 234, 79);
		frmYour_project.getContentPane().add(btnTranscript);
		
		JButton btnExit = new JButton("Close");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame1 = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmYour_project, "Confirm to exit", "Your_results", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setBounds(1142, 603, 234, 79);
		frmYour_project.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtFirstname.setText(null);
				txtLastname.setText(null);
				txtAge.setText(null);
				boxSelect.setSelectedItem("\"Choose\"");
				txtExample.setText(null);
				txtExample_1.setText(null);
				txtExample_2.setText(null);				
				txtExample_3.setText(null);
				txtExample_4.setText(null);
				txtExample_5.setText(null);
				txtExample_6.setText(null);
				txtExample_7.setText(null);
				txtSemi.setText(null);
				txtExample_9.setText(null);
				txtExample_10.setText(null);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReset.setBounds(869, 603, 234, 79);
		frmYour_project.getContentPane().add(btnReset);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 714, 1366, 2);
		frmYour_project.getContentPane().add(separator_1_1);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {

					txtConveyed.print();

				} catch (java.awt.print.PrinterException e) {

					System.err.format("No Printer found", e.getMessage());

				}
				
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrint.setBounds(20, 720, 102, 27);
		frmYour_project.getContentPane().add(btnPrint);
	}
}
