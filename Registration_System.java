package de.lukasimon.regsys;

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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class Registration_System extends JFrame {

	private JPanel contentPane;
	private JTextField txtVorname;
	private JTextField txtNachname;
	private JTextField txtAlter;
	private JTextField txtAdresse;
	private JTextField txtPlz;
	private JTextField txtTel;
	private JTextField txtDatum;

	private JFrame frame;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_System frame = new Registration_System();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Registration_System() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBounds(10, 10, 1366, 700);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel Titel = new JPanel();
		Titel.setLayout(null);
		Titel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		Titel.setBackground(new Color(176, 224, 230));
		Titel.setBounds(29, 28, 1300, 87);
		panel.add(Titel);

		JLabel lblTitel = new JLabel("Registration");
		lblTitel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblTitel.setBounds(10, 10, 1280, 62);
		Titel.add(lblTitel);

		JPanel Enter_Info = new JPanel();
		Enter_Info.setLayout(null);
		Enter_Info.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		Enter_Info.setBackground(new Color(176, 224, 230));
		Enter_Info.setBounds(29, 125, 539, 397);
		panel.add(Enter_Info);

		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVorname.setBounds(31, 38, 144, 32);
		Enter_Info.add(lblVorname);

		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNachname.setBounds(31, 69, 127, 32);
		Enter_Info.add(lblNachname);

		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdresse.setBounds(31, 129, 127, 32);
		Enter_Info.add(lblAdresse);

		JLabel lblAlter = new JLabel("Alter");
		lblAlter.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAlter.setBounds(31, 98, 127, 32);
		Enter_Info.add(lblAlter);

		JLabel lblGeschlecht = new JLabel("Geschlecht");
		lblGeschlecht.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGeschlecht.setBounds(31, 248, 127, 32);
		Enter_Info.add(lblGeschlecht);

		JLabel lblDatum = new JLabel("Datum");
		lblDatum.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDatum.setBounds(31, 217, 137, 32);
		Enter_Info.add(lblDatum);

		JLabel lblTel = new JLabel("Telefon");
		lblTel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTel.setBounds(31, 188, 127, 32);
		Enter_Info.add(lblTel);

		JLabel lblPlz = new JLabel("Postleitzahl");
		lblPlz.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPlz.setBounds(31, 159, 127, 32);
		Enter_Info.add(lblPlz);

		JLabel lblNat = new JLabel("Nationalit\u00E4t");
		lblNat.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNat.setBounds(31, 309, 144, 32);
		Enter_Info.add(lblNat);

		JLabel lblAbschluss = new JLabel("Abschluss");
		lblAbschluss.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAbschluss.setBounds(31, 278, 127, 32);
		Enter_Info.add(lblAbschluss);

		txtVorname = new JTextField();
		txtVorname.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtVorname.setBounds(220, 49, 247, 19);
		Enter_Info.add(txtVorname);
		txtVorname.setColumns(10);

		txtNachname = new JTextField();
		txtNachname.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtNachname.setColumns(10);
		txtNachname.setBounds(220, 80, 247, 19);
		Enter_Info.add(txtNachname);

		txtAlter = new JTextField();
		txtAlter.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtAlter.setColumns(10);
		txtAlter.setBounds(220, 109, 247, 19);
		Enter_Info.add(txtAlter);

		txtAdresse = new JTextField();
		txtAdresse.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtAdresse.setColumns(10);
		txtAdresse.setBounds(220, 140, 247, 19);
		Enter_Info.add(txtAdresse);

		txtPlz = new JTextField();
		txtPlz.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtPlz.setColumns(10);
		txtPlz.setBounds(220, 170, 247, 19);
		Enter_Info.add(txtPlz);

		txtTel = new JTextField();
		txtTel.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtTel.setColumns(10);
		txtTel.setBounds(220, 199, 247, 19);
		Enter_Info.add(txtTel);

		txtDatum = new JTextField();
		txtDatum.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtDatum.setColumns(10);
		txtDatum.setBounds(220, 228, 247, 19);
		Enter_Info.add(txtDatum);

		JComboBox boxGeschlecht = new JComboBox();
		boxGeschlecht.setModel(new DefaultComboBoxModel(
				new String[] { "\"Bitte w\u00E4hlen\"", "M\u00E4nnlich", "Weiblich", "Sonstiges" }));
		boxGeschlecht.setBounds(220, 258, 248, 21);
		Enter_Info.add(boxGeschlecht);

		JComboBox boxAbschluss = new JComboBox();
		boxAbschluss.setModel(new DefaultComboBoxModel(new String[] { "\"Bitte w\u00E4hlen\"", "Abitur",
				"Erweiterter Realschulabschluss", "Allgemeine Hochschulreife", "Ausbildung" }));
		boxAbschluss.setBounds(220, 288, 248, 21);
		Enter_Info.add(boxAbschluss);

		JComboBox boxNat = new JComboBox();
		boxNat.setModel(new DefaultComboBoxModel(
				new String[] { "\"Bitte w\u00E4hlen\"", "Deutsch", "Englisch", "Franz\u00F6sisch", "Spanisch" }));
		boxNat.setBounds(219, 319, 248, 21);
		Enter_Info.add(boxNat);

		JPanel Informationen = new JPanel();
		Informationen.setLayout(null);
		Informationen.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		Informationen.setBackground(new Color(176, 224, 230));
		Informationen.setBounds(581, 125, 748, 397);
		panel.add(Informationen);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 24, 698, 348);
		Informationen.add(scrollPane);

		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setModel(new DefaultTableModel(
				new Object[][] { { "Vorname", "Nachname", "Alter", "Adresse", "Postleitzahl", "Telefon", "Datum",
						"Geschlecht", "Abschlus", "Nationalit" }, },
				new String[] { "Vorname", "Nachnema", "Alter", "Adresse", "Postleitzahl", "Telefon", "Datum", "ID",
						"Type", "Amount" }));
		table.getColumnModel().getColumn(2).setPreferredWidth(30);
		table.getColumnModel().getColumn(3).setPreferredWidth(85);
		table.getColumnModel().getColumn(4).setPreferredWidth(63);
		table.getColumnModel().getColumn(6).setPreferredWidth(60);
		table.getColumnModel().getColumn(7).setPreferredWidth(58);
		table.getColumnModel().getColumn(8).setPreferredWidth(74);
		table.getColumnModel().getColumn(9).setPreferredWidth(54);
		scrollPane.setColumnHeaderView(table);

		JPanel Optionen = new JPanel();
		Optionen.setLayout(null);
		Optionen.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		Optionen.setBackground(new Color(176, 224, 230));
		Optionen.setBounds(29, 543, 1300, 122);
		panel.add(Optionen);

		JButton btnExit = new JButton("Schlie\u00DFen");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Zum Schlie\u00DFen best\u00E4tigen", "Registration",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}

			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(1020, 24, 230, 63);
		Optionen.add(btnExit);

		JButton btnDelete = new JButton("L\u00F6schen");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 1) {

						JOptionPane.showMessageDialog(null, "Keine Daten vorhanden", "Registration",
								JOptionPane.OK_OPTION);

					} else {

						JOptionPane.showMessageDialog(null, "W\u00E4hle eine Reihe", "Registration",
								JOptionPane.OK_OPTION);

					}
				} else {

					model.removeRow(table.getSelectedRow());

				}

			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(745, 24, 214, 63);
		Optionen.add(btnDelete);

		JButton btnHinzu = new JButton("Hinzuf\u00FCgen");
		btnHinzu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {

						txtVorname.getText(), txtNachname.getText(), txtAlter.getText(), txtAdresse.getText(),
						txtPlz.getText(), txtTel.getText(), txtDatum.getText(), boxGeschlecht.getSelectedItem(),
						boxAbschluss.getSelectedItem(), boxNat.getSelectedItem(),

				});

				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 1) {
						JOptionPane.showMessageDialog(null, "Best\u00E4tigt", "Registration", JOptionPane.OK_OPTION);
					}
				}

			}
		});
		btnHinzu.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnHinzu.setBounds(24, 24, 230, 63);
		Optionen.add(btnHinzu);

		JButton btnReset = new JButton("Zur\u00FCcksetzen");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtAdresse.setText("");
				txtDatum.setText("");
				txtNachname.setText("");
				txtAlter.setText("");
				txtPlz.setText("");
				txtVorname.setText("");
				txtTel.setText("");
				boxNat.setSelectedItem("\"Bitte w\u00E4hlen\"");
				boxGeschlecht.setSelectedItem("\"Bitte w\u00E4hlen\"");
				boxAbschluss.setSelectedItem("\"Bitte w\u00E4hlen\"");

			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(293, 24, 237, 63);
		Optionen.add(btnReset);

		JButton btnDrucken = new JButton("Drucken");
		btnDrucken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {

					table.print();

				} catch (java.awt.print.PrinterException e) {

					System.err.format("No Printer found", e.getMessage());

				}

			}
		});
		btnDrucken.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDrucken.setBounds(566, 24, 135, 63);
		Optionen.add(btnDrucken);
	}
}