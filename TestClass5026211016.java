import javax.swing.JOptionPane;

public class TestClass5026211016 {

    public static void main(String args[]) {
	        
	ComputeMethods5026211016 comp = new ComputeMethods5026211016();

	double fahrenheit;
	  fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Type a temperature in Fahrenheit:"));
	double celcius = comp.fToC(fahrenheit);
	  System.out.println("The temperature in celcius is " +celcius+ " degrees.");

	int a;
	  a = Integer.parseInt(JOptionPane.showInputDialog("Insert the value of a:"));
	int b;
	  b = Integer.parseInt(JOptionPane.showInputDialog("Insert the value of b:"));
	double c = comp.hypotenuse(a, b);
	  System.out.println("Hypotenuse is " +c+ " unit length.");

	comp.roll();
	System.out.println("The sum of the dice values is " +comp.roll());

    }
}
