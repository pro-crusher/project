package Lab_5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Calculator_View extends JFrame {

	private JPanel contentPane;
	
	private static JLabel display = new JLabel();
	private JPanel dPan = new JPanel();
	private JButton b1 = new JButton("1");
	private JButton b2 = new JButton("2");
	private JButton b3 = new JButton("3");
	private JButton b4 = new JButton("4");
	private JButton b5 = new JButton("5");
	private JButton b6 = new JButton("6");
	private JButton b7 = new JButton("7");
	private JButton b8 = new JButton("8");
	private JButton b9 = new JButton("9");
	private JButton b0 = new JButton("0");
	private JButton bplus = new JButton("+");
	private JButton bminus = new JButton("-");
	private JButton btimes = new JButton("X");
	private JButton bdivide = new JButton("/");
	private JButton bmod = new JButton("M");
	private JButton bclear = new JButton("C");
	private JButton bequals = new JButton("=");
	private JButton bdecimal = new JButton(".");

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_View frame = new Calculator_View();
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
	public Calculator_View() {
		this.setTitle("Calculator");
		this.setSize(286, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		this.setResizable(false);
		this.setBackground(Color.ORANGE);

		bclear.setForeground(Color.RED);
		bequals.setPreferredSize(new Dimension(50, 110));
		b0.setPreferredSize(new Dimension(110, 50));

		display.setBounds(5, 5, 270, 40);

		display.setFont(new Font("OCR A Std", 1, 20));
		display.setForeground(Color.GREEN);
		display.setBackground(Color.BLACK);
		display.setText("0");
		display.setOpaque(true);
		getContentPane().add(display);
		display.setHorizontalAlignment(JLabel.RIGHT);

		// Set buttons using absolute positionning
		b0.setBounds(5, 215, 105, 50);
		b1.setBounds(5, 160, 50, 50);
		b2.setBounds(60, 160, 50, 50);
		b3.setBounds(115, 160, 50, 50);
		btimes.setBounds(170, 160, 50, 50);
		bequals.setBounds(225, 160, 50, 105);
		bdecimal.setBounds(115, 215, 50, 50);
		bdivide.setBounds(170, 215, 50, 50);
		b4.setBounds(5, 105, 50, 50);
		b5.setBounds(60, 105, 50, 50);
		b6.setBounds(115, 105, 50, 50);
		bminus.setBounds(170, 105, 50, 50);
		bmod.setBounds(225, 105, 50, 50);
		b7.setBounds(5, 50, 50, 50);
		b8.setBounds(60, 50, 50, 50);
		b9.setBounds(115, 50, 50, 50);
		bplus.setBounds(170, 50, 50, 50);
		bclear.setBounds(225, 50, 50, 50);
		
		getContentPane().add(b0);
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		getContentPane().add(btimes);
		getContentPane().add(bequals);
		getContentPane().add(bdecimal);
		getContentPane().add(bdivide);
		getContentPane().add(b4);
		getContentPane().add(b5);
		getContentPane().add(b6);
		getContentPane().add(bminus);
		getContentPane().add(bmod);
		getContentPane().add(b7);
		getContentPane().add(b8);
		getContentPane().add(b9);
		getContentPane().add(bplus);
		getContentPane().add(bclear);
		getContentPane().add(display);
		this.setVisible(true);

	}

	protected JButton getB2() {
		return b2;
	}
	protected JButton getBplus() {
		return bplus;
	}
	protected JButton getB4() {
		return b4;
	}
	protected JButton getBdivide() {
		return bdivide;
	}
	protected JButton getBmod() {
		return bmod;
	}
	protected JButton getBtimes() {
		return btimes;
	}
	protected JButton getB5() {
		return b5;
	}
	protected JButton getBminus() {
		return bminus;
	}
	protected JButton getBdecimal() {
		return bdecimal;
	}
	protected JButton getB3() {
		return b3;
	}
	protected JButton getB9() {
		return b9;
	}
	protected JButton getB1() {
		return b1;
	}
	protected JLabel getDisplay() {
		return display;
	}
	protected JButton getB7() {
		return b7;
	}
	protected JButton getB6() {
		return b6;
	}
	protected JButton getBequals() {
		return bequals;
	}
	protected JButton getB8() {
		return b8;
	}
	protected JButton getBclear() {
		return bclear;
	}
	protected JButton getB0() {
		return b0;
	}
}
