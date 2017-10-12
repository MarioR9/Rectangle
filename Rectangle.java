import javax.swing.*;

/**Mario Rodriguez
Program will output Area and Perimeter
*/
public class Rectangle {
	public static void main(String []args){
	String L1 = JOptionPane.showInputDialog(null, "Enter Length of Rectangle");
	String W1 = JOptionPane.showInputDialog(null, "Enter Width of Rectangle");
	

	int Length = Integer.parseInt(L1);
	int Width = Integer.parseInt(W1);

	int Perimeter = 2*(Length+Width);
	int Area = Length*Width;

	JOptionPane.showMessageDialog(null,"The Parameter is : " + Perimeter + "\n" +"The Area is :" + Area);

	
	}

}


