import javax.swing.JOptionPane;

public class DuckDriver {

	public static void main(String[] args) {

		dog dug = new dog();
		for (int i = 0; i < 999999; i++) {

			String dogDoWhat = JOptionPane.showInputDialog("dog do WHAT?!?!??!!?");

			if (dogDoWhat.equals("wag")) {

				dug.wag();

			} else if (dogDoWhat.equals("bark")) {

				dug.bark();

			} else {

				JOptionPane.showMessageDialog(null,
						"YOUR DOG KILLS YOU OUT OF FRUSTRATION BECUASE IT DOESNT KNOW THAT COMAND!!!!!");

			}

		}

	}
}