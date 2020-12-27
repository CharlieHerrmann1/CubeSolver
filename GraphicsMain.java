import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsMain extends JFrame{			
		public static void main(String[] args) 
		{	
			GraphicsMain window = new GraphicsMain();
	        JPanel p = new JPanel();
	        p.add(new GraphicsPanel());  //  add a class that extends JPanel
	        window.setTitle("Graphics with a KeyListener");
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        window.setContentPane(p);
	        window.pack();
	        window.setLocationRelativeTo(null);
	        window.setVisible(true);
		}
}