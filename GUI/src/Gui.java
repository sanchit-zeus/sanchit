import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JButton button = new JButton("Submit");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}

}
