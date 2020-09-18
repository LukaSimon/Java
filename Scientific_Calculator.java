package de.lukasimon.scientcalc;

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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class Scientific_Calculator {

	private JFrame frmStandardCalculator;
	private JTextField txtDisplay;

	JComboBox boxEinheit;
	JComboBox boxEinheit2;

	JLabel lblConverts;

	double firstNum, secondNum, result;
	String operation, answer;

	private JButton btn7;

	double[] i = new double[5];

	double milli_gramm = 0.001;
	double milli_kilo = 0.000001;
	double gramm_milli = 1000;
	double gramm_kilo = 0.001;
	double kilo_milli = 1000000;
	double kilo_gramm = 1000;

	private JTextField txtAusgang;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientific_Calculator window = new Scientific_Calculator();
					window.frmStandardCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Scientific_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.setTitle("Standard Calculator");
// 		frmStandardCalculator.setBounds(100, 100, 1200, 567);                         To test the functions you can open the calculator completely
	 	frmStandardCalculator.setBounds(100, 100, 418, 567);
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStandardCalculator.getContentPane().setLayout(null);

		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtDisplay.setBounds(10, 10, 378, 48);
		frmStandardCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);

		JButton btnNewButton = new JButton("\u2190");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String backSpace = null;

				if (txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backSpace = strB.toString();
					txtDisplay.setText(backSpace);
				}

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(10, 68, 68, 75);
		frmStandardCalculator.getContentPane().add(btnNewButton);

		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtDisplay.setText(null);

			}
		});
		btnCE.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCE.setBounds(88, 68, 68, 75);
		frmStandardCalculator.getContentPane().add(btnCE);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtDisplay.setText("");

			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(166, 68, 68, 75);
		frmStandardCalculator.getContentPane().add(btnC);

		JButton btnNeg = new JButton("\u00B1");
		btnNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnNeg.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNeg.setBounds(244, 68, 68, 75);
		frmStandardCalculator.getContentPane().add(btnNeg);

		JButton btnRoot = new JButton("\u221A");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sqrt(ops);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnRoot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRoot.setBounds(322, 68, 68, 75);
		frmStandardCalculator.getContentPane().add(btnRoot);

		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 153, 68, 75);
		frmStandardCalculator.getContentPane().add(btn7);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 238, 68, 75);
		frmStandardCalculator.getContentPane().add(btn4);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 412, 146, 75);
		frmStandardCalculator.getContentPane().add(btn0);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(88, 153, 68, 75);
		frmStandardCalculator.getContentPane().add(btn8);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(88, 238, 68, 75);
		frmStandardCalculator.getContentPane().add(btn5);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(166, 153, 68, 75);
		frmStandardCalculator.getContentPane().add(btn9);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(166, 238, 68, 75);
		frmStandardCalculator.getContentPane().add(btn6);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 323, 68, 75);
		frmStandardCalculator.getContentPane().add(btn1);

		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "/";

			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.setBounds(244, 153, 68, 75);
		frmStandardCalculator.getContentPane().add(btnDivide);

		JButton btnTimes = new JButton("*");
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "*";

			}
		});
		btnTimes.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTimes.setBounds(244, 238, 68, 75);
		frmStandardCalculator.getContentPane().add(btnTimes);

		JButton btnFraction = new JButton("1/x");
		btnFraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = 1 / ops;
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnFraction.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFraction.setBounds(322, 238, 68, 75);
		frmStandardCalculator.getContentPane().add(btnFraction);

		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "%";

			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercent.setBounds(320, 153, 68, 75);
		frmStandardCalculator.getContentPane().add(btnPercent);

		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				secondNum = Double.parseDouble(txtDisplay.getText());

				if (operation == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				if (operation == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				if (operation == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				if (operation == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				if (operation == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				if (operation == "%") {
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}

			}
		});
		btnEqual.setBounds(322, 323, 68, 164);
		frmStandardCalculator.getContentPane().add(btnEqual);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(88, 323, 68, 75);
		frmStandardCalculator.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(166, 323, 68, 75);
		frmStandardCalculator.getContentPane().add(btn3);

		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "-";

			}
		});
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubtract.setBounds(244, 323, 68, 75);
		frmStandardCalculator.getContentPane().add(btnSubtract);

		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = txtDisplay.getText() + btnPoint.getText();
				txtDisplay.setText(EnterNumber);

			}
		});
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPoint.setBounds(166, 412, 68, 75);
		frmStandardCalculator.getContentPane().add(btnPoint);

		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "+";

			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdd.setBounds(244, 412, 68, 75);
		frmStandardCalculator.getContentPane().add(btnAdd);

		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLog.setBounds(463, 68, 85, 75);
		frmStandardCalculator.getContentPane().add(btnLog);

		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sin(ops);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSin.setBounds(569, 68, 85, 75);
		frmStandardCalculator.getContentPane().add(btnSin);

		JButton btnSinh = new JButton("Sinh");
		btnSinh.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sinh(ops);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnSinh.setBounds(672, 67, 85, 75);
		frmStandardCalculator.getContentPane().add(btnSinh);

		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "Mod";

			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMod.setBounds(783, 67, 85, 75);
		frmStandardCalculator.getContentPane().add(btnMod);

		JButton btnPi = new JButton("\u03C0");
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = "3.141592653589";
				txtDisplay.setText(EnterNumber);

			}
		});
		btnPi.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPi.setBounds(463, 153, 85, 75);
		frmStandardCalculator.getContentPane().add(btnPi);

		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cos(ops);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCos.setBounds(569, 153, 85, 75);
		frmStandardCalculator.getContentPane().add(btnCos);

		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cosh(ops);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCosh.setBounds(672, 152, 85, 75);
		frmStandardCalculator.getContentPane().add(btnCosh);

		JButton btnlnx = new JButton("ln x");
		btnlnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log10(ops);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnlnx.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnlnx.setBounds(783, 152, 85, 75);
		frmStandardCalculator.getContentPane().add(btnlnx);

		JButton btnXtoY = new JButton("x^y");
		btnXtoY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.pow(ops, ops);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnXtoY.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnXtoY.setBounds(463, 238, 85, 75);
		frmStandardCalculator.getContentPane().add(btnXtoY);

		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tan(ops);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTan.setBounds(569, 238, 85, 75);
		frmStandardCalculator.getContentPane().add(btnTan);

		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tanh(ops);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTanh.setBounds(672, 237, 85, 75);
		frmStandardCalculator.getContentPane().add(btnTanh);

		JButton btnc = new JButton("Exp");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation = "Exp";

			}
		});
		btnc.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnc.setBounds(783, 237, 85, 75);
		frmStandardCalculator.getContentPane().add(btnc);

		JButton btnXSquare = new JButton("x^2");
		btnXSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * ops;
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnXSquare.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnXSquare.setBounds(463, 323, 85, 75);
		frmStandardCalculator.getContentPane().add(btnXSquare);

		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cbrt(ops);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnCbr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCbr.setBounds(569, 323, 85, 75);
		frmStandardCalculator.getContentPane().add(btnCbr);

		JButton btnRund = new JButton("Rund");
		btnRund.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.round(ops);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnRund.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnRund.setBounds(672, 322, 85, 75);
		frmStandardCalculator.getContentPane().add(btnRund);

		JButton btn2Pi = new JButton("2*\u03C0");
		btn2Pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops;
				ops = (3.141592653589793238462643 * 2);
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btn2Pi.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2Pi.setBounds(783, 322, 85, 75);
		frmStandardCalculator.getContentPane().add(btn2Pi);

		JButton btnX3 = new JButton("x^3");
		btnX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * ops * ops;
				txtDisplay.setText(String.valueOf(ops));

			}
		});
		btnX3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnX3.setBounds(463, 412, 85, 75);
		frmStandardCalculator.getContentPane().add(btnX3);

		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a, 2));

			}
		});
		btnBin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBin.setBounds(569, 412, 85, 75);
		frmStandardCalculator.getContentPane().add(btnBin);

		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a, 16));

			}
		});
		btnHex.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnHex.setBounds(672, 411, 85, 75);
		frmStandardCalculator.getContentPane().add(btnHex);

		JButton btnOctal = new JButton("Octal");
		btnOctal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toString(a, 8));

			}
		});
		btnOctal.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnOctal.setBounds(783, 411, 85, 75);
		frmStandardCalculator.getContentPane().add(btnOctal);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(0, 0, 0)));
		panel.setBounds(901, 22, 275, 465);
		frmStandardCalculator.getContentPane().add(panel);
		panel.setLayout(null);

		lblConverts = new JLabel("");
		lblConverts.setBounds(30, 264, 218, 64);
		lblConverts.setHorizontalAlignment(SwingConstants.CENTER);
		lblConverts.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.BLACK));
		lblConverts.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblConverts);

		JButton btnConvert = new JButton("Convert");
		btnConvert.setBounds(20, 338, 96, 77);
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (boxEinheit.getSelectedItem().equals("Milligramm")
						&& boxEinheit2.getSelectedItem().equals("Gramm")) {

					String cConvert = String.format("%.2f", Double.parseDouble(txtAusgang.getText()) * milli_gramm);
					lblConverts.setText(cConvert + "g");

				}
				if (boxEinheit.getSelectedItem().equals("Milligramm")
						&& boxEinheit2.getSelectedItem().equals("Kilogramm")) {

					String cConvert = String.format("%.2f", Double.parseDouble(txtAusgang.getText()) * milli_kilo);
					lblConverts.setText(cConvert + "kg");

				}
				if (boxEinheit.getSelectedItem().equals("Gramm")
						&& boxEinheit2.getSelectedItem().equals("Milligramm")) {

					String cConvert = String.format("%.2f", Double.parseDouble(txtAusgang.getText()) * gramm_milli);
					lblConverts.setText(cConvert + "mg");

				}
				if (boxEinheit.getSelectedItem().equals("Gramm")
						&& boxEinheit2.getSelectedItem().equals("Kilogramm")) {

					String cConvert = String.format("%.2f", Double.parseDouble(txtAusgang.getText()) * gramm_kilo);
					lblConverts.setText(cConvert + "kg");

				}
				if (boxEinheit.getSelectedItem().equals("Kilogramm")
						&& boxEinheit2.getSelectedItem().equals("Milligramm")) {

					String cConvert = String.format("%.2f", Double.parseDouble(txtAusgang.getText()) * kilo_milli);
					lblConverts.setText(cConvert + "mg");

				}
				if (boxEinheit.getSelectedItem().equals("Kilogramm")
						&& boxEinheit2.getSelectedItem().equals("Gramm")) {

					String cConvert = String.format("%.2f", Double.parseDouble(txtAusgang.getText()) * kilo_gramm);
					lblConverts.setText(cConvert + "g");

				}
				if(boxEinheit.getSelectedItem().equals(boxEinheit2.getSelectedItem()) && txtAusgang.getText() != "") {
					
					//String cConvert = String.format("%.2f", Double.parseDouble(txtAusgang.getText()));					
					lblConverts.setText("Das ist das Gleiche");
					
				}

			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(btnConvert);

		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(151, 338, 105, 77);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtAusgang.setText(null);
				boxEinheit.setModel(new DefaultComboBoxModel(new String[] { "\"Bitte w\u00E4hlen\"" }));
				boxEinheit2.setModel(new DefaultComboBoxModel(new String[] { "\"Bitte w\u00E4hlen\"" }));
				lblConverts.setText(null);

			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(btnClear);

		txtAusgang = new JTextField();
		txtAusgang.setBounds(20, 96, 96, 19);
		panel.add(txtAusgang);
		txtAusgang.setColumns(10);

		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(10, 10, 255, 22);
		panel.add(menuBar_1);

		JMenu mnNewMenu = new JMenu("Kategorie");
		menuBar_1.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Masse");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boxEinheit.setModel(new DefaultComboBoxModel(
						new String[] { "\"Bitte w\u00E4hlen\"", "Milligramm", "Gramm", "Kilogramm" }));
				boxEinheit2.setModel(new DefaultComboBoxModel(
						new String[] { "\"Bitte w\u00E4hlen\"", "Milligramm", "Gramm", "Kilogramm" }));

			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Strecke");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boxEinheit.setModel(new DefaultComboBoxModel(
						new String[] { "\"Bitte w\u00E4hlen\"", "Meter", "Zentimeter", "Millimeter" }));
				boxEinheit2.setModel(new DefaultComboBoxModel(
						new String[] { "\"Bitte w\u00E4hlen\"", "Meter", "Zentimeter", "Millimeter" }));

			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);

		boxEinheit = new JComboBox();
		boxEinheit.setModel(new DefaultComboBoxModel(new String[] { "\"Bitte w\u00E4hlen\"" }));
		boxEinheit.setBounds(131, 96, 117, 19);
		panel.add(boxEinheit);

		boxEinheit2 = new JComboBox();
		boxEinheit2.setModel(new DefaultComboBoxModel(new String[] { "\"Bitte w\u00E4hlen\"" }));
		boxEinheit2.setBounds(20, 141, 228, 19);
		panel.add(boxEinheit2);

		JMenuBar menuBar = new JMenuBar();
		frmStandardCalculator.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frmStandardCalculator.setTitle("Standard Calculator");
				frmStandardCalculator.setBounds(100, 100, 418, 567);
				txtDisplay.setBounds(10, 10, 386, 48);

			}
		});
		mnFile.add(mntmStandard);

		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frmStandardCalculator.setTitle("Scientific Calculator");
				frmStandardCalculator.setBounds(100, 100, 900, 567);
				txtDisplay.setBounds(10, 10, 858, 48);

			}
		});
		mnFile.add(mntmScientific);

		JMenuItem mntmConvert = new JMenuItem("Unit Converter");
		mntmConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frmStandardCalculator.setTitle("Unit Converter");
				frmStandardCalculator.setBounds(100, 100, 1200, 567);
				txtDisplay.setBounds(10, 10, 867, 48);

			}
		});
		mnFile.add(mntmConvert);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		mnFile.add(mntmExit);
	}
}
