//import java.awt.BorderLayout;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//
//public class KeyListenersTutorial extends JFrame implements KeyListener 
//{
//	private static final long serialVersionUID = 1L;
//	JTextField keyText = new JTextField(80);
//	JLabel keyLabel = new JLabel("Press fire Button");
//	
//	KeyListenersTutorial()
//	{	
//		keyText.addKeyListener(this);
//		setSize(400,400);
//		setVisible(true);
//		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		BorderLayout layout = new BorderLayout();
//		setLayout(layout);
//		add(keyLabel, BorderLayout.NORTH);
//		add(keyText, BorderLayout.CENTER);
//	}
//	
//
//	@Override
//	public void keyTyped(KeyEvent e) 
//	{
//		//Not using this method	
//	}
//
//	@Override
//	public void keyPressed(KeyEvent e)
//	{
//		int keyCode = e.getKeyCode();
//		
//		if(keyCode==KeyEvent.VK_F)
//			keyLabel.setText("You pressed the fire key!");
//		else
//			keyLabel.setText("You pressed the wrong key!");
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) 
//	{
//		//Not using this method	
//	}
//
//	public static void main(String[] args) 
//	{
//		KeyListenersTutorial obj1 = new KeyListenersTutorial();
//	}
//}
