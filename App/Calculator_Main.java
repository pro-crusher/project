package Lab_5;

import Lab_5.Calculator_Controller;
import Lab_5.Calculator_Model;
import Lab_5.Calculator_View;

public class Calculator_Main {

	public static void main(String[] args) {
		

		Calculator_Model m = new Calculator_Model();
		Calculator_View v = new Calculator_View();
		new Calculator_Controller(m, v);

	}

}
