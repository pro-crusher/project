package Lab_5;

public class Calculator_Model {

	public static boolean equals = false;
	public static int display = 0;
	public static float num1 = 0;;
	public static String lastOp = "";

	public Calculator_Model() {

	}

	/**
	 * @param display
	 */
	public Calculator_Model(int display) {
		this.display = display;
	}

	public static boolean isEquals() {
		return equals;
	}

	public static void setEquals(boolean equals) {
		Calculator_Model.equals = equals;
	}

	public int getDisplay() {
		return display;
	}

	public static void setDisplay(int display) {
		Calculator_Model.display = display;
	}

	public static float getNum1() {
		return num1;
	}

	public static void setNum1(float num1) {
		Calculator_Model.num1 = num1;
	}

	public static String getLastOp() {
		return lastOp;
	}

	public static void setLastOp(String lastOp) {
		Calculator_Model.lastOp = lastOp;
	}
	

	
	//**A FUNCTION TO REMEMBER THE LAST OPERAND**//
	
	public int operand(String lastOp) {
		if (lastOp.toString().equals("+"))
			return 1;
		else if (lastOp.toString().equals("-"))
			return 2;
		else if (lastOp.toString().equals("/"))
			return 3;
		else if (lastOp.toString().equals("X"))
			return 4;
		else if (lastOp.toString().equals("M"))
			return 5;
		return 0;

	}
	
	


}
