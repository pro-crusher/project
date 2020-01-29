package Lab_5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Lab_5.Calculator_Model;
import Lab_5.Calculator_View;

public class Calculator_Controller {
	
	//**** Creating Model and the View ****//
	
	public Calculator_Model m;
	public Calculator_View v;
	

	public Calculator_Controller(Calculator_Model m, Calculator_View v) {
		this.m = m;
		this.v = v;
		
		//**** ALL THE ACTION LISTENER FOR NUMBER BUTTONS ****//

		this.v.getB0().addActionListener(new numberListener());
		this.v.getB1().addActionListener(new numberListener());
		this.v.getB2().addActionListener(new numberListener());
		this.v.getB3().addActionListener(new numberListener());
		this.v.getB4().addActionListener(new numberListener());
		this.v.getB5().addActionListener(new numberListener());
		this.v.getB6().addActionListener(new numberListener());
		this.v.getB7().addActionListener(new numberListener());
		this.v.getB8().addActionListener(new numberListener());
		this.v.getB9().addActionListener(new numberListener());

		this.v.getBclear().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator_Model.setNum1(0);
				Calculator_Model.setEquals(false);
				Calculator_Model.setDisplay(0);
				v.getDisplay().setText("0");
			}
		});

		this.v.getBplus().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOp("+");
			}
		});

		this.v.getBminus().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOp("-");
			}
		});

		this.v.getBtimes().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOp("X");
			}
		});

		this.v.getBdivide().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOp("/");
			}
		});

		this.v.getBmod().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOp("M");
			}
		});

		this.v.getBdecimal().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (v.getDisplay().getText().indexOf(".") == -1) {
					v.getDisplay().setText(v.getDisplay().getText() + ".");
				}
			}
		});

		this.v.getBequals().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!Calculator_Model.getLastOp().equals("")) {
					setNum1();
					if (!((Calculator_Model.getNum1() - (int) Calculator_Model.getNum1()) == 0)) {
						v.getDisplay().setText(String.valueOf(Calculator_Model.getNum1()));
					} else {
						v.getDisplay().setText(String.valueOf((int) Calculator_Model.getNum1()));
					}
					Calculator_Model.setLastOp("");
					Calculator_Model.setEquals(true);
				}
			}
		});
		
		
		//**COMMON ACTIONLISTENER FOR THE NUMBERS**//

	}

	public class numberListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String str = ((JButton) e.getSource()).getText();
			if (v.getDisplay().getText().length() < 12 && Calculator_Model.isEquals() == false) {

				if (str.equals("0")) {
					if (!v.getDisplay().getText().equals("0")) {
						v.getDisplay().setText(v.getDisplay().getText() + "0");
					}
				} else
					setDisplay(str);
			}
		}
	}
	
	//**A FUNCTION TO SET THE DISPLAY**//

		public void setDisplay(String x) {
			if (v.getDisplay().getText().length() < 12 && Calculator_Model.isEquals() == false) {
				if (v.getDisplay().getText().equals("0")) {
					v.getDisplay().setText(x);
				} else {
					v.getDisplay().setText(v.getDisplay().getText() + x);
				}
			}
		}
		
		
		//**A FUNCTION FOR SET THE NUM**//

		

		public void setNum1() {
			switch (m.operand(Calculator_Model.getLastOp())) {
			case 1:
				Calculator_Model.setNum1(Calculator_Model.getNum1() + Float.parseFloat(v.getDisplay().getText()));
				break;
			case 2:
				Calculator_Model.setNum1(Calculator_Model.getNum1() - Float.parseFloat(v.getDisplay().getText()));
				break;
			case 3:
				Calculator_Model.setNum1(Calculator_Model.getNum1() / Float.parseFloat(v.getDisplay().getText()));
				break;
			case 4:
				Calculator_Model.setNum1(Calculator_Model.getNum1() * Float.parseFloat(v.getDisplay().getText()));
				break;
			case 5:
				Calculator_Model.setNum1(Calculator_Model.getNum1() % Float.parseFloat(v.getDisplay().getText()));
			}
		}

		
		/**
		 * Get operation from action listener
		 * @param x: String
		 */
		public void setOp(String x) {
			if (!Calculator_Model.isEquals()) {
				if (Calculator_Model.getLastOp().equals("")) {
					Calculator_Model.setNum1(Calculator_Model.getNum1()+ Float.parseFloat(v.getDisplay().getText()));
				} else if (v.getDisplay().getText().equals("0")) {

				} else {
					setNum1();
				}
			}
			Calculator_Model.setLastOp(x);
			v.getDisplay().setText("0");
			Calculator_Model.setEquals(false);
		}
	

}
