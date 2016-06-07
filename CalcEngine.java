/**
 * The main part of the calculator doing the calculations.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class CalcEngine {
	// The calculator's state is maintained in three fields:

	// The current value (to be) shown in the display.

	protected String calcString;
	private JulianDate jDate;
	private String operator;

	/**
	 * Create a CalcEngine.
	 */
	public CalcEngine() {
		clear();
	}

	/**
	 * @return The value that should currently be displayed on the calculator display.
	 */
	public String getDisplayValue() {
		return calcString;
	}

	public void clear() {
		calcString = "";
	}

	public void showWeekDay() {
		int[] date = getDateArray();
		calcString = new JulianDate(date[0], date[1], date[2]).checkWeekDay();
	}

	private int[] getDateArray() {
		String[] dateStrings = calcString.split("/");
		int[] date = new int[3];
		for (int i = 0; i <= 2; i++) {
			date[i] = Integer.parseInt(dateStrings[i]);
		}
		return date;
	}

	public void add() {
		int[] date = getDateArray();
		jDate = new JulianDate(date[0], date[1], date[2]);
		operator = "+";
		clear();
	}

	public void subtract() {
		int[] date = getDateArray();
		jDate = new JulianDate(date[0], date[1], date[2]);
		operator = "-";
		clear();
	}

	public void difference() {
		int[] date = getDateArray();
		jDate = new JulianDate(date[0], date[1], date[2]);
		operator = "dif";
		clear();
	}

	/**
	 * @return The title of this calculation engine.
	 */
	public String getTitle() {
		return "Java Calculator";
	}

	/**
	 * @return The author of this engine.
	 */
	public String getAuthor() {
		return "David J. Barnes and Michael Kolling";
	}

	/**
	 * @return The version number of this engine.
	 */
	public String getVersion() {
		return "Version 1.0";
	}

	public void calculateResult() {
		switch (operator) {
		case "+":
			JulianDate dateSum = new JulianDate(jDate.getJDate() + Integer.parseInt(calcString));
			calcString = "" + dateSum.getGregDay() + "/" + dateSum.getGregMonth() + "/" + dateSum.getGregYear();
			break;
		case "-":
			JulianDate dateSub = new JulianDate(jDate.getJDate() - Integer.parseInt(calcString));
			calcString = "" + dateSub.getGregDay() + "/" + dateSub.getGregMonth() + "/" + dateSub.getGregYear();
			break;
		case "dif" : int[] date = getDateArray();
					calcString = String.valueOf(jDate.daysDifference(date[0], date[1], date[2]));
		}
	}

	public void addToString(String c) {
		calcString += c;
	}
	/**
	 * Apply an operator.
	 * 
	 * @param operator
	 *            The operator to apply.
	 */

	/**
	 * Report an error in the sequence of keys that was pressed.
	 */

}
