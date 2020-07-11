//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//
//	public class EventHandling implements ActionListener {
//		
//		JButton button;
//		
//		public void createAndShowGui() {
//			
//			JFrame frame = new JFrame();
//			button = new JButton("Submit");
//			
//			button.addActionListener(this);
//			
//			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			frame.add(button);
//			frame.setSize(400, 400);
//			frame.setVisible(true);
//			frame.setLocationRelativeTo(null);
//
//		}
//
//		@Override
//		public void actionPerformed(ActionEvent event) {
////			System.out.println("Information has been recorded");
//			button.setText("Information has been recorded");
//		}
//
//		public static void main(String args[]) {
//			EventHandling gui = new EventHandling();
//			gui.createAndShowGui();
//		}
//	}
