import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

//1. Added components to our JFrame
//2. We can also add graphics but Not to JFrame - need to use JPanel

public class Rectangle extends JPanel {
	
	JFrame frame;
	
	public void fireUpScreen() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(this);
	}
	
	public void paintComponent(Graphics g) {
		//paint component is the method used to paint - think of JPanel as our canvas
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 200, 100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle go = new Rectangle();
		go.fireUpScreen();

	}

}
