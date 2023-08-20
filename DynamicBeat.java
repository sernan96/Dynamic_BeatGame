package dynamic_beat_1;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	public DynamicBeat() {
		setTitle("Dynamic Beat");	
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_Height);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		introBackground = new ImageIcon(Main.class.getResource("introBackground.jpg")).getImage(); 
	}
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_Height);
		screenGraphic =screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0,null);
	}

	private void screenDraw(Graphics g) {//계속 이미지 보이게함
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}

}
