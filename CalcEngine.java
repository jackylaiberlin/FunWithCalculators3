/**
 * The main part of the calculator doing the calculations.
 * 
 * @author  David J. Barnes and Michael Kolling 
 * @version 2008.03.30
 */
public class CalcEngine
{
    // The calculator's state is maintained in three fields:

    // The current value (to be) shown in the display.
    
    protected String calcString;

    /**
     * Create a CalcEngine.
     */
    public CalcEngine()
    {
        clear();
    }

    /**
     * @return The value that should currently be displayed
     * on the calculator display.
     */
    public String getDisplayValue()
    {
        return calcString;
    }

   
    public void clear()
    {
        calcString = "";
    }

    /**
     * @return The title of this calculation engine.
     */
    public String getTitle()
    {
        return "Java Calculator";
    }

    /**
     * @return The author of this engine.
     */
    public String getAuthor()
    {
        return "David J. Barnes and Michael Kolling";
    }

    /**
     * @return The version number of this engine.
     */
    public String getVersion()
    {
       return "Version 1.0";
    }

    public void calculateResult()
    {
    }
    public void addToString(String c){
    	calcString += c;
    }
    /**
     * Apply an operator.
     * @param operator The operator to apply.
     */

    /**
     * Report an error in the sequence of keys that was pressed.
     */

}
