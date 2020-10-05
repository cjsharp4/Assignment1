package cse360assignment02;

/**
* Simple program to help us understand git and github repositories
* 
*
* @author  Carson Sharp
* @version 1.0
* @since   2020-10-05 
*/
public class AddingMachine {
  private int total;
  private String str = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value; //adds value to overall total
	  str = str + " + " + value;
  }

  public void subtract (int value) {
	  total = total - value; //subtracts value from overall total
	  str = str + " - " + value;
  }

  public String toString () {
    return str; //returns history of transactions
  }

  public void clear() {
	  str = "0"; //clears transactions and resets toString to 0
  }
}