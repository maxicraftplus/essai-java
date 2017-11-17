package cours;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		
		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("MAXIME");
		window.setAlwaysOnTop(true);
		window.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.blue);
		
		Panel pan = new Panel();
		
		window.setContentPane(pan);
		window.setVisible(true);
	}
}

class Panel extends JPanel {
	public void paintComponent(Graphics g) {
		
			
			g.drawString("coucou", 100, 100);
			
		}
	}
